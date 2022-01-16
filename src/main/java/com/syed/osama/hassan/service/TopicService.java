package com.syed.osama.hassan.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syed.osama.hassan.model.Topic;
import com.syed.osama.hassan.repo.TopicRepo;

/**
 * Business logic layer of Topic 
 * 
 * @author osama
 *
 */
@Service
public class TopicService
{
	
	@Autowired
	private TopicRepo topicRepo;
	
	/**
	 * Get all topics from Database
	 * 
	 * @return
	 */
	public List<Topic> getAllTopics()
	{
		List<Topic> listOfTopics = new ArrayList<Topic>();
		
		topicRepo.findAll().forEach(listOfTopics::add);
		
		return listOfTopics;
	}
	
	/**
	 * Get topic by topic id from database
	 * 
	 * @param id
	 * @return
	 */
	public Topic getTopic(String id)
	{
		return topicRepo.findById(id).orElse(null);
	}

	/**
	 * Add new topic in database
	 * 
	 * @param topic
	 */
	public void addTopic(Topic topic) 
	{
		topicRepo.save(topic);
	}

	/**
	 * Update existing topic
	 * 
	 * @param id
	 * @param topic
	 */
	public void updateTopic(String id, Topic topic) 
	{
		topicRepo.save(topic);
	}

	/**
	 * Delete topic from database
	 * 
	 * @param id
	 */
	public void deleteTopic(String id) 
	{
		topicRepo.deleteById(id);
	}
	
}
