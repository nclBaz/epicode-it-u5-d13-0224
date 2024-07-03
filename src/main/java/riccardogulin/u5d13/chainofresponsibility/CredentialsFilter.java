package riccardogulin.u5d13.chainofresponsibility;

public class CredentialsFilter extends BaseFilter{
	@Override
	public void doWork(User user) {
		if(user.getPassword().equals("1234") && user.getEmail().equals("admin@gmail.com")){
			System.out.println("Credenziali corrette");
			this.goNext(user);
		} else {
			System.out.println("Credenziali non corrette!");
		}
	}
}
