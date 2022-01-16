package com.syed.osama.hassan.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.syed.osama.hassan.model.Course;

public interface CourseRepo extends CrudRepository<Course, String>
{
	public List<Course> findByTopicId(String topicId);
}
