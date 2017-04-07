package message.factory;

import message.Message;
import message.type.ImportantMessage;
import message.type.StandardMessage;
import message.type.UrgentMessage;

public class MessageFactory {
	public Message getMessage(String message) {
		if (message.contains("!!")) {
			return new UrgentMessage(message);
		} else if (message.endsWith("!")) {
			return new ImportantMessage(message);
		} else
			return new StandardMessage(message);
	}
}
