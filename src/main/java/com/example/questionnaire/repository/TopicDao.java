package com.example.questionnaire.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.questionnaire.entity.Topic;

public interface TopicDao extends JpaRepository<Topic, Long> {
	
}
