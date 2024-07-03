package riccardogulin.u5d13.observer;

import java.util.ArrayList;
import java.util.List;

public class Apple { // Publisher
	private List<Subscriber> subscriberList = new ArrayList<>();

	public void addSub(Subscriber subscriber){
		this.subscriberList.add(subscriber);
	}

	public void removeSub(Subscriber subscriber){
		this.subscriberList.remove(subscriber);
	}

	public void makeAnnouncment(String text){
		for (Subscriber subscriber: subscriberList){
			subscriber.receiveUpdate(text);
		}
	}
}
