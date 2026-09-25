package polimorphism;

import java.util.Scanner;

public class CourseContentManagementSystem {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		  Video v = new Video("java OOP",45);
	        Article a = new Article("Java Inheritane","james Gosling");
	        Quiz q = new Quiz("java Quiz",29);

	        CourseManager manager = new CourseManager();

	        manager.processContent(v);
	        manager.processContent(a);
	        manager.processContent(q);

	        manager.processMultipleContents(v, a, q);
	}
}
class CourseContent
{
	private String title;

	public CourseContent(String title) {
		super();
		this.title = title;
	}
	public String getTitle()
	{
		return title;
	}
}
class Video extends CourseContent
{
	private int duration;

	public Video(String title, int duration) {
		super(title);
		this.duration = duration;
	}

	public int getDuration() {
		return duration;
	}

}
class Article extends CourseContent
{
	private String author;

	public Article(String title, String author) {
		super(title);
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}	
}
class Quiz extends CourseContent
{
	private int NumOfQuesion;

	public Quiz(String title, int numOfQuesion) {
		super(title);
		NumOfQuesion = numOfQuesion;
	}

	public int getNumOfQuesion() {
		return NumOfQuesion;
	}
}
class CourseManager
{
	public void processContent(CourseContent content)
	{
		if(content instanceof Video)
        {
            System.out.println("Processing Video");
        }
        else if(content instanceof Article)
        {
            System.out.println("Processing Article");
        }
        else if(content instanceof Quiz)
        {
            System.out.println("Processing Quiz");
        }
        else
        {
            System.out.println("Unknown Content");
        }
	}
	public void processMultipleContents(CourseContent... contents)
    {
        for(CourseContent content : contents)
        {
            processContent(content);
        }
    }
}
