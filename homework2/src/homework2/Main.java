package homework2;

public class Main {

	public static void main(String[] args) {
Student student1 = new Student(1 ,"Melike", "A�IKO�LU", "melikeaskolu621@gmail.com", " ", "java kursu", "1", " ");
		
		StudentManager studentManager = new StudentManager();
		studentManager.addStudent(student1);
		studentManager.passwordStudent(student1);
		studentManager.courseStudent(student1);
		studentManager.deleteStudent(student1);

		Student student2 = new Student();
		student2.setId(2);
		student2.setName("Ela");
		student2.setLastname("BULGAN");		
		student2.setEmail("elablgn11@gmail.com");
		student2.setPassword(" ");
		
		StudentManager studentManager1 = new StudentManager();
		studentManager.updateStudent(student2);
		
		System.out.println("-----------------");
		
		Instructor �nstructor1 = new Instructor();
		�nstructor1.setId(1);
		�nstructor1.setName("Engin");
	    �nstructor1.setLastname("DEM�RO�");
	    �nstructor1.setEmail("engindmrog06@gmail.com");
	    �nstructor1.setPassword(" ");
	    
		Instructor �nstructor2 = new Instructor();
		�nstructor2.setId(2);
		�nstructor2.setName("ENG�N");
	    �nstructor2.setLastname("DEM�RO�");
	    �nstructor2.setEmail("engindmrog06@gmail.com");
	    �nstructor2.setPassword(" ");
	    
	    
	    InstructorManager �nstructorManager = new InstructorManager();
	    �nstructorManager.addInstructor(�nstructor1);
	    �nstructorManager.passwordInstructor(�nstructor1);
	    �nstructorManager.deleteInstructor(�nstructor1);

	    
	    InstructorManager InstructorManager2 = new InstructorManager();
	    InstructorManager2.updateInstructor(�nstructor2);




	}

}
