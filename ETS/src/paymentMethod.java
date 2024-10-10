abstract class paymentService {
    String paymentStatus;
    String paymentMethod;

    paymentService(String paymentStatus, String paymentMethod) {
        this.paymentStatus = paymentStatus;
        this.paymentMethod = paymentMethod;
    }

    abstract void getPaymentMethod();
    abstract void getPaymentStatus();

    void showDeviceInfo() {
        System.out.println("Metode pembayaran: " + paymentMethod + "Status Pembayaran: " + paymentStatus);
    }
}