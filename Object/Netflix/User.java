package Object.Netflix;

public class User {
	String name;
	String pwd;
	long number;
	String emailID;
	User(String name,String pwd,long number,String emailID){
		this.name=name;
		this.pwd=pwd;
		this.number=number;
		this.emailID=emailID;
		System.out.println(this);
		
	}
}
