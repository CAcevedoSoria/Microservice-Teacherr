package com.example.demo.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Teacher {

	private Course course;
	private String nameTeacher;
	private String age;
	private String dictatedCourses;


	public Teacher(Course course, String nameTeacher) {
	}
}
