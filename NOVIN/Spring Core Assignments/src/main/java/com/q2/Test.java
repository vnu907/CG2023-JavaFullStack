package com.q2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext obj = new ClassPathXmlApplicationContext("applicationcontextq2.xml");
		
		QuestionList question1 = (QuestionList) obj.getBean("question1");
		QuestionSet question2 = (QuestionSet) obj.getBean("question2");
		QuestionMap question3 = (QuestionMap) obj.getBean("question3");
		
		System.out.println(question1);
		System.out.println(question2);
		System.out.println(question3);
	}

}
