package com.muhammet.icerikyonetimi;

import com.muhammet.icerikyonetimi.repository.entity.Answers;
import com.muhammet.icerikyonetimi.repository.entity.Questions;
import com.muhammet.icerikyonetimi.service.AnswersService;
import com.muhammet.icerikyonetimi.service.QuestionsService;

public class Icerikyonetimi {

	public static void main(String[] args) {

		Answers answers = new Answers(null, "donuyor", null, null, null, null);
		Questions questions = new Questions("Dünya dönüyormu", null, null, null, null, null);

		QuestionsService questionsService = new QuestionsService();
		AnswersService answersService = new AnswersService();
		answersService.save(answers);
		questionsService.save(questions);

	}
}
