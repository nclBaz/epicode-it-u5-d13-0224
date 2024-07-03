package riccardogulin.u5d13.chainofresponsibility;

public class LoggerFilter extends BaseFilter{
	@Override
	public void doWork(User user) {
		System.out.println("Ho ricevuto questo utente " + user);
		this.goNext(user);
	}
}
