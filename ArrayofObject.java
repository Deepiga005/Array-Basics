package JavaProgm;
class Student{
	public int id;
	public String name;
	Student(int id,String name)//p constructor
	{
		this.id=id;
		this.name=name;
	}
	public void display() {
		System.out.println("student id:"+" "+id+","+"name:"+" "+name);
	}
}

public class ArrayofObject {

	public static void main(String[] args) {
		// array of objects
		Student[] arr=new Student[3];;//array of objects
		arr[0]=new Student(100,"malar");
		arr[1]=new Student(101,"joseph");
		arr[2]=new Student(102,"george");
		
		System.out.println("Student data arr0");
		arr[0].display();
		System.out.println("Student data arr1");
		arr[1].display();
		System.out.println("Student data arr2");
		arr[2].display();
	}
}
