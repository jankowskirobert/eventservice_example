package message;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import observer.Subject;

// naming concept: might be also MessageReporter
public class MessageBroadcaster extends Subject {

	public void sendMessage(Message message) {
		setState();
		notifyListeners(message);
	}

	public void sendMessages(List<Message> messages) {
		Comparator<Message> comparePriority = (m1, m2) -> Integer.compare(m1.messagePriority().priority,
				m2.messagePriority().priority);
		messages.sort(comparePriority);
		for (Message message : messages) {
			setState();
			notifyListeners(message);
		}
	}
}
