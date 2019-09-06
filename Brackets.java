import java.util.Stack;

public class Brackets {

    public static void main(String[] args) {
        String s1 = "(([{}](){}))";
        System.out.println(isClosed(s1));

    }

    public static boolean isClosed(String text) {
        //Base cases
        if(text.length() % 2 != 0) return false;
        char k = text.charAt(0);
        if (k == ']' || k == '}' || k == ')') return false;

        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < text.length(); i++) {

            char current = text.charAt(i);
            if(current == '[' || current == '{' || current == '(') //If opening brackets,
                stack.push(current);                                //then push onto the stack


            if (current == ']' || current == '}' || current == ')')
                stack.pop();
        }
        return true;
    }

}
