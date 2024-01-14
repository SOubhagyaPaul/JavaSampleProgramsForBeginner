package day3;
/*
 * An educational institution wishes to maintain a database of its employees. 
 * The database is divided into a number of classes whose hierarchical 
 * relationships are shown below. Write all the classes and defines the 
 * methods to create the database and retrieve individual information as and when needed.
Write a driver program to test the classes.
Staff (code, name)
Teacher (subject, publication) is a Staff
Officer (grade) is a Staff
Typist (speed) is a Staff
RegularTypist (remuneration) is a Typist
CasualTypist (daily wages) is a Typist.
*/
class Staff{
	String code,name;
	Staff(String code, String name){
		this.code=code;
		this.name=name;
	}
	void display() {
	        System.out.println("Code: " + code);
	        System.out.println("Name: " + name);
	    }
}
class Teacher extends Staff{
	String subject,publication;
	Teacher(String code, String name,String subject, String publication){
		super(code,name);
		this.subject=subject;
		this.publication=publication;
	}
	void display() {
        super.display();
        System.out.println("Subject: " + subject);
        System.out.println("Publication: " + publication);
    }
}
class Officer extends Staff{
	String grade;
	Officer(String code, String name,String grade){
		super(code,name);
		this.grade=grade;
	}
	void display() {
        super.display();
        System.out.println("Grade: " + grade);
    }
}
class Typist extends Staff{
	float speed;
	Typist(String code, String name,float speed){
		super(code, name);
		this.speed=speed;
	}
	void display() {
        super.display();
        System.out.println("Speed: " + speed);
    }
}
class RegularTypist extends Typist{
	float remuneration;
	RegularTypist(String code, String name,float speed,float remuneration){
		super(code,name,speed);
		this.remuneration=remuneration;
	}
	void display() {
        super.display();
        System.out.println("Remuneration: " + remuneration);
    }
}
class CasualTypist extends Typist{
	float dailyWages;
	CasualTypist(String code, String name,float speed,float dailyWages){
		super(code,name,speed);
		this.dailyWages=dailyWages;
	}
	void display() {
        super.display();
        System.out.println("Daily Wages: " + dailyWages);
    }
}


public class Prblm4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staff obj;
		System.out.println("The details of Teacher:");
		obj=new Teacher("MCA01","AAA","Programming language","Springer");
		obj.display();
		System.out.println();
		System.out.println("The details of Officer:");
		obj=new Officer("ADM11","BBB","GR A");
		obj.display();
		System.out.println();
		System.out.println("The details of Regular typist:");
		obj=new RegularTypist("TYP02","CCC",30,1300);
		obj.display();
		System.out.println();
		System.out.println("The details of Casual typist:");
		obj=new CasualTypist("TYP03","DDD",50,130);
		obj.display();
		

	}

}

/*
 * The details of Teacher:
Code: MCA01
Name: AAA
Subject: Programming language
Publication: Springer

The details of Officer:
Code: ADM11
Name: BBB
Grade: GR A

The details of Regular typist:
Code: TYP02
Name: CCC
Speed: 30.0
Remuneration: 1300.0

The details of Casual typist:
Code: TYP03
Name: DDD
Speed: 50.0
Daily Wages: 130.0

*/
