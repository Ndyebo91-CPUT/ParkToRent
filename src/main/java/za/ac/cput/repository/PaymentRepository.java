package za.ac.cput.repository;

import za.ac.cput.domain.Payment;

import java.util.ArrayList;
import java.util.List;

/**
 * PaymentRepository.java
 * PaymentRepository model class
 *
 * @author : Swatsi Bongani Ratia
 * @studnr : 230724477
 * @group : 3I
 * @Java version: "21.0.3" 2024-04-16 LTS
 */

public class PaymentRepository implements iPaymentRepository{
    private static iPaymentRepository repository=null;
    private List<Payment> paymentList;

    private PaymentRepository(){
        paymentList= new ArrayList<Payment>();
    }
    public static iPaymentRepository getInstance(){
        if(repository== null){
            repository= new PaymentRepository();
        }
        return repository;
    }
    @Override
    public List<Payment> getAll() {
        return paymentList;
    }

    @Override
    public boolean create(Payment payments) {
        return paymentList.add(payments);
    }
    @Override
    public Payment read(Integer paymentId) {
        for(Payment payment:paymentList){
            if(payment.getPaymentId()==paymentId){
                return payment;
            }
        }
        return null;
    }

    @Override
    public Payment update(Payment payment) {
        for(int i =0 ;i<paymentList.size();i++){
            Payment pay = paymentList.get(i);
            if(pay.getPaymentId()==payment.getPaymentId()){
                paymentList.set(i,payment);
                return payment;
            }

        }
        return null;
    }

    @Override
    public boolean delete(Integer paymentId) {
        Payment payment=read(paymentId);
        if(payment!=null){
            paymentList.remove(payment);
            return true;
        }
        return false;
    }

    {

    }}
