package homework1;

public class Main {
	

	public static void main(String[] args) {
		Course course1 =new Course();
		course1.id=1;
		course1.name="Yaz�l�m geli�tirici yeti�tirme kamp� C#, Angular";
		course1.unitPrice=0;
		course1.teacherAdi="Engin DEM�RO�";
		
		Course course2 =new Course();
		course2.id=2;
		course2.name="Yaz�l�m geli�tirici yeti�tirme kamp� Java, React";
		course2.unitPrice=0;
		course2.teacherAdi="Engin DEM�RO�";
		
		Course course3 =new Course();
		course3.id=3;
		course3.name="Programlamaya giri� i�in temel kurs";
		course3.unitPrice=0;
		course3.teacherAdi="Engin DEM�RO�";
			
			Course[] courses= {course1, course2, course3};
			for (Course course : courses) {
				
				System.out.println(course.name);
			}
			
			System.out.println(courses.length);
			CourseManager courseManager= new CourseManager();
			courseManager.addCourse(course1);
			courseManager.addCourse(course2);
			courseManager.addCourse(course3);

			


	}

}
