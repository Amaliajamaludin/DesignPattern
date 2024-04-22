package Proxy;

public class RealClient implements Client {
    private String accountNo = "12345";

    public RealClient() {
        System.out.println("RealClient: Initialized");
    }

    public String GetAccountNo() {
        System.out.println("RealClient's AccountNo: " + accountNo);
        return accountNo;
    }
}
