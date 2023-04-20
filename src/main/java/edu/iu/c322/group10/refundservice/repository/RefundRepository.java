package edu.iu.c322.group10.refundservice.repository;

import edu.iu.c322.group10.refundservice.model.Refund;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RefundRepository extends JpaRepository<Refund, Integer> {

}