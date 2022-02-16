package com.example.springddd.infrastructure.repository.cassandra;


import com.example.springddd.domain.Order;
import com.example.springddd.domain.repository.OrderRepository;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;
import java.util.Optional;
import java.util.UUID;

@Component
public class CassandraDbOrderRepository implements OrderRepository {

    @Override
    public Optional<Order> findById(UUID id) {
        System.out.println("Chamado metodo findById da classe CassandraDbOrderRepository");
        return Optional.empty();
    }

    @Override
    public void save(Order order) {
        System.out.println("Chamado metodo save da classe CassandraDbOrderRepository");
    }

}
