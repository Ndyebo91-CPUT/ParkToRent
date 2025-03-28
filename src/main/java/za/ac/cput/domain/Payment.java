package za.ac.cput.domain;

/**
 * Payment.java
 * Payment model class
 *
 * @author : Swatsi Bongani Ratia
 * @studnr : 230724477
 * @group : 3I
 * @Java version: "21.0.3" 2024-04-16 LTS
 */

public class Payment {
    private int paymentId;
    private Double paymentAmount;
    private String paymentMethod;
    private String paymentDate;
    private String paymentStatus;

    private Payment(za.ac.cput.domain.Payment.Builder builder) {
        this.paymentId= builder.paymentId;
        this.paymentAmount = builder.paymentAmount;
        this.paymentMethod = builder.paymentMethod;
        this.paymentDate = builder.paymentDate;
        this.paymentStatus = builder.paymentStatus;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public Double getPaymentAmount() {
        return paymentAmount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public static class Builder{

        private int paymentId;
        private Double paymentAmount;
        private String paymentMethod;
        private String paymentDate;
        private String paymentStatus;

        public Builder(int paymentId, Double paymentAmount, String paymentMethod, String paymentDate, String paymentStatus) {
            this.paymentId = paymentId;
            this.paymentAmount = paymentAmount;
            this.paymentMethod = paymentMethod;
            this.paymentDate = paymentDate;
            this.paymentStatus = paymentStatus;
        }

        public void setPaymentId(int paymentId) {
            this.paymentId = paymentId;
        }

        public void setPaymentAmount(Double paymentAmount) {
            this.paymentAmount = paymentAmount;
        }

        public void setPaymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
        }

        public void setPaymentDate(String paymentDate) {
            this.paymentDate = paymentDate;
        }

        public void setPaymentStatus(String paymentStatus) {
            this.paymentStatus = paymentStatus;
        }

        public za.ac.cput.domain.Payment build(){
            return new za.ac.cput.domain.Payment(this);
        }

    }

}
