package com.q1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	/*ApplicationContext interface from the Spring Framework's context package. Specifically, 
	 * it creates a ClassPathXmlApplicationContext object, which loads the application context
	 *  from an XML file named "applicationContext.xml".
	 */
ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontextq1.xml");
/*This retrieves a Customer object from the application context. The getBean method is used to
 *  retrieve the bean with the name "customer". This bean is defined in the "applicationContext.xml" file
 *   and is of type Customer.
 */
Customer customer = (Customer) context.getBean("customer");
System.out.println(customer);
}
}
