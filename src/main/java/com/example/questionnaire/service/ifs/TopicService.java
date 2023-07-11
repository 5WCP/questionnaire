package com.example.questionnaire.service.ifs;

import com.example.questionnaire.request.TopicRequest;
import com.example.questionnaire.response.TopicResponse;

public interface TopicService { 
	
	public TopicResponse addTopic(TopicRequest request);
	
	public TopicResponse reviseTopic(TopicRequest request);
	
	public TopicResponse deleteTopic(TopicRequest request);
	
	public TopicResponse searchAllTopic();
	
	public TopicResponse getTopicInfo(TopicRequest request);
}
