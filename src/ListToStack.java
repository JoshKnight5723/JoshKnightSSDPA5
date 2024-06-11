import java.util.*;

/**
 * Class to create and return a Stack resulting from TakeInput class list
 * @author Josh Knight
 * @version 1.0.0
 * @since 6/7/2024
 *
 */
public class ListToStack {
    /**
     * createLinked method creates a Stack using
     * java.util.Stack built in methods
     * This class has the same implementation method as used in coding assignment 4
     * using the same list input from TakeInput class
     * @return Stack of sorted integers
     * @since 6/7/2024
     */

    public Stack<Integer> createStack() {
        TakeInput going = new TakeInput();
        Stack<Integer> stack = new Stack<>();
        List<Integer> y = going.createList();
        for (int x = 0; x < y.size(); x++ ) {
            stack.push(y.get(x));
        }
        return stack;

    }
}
