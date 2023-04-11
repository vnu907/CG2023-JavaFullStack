package com.q1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	/*The class defines two methods annotated with the @Bean annotation, which indicate
	 *  that these methods should be used to create beans in the application context.
	 */
    @Bean
    public Address address() {
        return new Address("123 Main St", "Anytown", "CA", "12345", "USA");
    }

    @Bean
    public Customer customer() {
        return new Customer(1, "John Doe", "123-456-7890", address());
    }
}