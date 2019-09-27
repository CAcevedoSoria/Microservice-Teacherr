package com.example.demo.controller;

import com.example.demo.models.Teacher;
import com.example.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {

	@Autowired
	private TeacherService teacherService;

	@GetMapping("/listar")
	public List<Teacher> listar(){

		return teacherService.findAll();
	}

	@GetMapping("/course/{id}/name/{name")
	public Teacher detalle(@PathVariable String idCourse, @PathVariable String name ){

		return teacherService.findById(idCourse, name);
	}



}
