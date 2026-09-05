package interfaceDemo;

import java.util.Scanner;

import interfaceDemo.MessageFactory.MessageService;
 class QSN02Interface 
{
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		sc.nextLine();
		System.out.println("enter the Message....");
		String msg=sc.nextLine();
		
		MessageService ms=MessageFactory.getImplementationObject(choice);
		NotificationService ns=new NotificationService();
		ns.notifyUser(ms,msg);
	}
}
/** System.01
*you have NotificationService class which depends on Interface 
*not on implementation classes
*
* where is the abstraction? what are we hiding from this System-01
* (NotificationService? 
* 
* answer: System-01 knows only interface and its methods. Here implementation of 
*                                                                                     
* */
class NotificationService 
{
	void notifyUser(MessageService service, String message)
	{
		if(service.sendMessage(message))
		{
			System.out.println("Notification sent Successfully");
			
		}
		else
		{
			System.out.println("Notification failed");
		}
	}
}
class MessageFactory
{
	public static MessageService getImplementationObject(int choice)
	{
		MessageService obj=null;
		switch(choice)
		{
		case 1 ->
		{
			obj= new EmailService();
		}
		case 2 ->
		{
			obj= new SMSService();
		}
		case 3 ->
		{
			obj= new WhatsappService();
		}	
	}
		return obj;
	}	
}
/** FACTOR CLASS
* factory class is a class which contains factory methods. 
* what is factory method 
* it is a static method which creates and returns the object of the implementation 
* classes of an interface.
*/
/** System.02
 * it defines the design with an interface and its implementation classes
 * */
//interface
	
interface MessageService
{
	boolean sendMessage(String message);
}

//implementation class-01

class EmailService  implements MessageService
{
	 public  boolean sendMessage(String message) //in interface all methods are public 
	 {
		 System.out.println("Sends Message via Email");
		return true;
	}
}

//implementation class-02

class SMSService  implements MessageService
{
	 public  boolean sendMessage(String message) //in interface all methods are public 
	 {
		 System.out.println("Sends Message via SMS");
		return true;
	}
}

//implementation class-03

class WhatsappService  implements MessageService
{
	 public  boolean sendMessage(String message) //in interface all methods are public 
	 {
		 System.out.println("Sends Message via Whatsapp");
		return true;
	}
}

