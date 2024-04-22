package Template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook {
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    public boolean customerWantsCondiments() {
        String answer = getUserInput();
        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {
        String answer = null;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Would you like milk (y/n)? ");
        try {
            answer = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return answer;
    }
}
