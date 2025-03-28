package za.ac.cput.repository;

/**
 * iPaymentRepository.java
 * iPaymentRepository model class
 *
 * @author : Swatsi Bongani Ratia
 * @studnr : 230724477
 * @group : 3I
 * @Java version: "21.0.3" 2024-04-16 LTS
 */


import za.ac.cput.domain.Payment;

import java.util.List;

public interface iPaymentRepository extends iRepository<Payment , Integer>{
    List<Payment> getAll();

    //boolean create(Payment payments);
}

