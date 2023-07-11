package com.example.questionnaire.request;

import com.example.questionnaire.entity.Topic;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TopicRequest {
	
	@JsonProperty("topic")
	private Topic topic;

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	
}
