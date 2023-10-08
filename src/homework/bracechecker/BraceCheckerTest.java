package homework.bracechecker;

public class BraceCheckerTest {

    public static void main(String[] args) {
        String text = "{Hell(o {{Java})";
        BraceChecker braceChecker = new BraceChecker(text);
        braceChecker.check();
    }
}
