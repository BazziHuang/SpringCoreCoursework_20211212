package pers.tzuchiehhuang.coursework.SpringCoreCoursework_20211212.coursework_2.Exception;

public class PersonFormatException extends PersonException{
	
	public PersonFormatException(String message) {
		super(message);
	}
	
	public String toString() {
		return getMessage();
	}

}
