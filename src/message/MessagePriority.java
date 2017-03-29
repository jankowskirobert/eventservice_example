package message;

public enum MessagePriority {
	URGENT(1),
	IMPORTANT(2),
	STANDARD(3);
	private MessagePriority(int priority) {
		this.priority = priority;
	}
	public int priority;
}
