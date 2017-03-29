package message.receivers;
import message.Message;
import observer.Listener;

public class RadioStation implements Listener {

	private final String stationName = "Local Radio:";

	@Override
	public void update(Object providedContent) {
		if(providedContent instanceof Message){
			Message message = (Message) providedContent;
			System.out.println(stationName +"[" +message.messagePriority()+ "]"+ message.message());
		}
	}

}
