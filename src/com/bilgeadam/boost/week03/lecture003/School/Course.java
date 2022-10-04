package com.bilgeadam.boost.week03.lecture003.School;

public  class Course 
{
	private String lessonCode;
	private String lessonDescription;
	
	
	
	public Course() {}

	public Course(String lessonCode, String lessonDescription) {
		super();
		this.lessonCode = lessonCode;
		this.lessonDescription = lessonDescription;
	}
	
	public String getLessonCode() {
		return lessonCode;
	}
	public void setLessonCode(String lessonCode) {
		this.lessonCode = lessonCode;
	}
	public String getLessonDescription() {
		return lessonDescription;
	}
	public void setLessonDescription(String lessonDescription) {
		this.lessonDescription = lessonDescription;
	}

	@Override
	public String toString() {
		return "Course [lessonCode=" + lessonCode + ", lessonDescription=" + lessonDescription + "]";
	}
	
	
}
