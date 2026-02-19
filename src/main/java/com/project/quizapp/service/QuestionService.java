package com.project.quizapp.service;

import com.project.quizapp.dao.QuestionDao;
import com.project.quizapp.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionDao questionDao;



    public ResponseEntity<List<Question>> getAllQuestions() {
        try {
            return new ResponseEntity<>(questionDao.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return  new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<List<Question>> getQuestionsByCategory(String category) {

        List<Question> questions = questionDao.findByCategory(category);

        if (questions.isEmpty()) {
            return ResponseEntity.noContent().build();   // 204
        }

        return ResponseEntity.ok(questions);             // 200
    }

    public ResponseEntity<String> addQuestion(Question quiz) {
            questionDao.save(quiz);
            return new ResponseEntity<>("Success", HttpStatus.CREATED);
    }

    public String deleteQuestionById(int id) {
        questionDao.deleteById(id);
        return "Question of ID: "+ id + " deleted";
    }
}
