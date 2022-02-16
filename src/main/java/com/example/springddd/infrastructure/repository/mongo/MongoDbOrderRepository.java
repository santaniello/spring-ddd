package com.example.springddd.infrastructure.repository.mongo;


import com.example.springddd.domain.Order;
import com.example.springddd.domain.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.UUID;

@Component
@Primary
public class MongoDbOrderRepository implements OrderRepository {

    @Override
    public Optional<Order> findById(final UUID id) {
        System.out.println("Chamado metodo findById da classe MongoDbOrderRepository");
        return Optional.empty();
    }

    @Override
    public void save(final Order order) {
        System.out.println("Chamado metodo save da classe MongoDbOrderRepository");
    }
}
