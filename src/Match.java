import java.util.Stack;

public class Match {

    public static boolean isMatched(String expression) {
        final String opening = "({[";
        final String closing = ")}]";

        Stack<Character> buffer = new Stack<>();

        for (char c : expression.toCharArray()) {
            if (opening.indexOf(c) != -1) {
                buffer.push(c);
            } else if (closing.indexOf(c) != -1) {
                if (buffer.isEmpty()) {
                    return false;
                }

                if (closing.indexOf(c) != opening.indexOf(buffer.pop())) {
                    return false;
                }
            }

        }

        return buffer.isEmpty();
    }


    // testing
    public static void main(String[] args) {
        String[] tests = {
                "((()",
                "{[]}",
                "{(1+4)+(2+5)}",
        };

        System.out.println("check:");
        for (String test : tests) {
            boolean result = isMatched(test);
            System.out.println(result);
        }

    }

}

