package scr.model;

public class Payment {
    private String payment_id;
    private String student_no;
    private String status;
    private String date;
    private double balance;
    private double amount;

    public Payment(String payment_id, String student_no, String status,
            String date, double balance, double amount) {
        this.payment_id = payment_id;
        this.student_no = student_no;
        this.status = status;
        this.date = date;
        this.balance = balance;
        this.amount = amount;
    }

    public String getPayment_id() {
        return this.payment_id;
    }

    public String getStudent_no() {
        return this.student_no;
    }

    public String getStatus() {
        return this.status;
    }

    public double getAmount() {
        return this.amount;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getDate() {
        return this.date;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
