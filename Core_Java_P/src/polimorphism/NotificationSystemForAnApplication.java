package polimorphism;

import java.util.Scanner;

public class NotificationSystemForAnApplication {
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the type of notification");
		int nt=sc.nextInt();
		sc.nextLine();
		System.out.println("enter the message ");
		String message=sc.nextLine();
		Notification n;
		if(nt==1)
		{
			n=new EmailNotification();
		}
		else if(nt==2)
		{
			n=new SMSNotification();
		}
		else
		{
			System.out.println("Invalid notification type");
			return;
		}
		if(message.isEmpty())
		{
			System.out.println("Error: Message cannot be empty");
		}
		else {
			n.send(message);
		}
	}
	
}
interface Notification
{
	public void send (String message);

}
class EmailNotification implements Notification
{
	public void send(String message)
	{
		System.out.println("Email sent: "+message);
	}
}
class SMSNotification implements Notification
{
	public void send(String message)
	{
		System.out.println("SMS sent: "+message);
	}
}

