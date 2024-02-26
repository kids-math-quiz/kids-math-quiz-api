package com.kidsmathquiz.kidsmathquizapi;

import java.util.Date;

public interface GeneralGenericsInterfacesAllProject {
    void teacherSignUp(String name, String email, String password, Date birthday);

    void teacherSignIn(String email, String password);

    Integer teacherCreateQuiz(String title);

    Integer teacherCreateQuestionsInQuiz(Integer quizId, Integer numberQuestion, String description, Date expireTime);

    Integer teacherCreateAlternativesInQuestions(Integer questionId, String description);

    void teacherCreateCorrectAnswerInAlternatives(Integer alternativeId);

    Integer teacherPublishQuiz(Integer quizId);

    void studentConnectToQuiz(Integer quizPin, String name);

    void teacherStartQuiz(Integer quizId);

    void studentAnsweredQuestion(Integer questionId, Integer alternativeId, Integer studentId);

    void teacherFinishedQuiz(Integer quizId);

    /**
     * the quiz knows the student who are in it from the studentConnectToQuiz
     *
     * @param quizId
     */
    void teacherGetQuizResults(Integer quizId);
}