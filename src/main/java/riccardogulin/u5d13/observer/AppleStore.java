package riccardogulin.u5d13.observer;

public class AppleStore implements Subscriber{
	private String address;

	@Override
	public void receiveUpdate(String message) {

		System.out.println("Apple Store -- Nuovo messaggio: ");
		System.out.println(message);
	}
}
