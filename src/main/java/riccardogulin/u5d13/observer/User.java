package riccardogulin.u5d13.observer;


import lombok.AllArgsConstructor;

@AllArgsConstructor
public class User implements Subscriber{
	private String name;
	private String surname;

	@Override
	public void receiveUpdate(String message) {
		System.out.println("Ciao sono " + this.name + " e ho appena ricevuto il seguente messaggio");
		System.out.println(message);
	}
}
