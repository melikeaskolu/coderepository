package homework2;

public class StudentManager {
	public void addStudent(Student student) {
		System.out.println("��renci kaydedildi: "+student.getName()+" "+student.getLastname());
	}
	public void deleteStudent(Student student) {
		System.out.println("��renci kayd� silindi.");
	}
	public void updateStudent(Student student) {
		System.out.println("��renci kayd� g�ncellendi:"+student.getName()+" "+student.getLastname());
	}
	public void passwordStudent(Student student) {
		System.out.println("��renci �ifresi kaydedildi "+student.getPassword());
	}
	public void courseStudent(Student student) {
		System.out.println("kaydoldu�unuz kurs: " +student.getStudentCourse());
	}


}
