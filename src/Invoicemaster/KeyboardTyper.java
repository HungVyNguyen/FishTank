package Invoicemaster;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class KeyboardTyper {
    public static void main(String[] args) throws Exception {
        Thread.sleep(6000);

        String sentence = "I like kids. They're always sticky";

        for (int j = 0; j < 3; j++) {
            Robot robot = new Robot();
            for (int i = 0; i < sentence.length(); i++) {
                Thread.sleep(1);
                char c = sentence.charAt(i);
                int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
                boolean shift = Character.isUpperCase(c);
                if (shift) {
                    robot.keyPress(KeyEvent.VK_SHIFT);
                }
                robot.keyPress(keyCode);
                robot.keyRelease(keyCode);
                if (shift) {
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                }

            }
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            Thread.sleep(0);
        }
    }
}
