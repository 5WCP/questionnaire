package com.example.questionnaire.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.example.questionnaire.entity.Topic;
import com.example.questionnaire.repository.TopicDao;
import com.example.questionnaire.request.TopicRequest;
import com.example.questionnaire.response.TopicInfo;
import com.example.questionnaire.response.TopicResponse;
import com.example.questionnaire.service.ifs.TopicService;

@Service
public class TopicServiceImpl implements TopicService {
	
	@Autowired
	private TopicDao topicDao;

	@Override
	public TopicResponse addTopic(TopicRequest request) {
		if(!StringUtils.hasText(request.getTopic().getTopicName())) {
			return new TopicResponse("請輸入問卷名");
		}
		topicDao.save(request.getTopic());
		return new TopicResponse("問卷新增成功");
	}

	@Override
	public TopicResponse reviseTopic(TopicRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TopicResponse deleteTopic(TopicRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TopicResponse searchAllTopic() {
		List<Topic> allTopic = new ArrayList<>();
		List<TopicInfo> allTopicInfo = new ArrayList<>();
		allTopic = topicDao.findAll();
		for(Topic topic : allTopic) {
			allTopicInfo.add(new TopicInfo(topic.getTopicId(), topic.getTopicName(), topic.getState(), topic.getStartTime(), 
					topic.getEndTime()));
		}
		return new TopicResponse(allTopicInfo);
	}

	@Override
	public TopicResponse getTopicInfo(TopicRequest request) {
		Topic reqTop = topicDao.findById(request.getTopic().getTopicId()).get();
		return null;
	}

}
