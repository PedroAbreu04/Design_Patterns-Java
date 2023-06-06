package creational.factorymethod;

public class NotificationFactory {
	public static Notification createNotification(Notification.Type type) {
		switch(type) {
		
		case SMS: return new SMSNotification();
		case EMAIL : return new EmailNotification();
		case PUSH : return new PushNotification();
		default : throw new IllegalArgumentException("Unknown notification type");
		
		}
	}
}
