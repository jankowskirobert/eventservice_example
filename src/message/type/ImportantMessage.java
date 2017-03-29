package message.type;

import message.Message;
import message.MessagePriority;

public class ImportantMessage implements Message {

	private String message;
	
	public ImportantMessage(String message) {
		this.message = message;
	}
	
	@Override
	public String message() {
		return message;
	}

	@Override
	public MessagePriority messagePriority() {
		return MessagePriority.IMPORTANT;
	}

}
