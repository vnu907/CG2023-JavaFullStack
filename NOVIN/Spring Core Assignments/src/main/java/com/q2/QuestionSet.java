package com.q2;
import java.util.Set;

public class QuestionSet {
	private int questionId;
	private String question;
	private Set<String> answers;

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public void setAnswers(Set<String> answers) {
		this.answers = answers;
	}

	@Override
	public String toString() {
		return "Question No. " + questionId + "\nQuestion:" + question + ",\nAnswer:" + answers + "\n";
	}

}