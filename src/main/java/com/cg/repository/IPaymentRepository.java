package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cg.entity.Payment;


@Repository
public interface IPaymentRepository extends JpaRepository<Payment,Long>{

}
