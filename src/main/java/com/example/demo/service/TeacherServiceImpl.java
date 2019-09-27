package com.example.demo.service;


import com.example.demo.models.Course;
import com.example.demo.models.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class TeacherServiceImpl implements TeacherService {

	@Autowired
	private RestTemplate clienteRest;

	@Override
	public List<Teacher> findAll() {
		List<Course> courses = Arrays.asList(clienteRest.getForObject("http://localhost:8001/course", Course[].class));

		return courses.stream().map(p -> new Teacher(p,"Angela","23","1")).collect(Collectors.toList());
	}

	@Override
	public Teacher findById(String idCourse, String nameTeacher) {
    Map<String, String> pathVariables= new HashMap<String, String>();
    pathVariables.put("id",idCourse);
		Course course = clienteRest.getForObject("http://localhost:8001/course/{id}",Course.class, pathVariables );
		return new Teacher(course,nameTeacher);
	}


}
