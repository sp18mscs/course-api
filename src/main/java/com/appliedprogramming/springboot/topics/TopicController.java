package com.appliedprogramming.springboot.topics;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TopicController {

	@Autowired
	private TopicService topicservice;	
	
	//All Topics
	@RequestMapping("/topics")
	public List<Topic> getAllTopics()
	{
	 return topicservice.getAllTopics();
			
	}
	
	//Single Topic
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id)
	{
	 return topicservice.getTopic(id);
			
	}
	//Add Topic
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void addTopic (@RequestBody Topic topic) {
		topicservice.addTopic(topic);
		
	}
	
	//update Topic
		@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
		public void updateTopic (@PathVariable String id, Topic topic) {
			topicservice.updateTopic(id, topic);
			
		}
		
		//delete Topic
				@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
				public void deleteTopic (@PathVariable String id, Topic topic) {
					topicservice.deleteTopic(id);
					
				}
}


