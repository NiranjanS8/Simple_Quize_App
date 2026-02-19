package com.project.quizapp.dao;

import com.project.quizapp.model.Question;
import com.project.quizapp.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuizDao extends JpaRepository<Quiz, Integer> {
}
