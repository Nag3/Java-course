public class OverrideTest {
//Object slicing....
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Founder f = new Founder();
		Death d=new Death();
		Thought t=new Thought();
		Idea i=new Idea();
		f.breathIn();
		f.breathOut();
		f.fear(d);
		f.reproduction();
		f.eat();
		f.sleep();
		f.giveBirth();
		f.think(t);
		f.active();
		
		f.work();
		f.execute();
		f.manage();
		f.direct();
		f.found();
	}

}

class LivingBeing
{
	void breathIn() { 
		System.out.println("Living Being is inhaling...");
	}
	void breathOut() { 
		System.out.println("Living Being is exhaling...");
	}
}
class Tree extends LivingBeing
{
	
}
class Heart
{
	void pumping() { 
		System.out.println("Heart is pumping blood..");
	}
}
class Death {
 void dead() {
	 System.out.println("dead");
 }
}
class Animal extends LivingBeing
{
	Heart h = new Heart(); //hasA
	
	void fear(Death d) {
		System.out.println("fear of death...");
	}
	void eat() {
		System.out.println("eating.......");
	}
	void sleep() {
		System.out.println("sleeping......");
	}
	void reproduction() {
		System.out.println("reproduction......");
	}
}
class Mammal extends Animal
{
	void giveBirth() {
		System.out.println("Mammal is giving birth....");
	}
}
class Reptile extends Animal
{
	void layEggs() {
		System.out.println("Reptile is laying eggs....");
	}
}
class Human extends Mammal
{
	Idea think(Thought t) {
		System.out.println("Human is thinking.....");
		Idea i=new Idea();
		return i;
	}
}
class Thought{
	
}
class Idea
{
	void ideation() {
		System.out.println("Idea ....");
	}
}
class Person extends Human
{
	void active() {
		System.out.println("Person is active......");	
	}
}
class Student extends Person
{
	Result giveExam(ExamPaper e) {
		Result r=new Result();
		return r;
	}
}
class Result{
	
}
class ExamPaper{
	
}
class Employee extends Student
{
	void work() {
		System.out.println("Employee is working......");
	}
}
class Executive extends Employee
{
	void execute() {
		System.out.println("Executive is executing......");
	}
}
class Manager extends Executive
{
	void manage() {
		System.out.println("Maanger is managing...");
	}
}
class Director extends Manager
{
	void direct() {
		System.out.println("Director is directing...");
	}
}

class Founder extends Director
{
	void found() {
		System.out.println("Found a company.....");
		
	}
}