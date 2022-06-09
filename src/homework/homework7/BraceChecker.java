package homework.homework7;


public class BraceChecker {
    String myString;

    BraceChecker(String myString) {
        this.myString = myString;
    }

    void check() {
        char[] mychar = myString.toCharArray();
        Stack mystack = new Stack(mychar.length);
        char lastSymbol;
        for (int i = 0; i < mychar.length; i++) {
            switch (mychar[i]) {
                case '(':
                case '[':
                case '{':
                    mystack.push(mychar[i]);
                    break;
                case ']':
                   lastSymbol = (char) mystack.рор();
                   if(lastSymbol==0){
                       System.err.println("Error: closed  " + mychar[i] + " but not opened" +  " at " + i);
                   }
                    else if (lastSymbol != '[') {
                        System.err.println("Error: opened  " + lastSymbol + "  but closed  " + mychar[i] + " at " + i);
                    }
                    break;
                case ')':
                    lastSymbol = (char) mystack.рор();
                    if(lastSymbol==0){
                        System.err.println("Error: closed  " + mychar[i] + " but not opened" +  " at " + i);
                    }
                    else if (lastSymbol != '(') {
                        System.err.println("Error: opened  " + lastSymbol + "  but closed  " + mychar[i] + " at " + i);
                    }
                    break;
                case '}':
                    lastSymbol = (char) mystack.рор();
                    if(lastSymbol==0){
                        System.err.println("Error: closed  " + mychar[i] + " but not opened" +  " at " + i);
                    }
                    else if (lastSymbol != '{') {
                        System.err.println("Error: opened  " + lastSymbol + "  but closed  " + mychar[i] + " at " + i);
                    }
            }
        }
        System.err.print("Quantity of opened  but not closed is  ");
        mystack.chackingStack();

    }

}




