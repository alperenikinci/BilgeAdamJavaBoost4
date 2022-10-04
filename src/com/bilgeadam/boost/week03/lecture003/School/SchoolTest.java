package com.bilgeadam.boost.week03.lecture003.School;

public class SchoolTest {

	public static void main(String[] args) 
	{
		Teacher teacher = new Teacher();
		teacher.setId(134789);
		teacher.setName("Ahmet");
		teacher.setBranch("Maths");
		
		Course course = new Course();
		course.setLessonCode("213412");
		course.setLessonDescription("1st grade");
		
		Adress adress = new Adress();
		adress.setCity("Ankara");
		adress.setStreet("Cengiz Aytmatov");
		
		Student student = new Student();
		student.setName("Alperen");
		student.setCourse(course);
		student.setAdress(adress);
		student.setId(15124);
		
		System.out.println(student);
		System.out.println(teacher);
	}

}
