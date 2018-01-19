package dao;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import model.Student;

public class StudentDAO {

	private  Map<Integer,Student> studentList;
	static {
		
	}
	@SuppressWarnings("deprecation")
	public StudentDAO() {
		// TODO Auto-generated constructor stub
		studentList=new HashMap<Integer,Student>();
		studentList.put(1,new Student(1, "Shrey", "Pasari", "delhi", new Date(1994, 02, 19), 9811622052, 6, "cse"));
		studentList.put(2,new Student(2, "Rahul", "Pareek", "jaipur", new Date(1993, 12, 14), 9911023876, 4, "ec"));
		studentList.put(3,new Student(3, "anubhav", "gupta", "bhopal", new Date(1992, 9, 2), 8802342341, 5, "cse"));
		studentList.put(4,new Student(4, "Atul", "agrawal", "bangalore", new Date(1994, 4, 11), 12325, 7, "civil"));
		studentList.put(5,new Student(5, "vaibhav", "paharia", "jabalpur", new Date(1994, 3, 26), 45321, 8, "cse"));
	}

	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		if(studentList.get(student.getRollNo())!=null)
		return null;
		studentList.put(student.getRollNo(), student);
		return studentList.get(student.getRollNo());
	}

	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		if(studentList.get(student.getRollNo())==null)
			return null;
		studentList.put(student.getRollNo(), student);	
		
		return studentList.get(student.getRollNo());

	}

	public Student getStudent(int rollNo) {
		// TODO Auto-generated method stub
		if(studentList.get(rollNo)==null)
			return null;
			
		
		return studentList.get(rollNo);
	}

	

	public Student deleteStudent(int rollNo) {
		// TODO Auto-generated method stub
		if(studentList.get(rollNo)==null)
			return null;
		Student stud=studentList.remove(rollNo);
		return stud;
	}

}
