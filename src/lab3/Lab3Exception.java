package lab3;

public class Lab3Exception extends Exception {
	
	//field
	String message;
	
	//constructor
	Lab3Exception(String message){
		this.message = message;
	}

}

public abstract class SpecialNumber{
	
	//abstract method called add
	abstract SpecialNumber add(SpecialNumber special_number);
	
	//abstract method called divideByInt
	abstract SpecialNumber divideByInt
}
