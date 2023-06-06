package creational.factorymethod;

import creational.factorymethod.Notification.Type;

public class App {

	public static void main(String[] args) {
//		String type = args[0];
//		Notification n;
//		if("email".equals(type)) {
//			n = new EmailNotification();
//		} else if("sms".equals(type)) {
//			n = new SMSNotification();
//		}else{
//			n = new PushNotification();
//		}
//		
//		n.notifyUser();
		
		Notification n = NotificationFactory.createNotification(Type.SMS);
		n.notifyUser();
	}

}
