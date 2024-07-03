package riccardogulin.u5d13.chainofresponsibility;

public class AuthorizationFilter extends BaseFilter{
	@Override
	public void doWork(User user) {
		if(user.getRole().equals("ADMIN")){
			System.out.println("Benvenuto admin!");
			this.goNext(user);
		} else {
			System.out.println("Solo gli admin possono accedere");
		}
	}
}
