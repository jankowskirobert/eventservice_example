package message.braodcaster;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import message.Message;
import message.factory.MessageFactory;
import observer.Subject;

public class EuropeMessageBroadcaster extends Subject implements MessageBroadcaster {

	private final MessageFactory factory;

	public EuropeMessageBroadcaster(MessageFactory factory) {
		super();
		this.factory = factory;
	}

	@Override
	public void sendMessage(String message) {
		setState();
		notifyListeners(factory.getMessage(message));
	}

	@Override
	public void sendMessages(List<String> messages) {
		List<Message> parsedMessages = new ArrayList<>();
		messages.forEach(x -> {
			parsedMessages.add(factory.getMessage(x));
		});

		Comparator<Message> comparePriority = (m1, m2) -> Integer.compare(m1.messagePriority().priority,
				m2.messagePriority().priority);
		parsedMessages.sort(comparePriority);
		for (Message message : parsedMessages) {
			setState();
			notifyListeners(message);
		}

	}
}
