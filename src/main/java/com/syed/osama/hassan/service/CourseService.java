package com.syed.osama.hassan.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syed.osama.hassan.model.Course;
import com.syed.osama.hassan.repo.CourseRepo;

@Service
public class CourseService
{
	@Autowired
	private CourseRepo courseRepo;
	
	/**
	 * Get all topics from Database
	 * 
	 * @return
	 */
	public List<Course> getAllCourses(String id)
	{
		List<Course> listOfCourses = new ArrayList<>();
		
		courseRepo.findByTopicId(id).forEach(listOfCourses::add);
		
		return listOfCourses;
	}
	
	/**
	 * Get topic by topic id from database
	 * 
	 * @param id
	 * @return
	 */
	public Course getCourse(String id)
	{
		return courseRepo.findById(id).orElse(null);
	}

	/**
	 * Add new topic in database
	 * 
	 * @param topic
	 */
	public void addCourse(Course course) 
	{
		courseRepo.save(course);
	}

	/**
	 * Update existing topic
	 * 
	 * @param id
	 * @param topic
	 */
	public void updateCourse(Course course) 
	{
		courseRepo.save(course);
	}

	/**
	 * Delete topic from database
	 * 
	 * @param id
	 */
	public void deleteCourse(String id) 
	{
		courseRepo.deleteById(id);
	}
}
