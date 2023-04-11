package com.q2;
import java.util.List;

public class QuestionList {
	private int questionId;
	private String question;
	private List<String> answers;

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}

	@Override
	public String toString() {
		return "Question No. " + questionId + "\nQuestion:" + question + ",\nAnswer:" + answers + "\n";
	}

}
