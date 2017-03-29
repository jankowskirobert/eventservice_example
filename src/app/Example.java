package app;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

import message.Message;
import message.MessageBroadcaster;
import message.receivers.RadioStation;
import message.receivers.TVStation;
import message.type.ImportantMessage;
import message.type.StandardMessage;
import message.type.UrgentMessage;
import observer.Subject;

public class Example {
	public static void main(String[] args) {
		MessageBroadcaster broadcaster = new MessageBroadcaster();
		broadcaster.addListener(new TVStation());
		broadcaster.addListener(new RadioStation());
		List<Message> news = new ArrayList<Message>();
		news.add(new ImportantMessage("Vulcano eruption"));
		news.add(new StandardMessage("Car accident"));
		news.add(new UrgentMessage("Bug in code"));
		broadcaster.sendMessages(news);
		
	}
}
