package message.type;

import message.Message;
import message.MessagePriority;

public class UrgentMessage implements Message {

	private String message;
	
	public UrgentMessage(String message) {
		this.message = message;
	}
	
	@Override
	public String message() {
		return message;
	}

	@Override
	public MessagePriority messagePriority() {
		return MessagePriority.URGENT;
	}

}
