package Template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TeaWithHook extends CaffeineBeverageWithHook {
    public void brew() {
        System.out.println("Steeping the tea");
    }

    public void addCondiments() {
        System.out.println("Adding Lemon");
    }

    public boolean customerWantsCondiments() {
        String answer = getUserInput();
        return answer.toLowerCase().startsWith("y");
    }

    private String getUserInput() {
        String answer = null;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Would you like lemon with your tea (y/n)? ");
        try {
            answer = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return answer;
    }
}
