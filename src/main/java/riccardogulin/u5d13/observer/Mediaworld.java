package riccardogulin.u5d13.observer;

public class Mediaworld implements Subscriber {
	public String phoneNumber;

	@Override
	public void receiveUpdate(String message) {
		System.out.println("Mediaworld -- Nuovo messaggio: ");
		System.out.println(message);
	}
}
