package com.project.quizapp.controller;


import com.project.quizapp.model.Question;
import com.project.quizapp.service.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @PostMapping("/addQuestion")
    public Question addQuestion(@RequestBody Question quiz) {
        return questionService.addQuestion(quiz);
    }

    @GetMapping("/allQuestions")
    public List<Question> getAllQuestions(){
        return questionService.getAllQuestions();
    }

    @GetMapping("/category/{category}")
    public List<Question> getQuestionsByCategory(@PathVariable String category){
        return questionService.getQuestionsByCategory(category);
    }

    @DeleteMapping("/delete/{id}")
    public String getQuestionsByCategory(@PathVariable int id){
        return questionService.deleteQuestionById(id);
    }





}
