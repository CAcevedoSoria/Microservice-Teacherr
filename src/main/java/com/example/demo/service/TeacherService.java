package com.example.demo.service;

import com.example.demo.models.Teacher;

import java.util.List;

public interface TeacherService {

	public List<Teacher> findAll();
	public Teacher findById( String idCourse ,String nameTeacher);
}
