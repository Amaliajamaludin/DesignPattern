package Proxy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProtectionProxy implements Client {
    private String password;
    RealClient client;

    public ProtectionProxy(String pwd) {
        System.out.println("ProtectionProxy: Initialized");
        password = pwd;
        client = new RealClient();
    }

    public String GetAccountNo() {
        System.out.println("Password: ");
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String tmpPwd = reader.readLine();
            if (tmpPwd.equals(password)) {
                return client.GetAccountNo();
            } else {
                System.out.println("Illegal password!");
                return "";
            }
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
