package Proxy;

public class ProtectionProxyEx {
    public static void main(String[] args) {
        Client client = new ProtectionProxy("thePassword");
        System.out.println();
        System.out.println("main received: " + client.GetAccountNo());
        System.out.println("\nPress any key to continue . . .");
        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
