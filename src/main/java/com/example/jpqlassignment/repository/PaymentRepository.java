package com.example.jpqlassignment.repository;

import com.example.jpqlassignment.model.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment, Integer> {
}
