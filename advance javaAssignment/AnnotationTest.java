package test;



@interface Student{
	int rollno();
	String name();
}



public class AnnotationTest {
	public static void main(String args[]) {
	}
	@Student(rollno=1,name="Shrey")
	public String toString() {
		return "Overriden toString method";
	}

}
