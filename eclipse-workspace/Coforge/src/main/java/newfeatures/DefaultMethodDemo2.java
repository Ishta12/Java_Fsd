package newfeatures;

import java.time.LocalDate;

interface Parser{

default void parse(){
	
		System.out.println("default Parsing logic");
	}

static void displayDate() {
	System.out.println(LocalDate.now());
	
} 
}

class TextParser implements Parser
{
	//inherit default implementation of Parse
}

class XMLParser implements Parser
{
	public void parse() {
		System.out.println("Parsing XML fles");
	}
}
public class DefaultMethodDemo2 {

	public static void main(String[] args) {
		Parser P = new TextParser(); // up casting
		P.parse(); // invoke default method in interface

		P= new XMLParser();
		P.parse();

		System.out.println("Program executed at :");
		Parser.displayDate(); // invoke static method

	}
		}