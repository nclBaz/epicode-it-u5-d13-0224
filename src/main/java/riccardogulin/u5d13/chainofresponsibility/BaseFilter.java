package riccardogulin.u5d13.chainofresponsibility;

import lombok.Setter;

@Setter
public abstract class BaseFilter {
	private BaseFilter next;

	public abstract void doWork(User user);

	public void goNext(User user){
		if(this.next != null){ // Se non siamo ancora alla fine della catena
			// andiamo al prossimo filtro
			this.next.doWork(user);
		} else { // Siamo arrivati alla fine della catena
			System.out.println("Siamo arrivati alla fine della catena");
		}
	}
}
