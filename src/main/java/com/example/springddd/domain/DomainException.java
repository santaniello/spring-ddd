package com.example.springddd.domain;

class DomainException extends RuntimeException {
    DomainException(final String message) {
        super(message);
    }
}
