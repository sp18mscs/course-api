package com.appliedprogramming.springboot.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics= new ArrayList<Topic>(Arrays.asList(		
			 new Topic("Spring","Spring Framework","Spring Framework"),
			 new Topic("java","java course","java course"),
			 new Topic("node","node js","node js")		
			 
			 ));
	//All Topics
	public List<Topic> getAllTopics()
	{
	 return  topics;
	}
	
	//Single Topic
		public Topic getTopic(String id)
		{
			Topic topic=null;
			for (Topic t: topics) {
				if (t.getId().equals(id)) {
					topic=t;
					break;
				}
			}
			
		 return  topic;
		}
		
		//Add Topic
				public void addTopic(Topic topi)
				{
					topics.add(topi);
				}
				
				//Update Topic
				public void  updateTopic(String id, Topic topic)
				{
					for (int i=0; i< topics.size(); i++) {
						Topic t= topics.get(i);
						if (t.getId().equals(id)) {
							topics.set(i, topic);
							return;
						}
					}				
			
				}
				//Delete Topic
				public void  deleteTopic(String id)
				{
					for (int i=0; i< topics.size(); i++) {
						Topic t= topics.get(i);
						if (t.getId().equals(id)) {
							topics.remove(i);
							return;
						}
					}				
			
				}

}
