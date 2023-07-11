package com.example.questionnaire.response;

import java.util.ArrayList;
import java.util.List;

public class TopicResponse {
	
	private String message;
	
	private List<TopicInfo> topicInfoList = new ArrayList<>();

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<TopicInfo> getTopicInfoList() {
		return topicInfoList;
	}

	public void setTopicInfoList(List<TopicInfo> topicInfoList) {
		this.topicInfoList = topicInfoList;
	}

	public TopicResponse() {
		
	}

	public TopicResponse(String message) {
		this.message = message;
	}

	public TopicResponse(List<TopicInfo> topicInfoList) {
		this.topicInfoList = topicInfoList;
	}

}
