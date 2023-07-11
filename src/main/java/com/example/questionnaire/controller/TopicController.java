package com.example.questionnaire.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.questionnaire.request.TopicRequest;
import com.example.questionnaire.response.TopicResponse;
import com.example.questionnaire.service.ifs.TopicService;

@CrossOrigin
@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@PostMapping("add_topic")
	public TopicResponse addTopic(@RequestBody TopicRequest request) {
		return topicService.addTopic(request);
	}
	
	@PostMapping("search_all_topic")
	public TopicResponse searchAllTopic() {
		return topicService.searchAllTopic();
	}
	
	@PostMapping("get_topic_info")
	public TopicResponse getTopicInfo(@RequestBody TopicRequest request) {
		return topicService.getTopicInfo(request);
	}
}
