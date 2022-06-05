package homework.homework7;

import java.util.Stack;

public class BraceChecker {
    String myString;

    BraceChecker(String myString) {
        this.myString = myString;
    }

    void check() {
        char[] mychar = myString.toCharArray();
        Stack mystack = new Stack();
        char lastSymbol;
        for (int i = 0; i < mychar.length; i++) {
            switch (mychar[i]) {
                case '(':
                case '[':
                case '{':
                    mystack.push(mychar[i]);
                    break;
                case ']':
                    lastSymbol = (char) mystack.pop();
                    if (lastSymbol != '[') {
                        System.err.println("Error: opened  " + lastSymbol + "  but closed  " + mychar[i] + " at " + i);
                    }
                    break;
                case ')':
                    lastSymbol = (char) mystack.pop();
                    if (lastSymbol != '(') {
                        System.err.println("Error: opened  " + lastSymbol + "  but closed  " + mychar[i] + " at " + i);
                    }
                    break;
                case '}':
                    lastSymbol = (char) mystack.pop();
                    if (lastSymbol != '{') {
                        System.err.println("Error: opened  " + lastSymbol + "  but closed  " + mychar[i] + " at " + i);
                    }
            }
        }
    }

}




