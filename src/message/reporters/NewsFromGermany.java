package message.reporters;

import java.util.ArrayList;
import java.util.List;

import message.Message;
import message.braodcaster.MessageBroadcaster;
import message.type.ImportantMessage;
import message.type.StandardMessage;
import message.type.UrgentMessage;

public class NewsFromGermany implements Reporter {
	private final String country = "Germany";
	private MessageBroadcaster broadcasterService;

	public NewsFromGermany(MessageBroadcaster broadcasterService) {
		super();
		this.broadcasterService = broadcasterService;
	}

	@Override
	public void publishMessage(String message) {
		broadcasterService.sendMessage(country + " says: " + message);
	}

	@Override
	public void publishMessage(List<String> messages) {
		messages.replaceAll(x->country+" says: "+x);
		broadcasterService.sendMessages(messages);

	}

}
