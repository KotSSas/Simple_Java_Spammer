package com.company;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws AWTException, InterruptedException {
        // write your code here
        int x = 10;
        Robot robot = new Robot();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the message:");
        String text = sc.nextLine();
        StringSelection stringSelection = new StringSelection(text);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);

        System.out.println("The spamming will start in 5 seconds");
        Thread.sleep(5000); //wait for 5000 mls
        while (x<=10) {
            Thread.sleep(100); //wait for 5000 mls
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);

            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        }

    }
}
