package homework2;

public class InstructorManager {
	public void addInstructor(Instructor �nstructor) {
		System.out.println("E�itmen kaydedildi: "+�nstructor.getName()+" "+�nstructor.getLastname());
	}
	public void deleteInstructor(Instructor �nstructor) {
		System.out.println("E�itmen kayd� silindi.");
	}
	public void updateInstructor(Instructor �nstructor) {
		System.out.println("E�itmen kayd� g�ncellendi: "+�nstructor.getName()+" "+�nstructor.getLastname());
	}
	public void passwordInstructor(Instructor �nstructor) {
		System.out.println("E�itmen �ifresi kaydedildi "+�nstructor.getPassword());
	}



}
