package za.ac.cput.factory;

import za.ac.cput.domain.Payment;

/**
 * PaymentFac.java
 * PaymentFac model class
 *
 * @author : Swatsi Bongani Ratia
 * @studnr : 230724477
 * @group : 3I
 * @Java version: "21.0.3" 2024-04-16 LTS
 */

public class PaymentFac {

        public static Payment createPayment(int paymentId, Double paymentAmount, String paymentMethod, String paymentDate, String paymentStatus) {


            return new Payment.Builder()
                    .setPaymentId(paymentId);

        }

    }
