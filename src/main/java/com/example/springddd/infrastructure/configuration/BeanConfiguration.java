package com.example.springddd.infrastructure.configuration;


import com.example.springddd.SpringDddApplication;
import com.example.springddd.domain.repository.OrderRepository;
import com.example.springddd.domain.service.DomainOrderService;
import com.example.springddd.domain.service.OrderService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = SpringDddApplication.class)
public class BeanConfiguration {
    @Bean
    OrderService orderService(final OrderRepository orderRepository) {
        return new DomainOrderService(orderRepository);
    }
}
