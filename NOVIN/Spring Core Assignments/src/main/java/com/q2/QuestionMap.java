package com.q2;
import java.util.Map;

public class QuestionMap {
	private int questionId;
	private String question;
	private Map<Integer, String> answers;

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public void setAnswers(Map<Integer, String> answers) {
		this.answers = answers;
	}

	@Override
	public String toString() {
		return "Question No. " + questionId + "\nQuestion:" + question + ",\nAnswer:" + answers + "\n";
	}

}