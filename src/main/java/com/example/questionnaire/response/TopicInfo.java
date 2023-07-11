package com.example.questionnaire.response;

import java.time.LocalDate;

public class TopicInfo {
	
	private Long topicId;
	
	private String topicName;
	
	private String state;
	
	private LocalDate startTime;
	
	private LocalDate endTime;

	public Long getTopicId() {
		return topicId;
	}

	public void setTopicId(Long topicId) {
		this.topicId = topicId;
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public LocalDate getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDate startTime) {
		this.startTime = startTime;
	}

	public LocalDate getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalDate endTime) {
		this.endTime = endTime;
	}

	public TopicInfo() {
		
	}

	public TopicInfo(Long topicId, String topicName, String state, LocalDate startTime, LocalDate endTime) { // 所有問卷列表資訊
		this.topicId = topicId;
		this.topicName = topicName;
		this.state = state;
		this.startTime = startTime;
		this.endTime = endTime;
	}
		
}
