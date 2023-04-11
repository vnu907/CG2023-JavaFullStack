package com.q7;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
/*@Component is a Spring annotation that marks this class as a Spring-managed component. This means
 *  that Spring will automatically create an instance of this class and manage its lifecycle.
 */
@Component
public class Demo {
	/*@Value is another Spring annotation that is used to inject values into a component's properties.
	 *  In this class, we have two properties, x and y, which are annotated with @Value. The values of 
	 *  these properties are set using Spring Expression Language (SpEL) expressions enclosed in curly braces {}.
	 */
	/*The expression for x is #{22+44}, which is a simple SpEL expression that adds the values 22 and 44 together. 
	 * The result of the expression is then assigned to the x property.
	 */
	@Value("#{22+44}")
	private int x;
	
	@Value("#{12}")
	private int y;

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + "]";
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
