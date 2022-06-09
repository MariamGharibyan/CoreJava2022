package homework.homework7;

public class BraceCheckerTest {
    public static void main(String[] args) {
        BraceChecker demo =new  BraceChecker(" {{((Hello)) [from} [(Java}})))))");
        demo.check();
    }
}
