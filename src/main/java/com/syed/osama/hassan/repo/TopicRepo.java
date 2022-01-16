package com.syed.osama.hassan.repo;

import org.springframework.data.repository.CrudRepository;

import com.syed.osama.hassan.model.Topic;

/**
 * Provides CRUD functionality
 * 
 * @author osama
 *
 */
public interface TopicRepo extends CrudRepository<Topic, String>
{

}
