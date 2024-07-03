package riccardogulin.u5d13.chainofresponsibility;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ChainRunner implements CommandLineRunner {
	@Override
	public void run(String... args) throws Exception {
		User user = new User("admin@gmail.com", "1234", "ADMIN");

		LoggerFilter loggerFilter = new LoggerFilter();
		CredentialsFilter credentialsFilter = new CredentialsFilter();
		AuthorizationFilter authorizationFilter = new AuthorizationFilter();

		// Imposto l'ordine degli elementi della catena
		authorizationFilter.setNext(credentialsFilter);
		credentialsFilter.setNext(loggerFilter);

		authorizationFilter.doWork(user);
	}
}
