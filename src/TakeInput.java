import java.util.*;
import java.util.ArrayList;
import java.lang.*;

/**
 * Class to prompt user for input of integers and sorts them into a list.
 * Continuously takes input until user types "stop"
 * @author Josh Knight
 * @version 1.0.0
 * @since 6/7/2024
 *
 */
public class TakeInput {
    /**
     * Creates a list from the user's prompted inputs
     * THIS CLASS IS IDENTICAL to coding assignment 4
     * @return userInput (a list of sorted integers from the user's input)
     * @since 6/7/2024
     */
    public List<Integer> createList() {
        List<Integer> userInput = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Please provide a list of integers separated by a single space ending in 'stop': ");
        while (scan.hasNext()) {
            String confirm = scan.next();
            if (confirm.equalsIgnoreCase("stop")) {
                break;
            }
            else {
                int x = Integer.parseInt(confirm);
                userInput.add(x);
            }
        }
        scan.close();
        Collections.sort(userInput);
        return userInput;
    }
}
