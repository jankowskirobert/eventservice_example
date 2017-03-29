package message.type;

import message.Message;
import message.MessagePriority;

public class StandardMessage implements Message {
	private String message;

	public StandardMessage(String message) {
		this.message = message;
	}

	@Override
	public String message() {
		return message;
	}

	@Override
	public MessagePriority messagePriority() {
		return MessagePriority.STANDARD;
	}

}
