package com.company;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws AWTException, InterruptedException {
        int x =1;
        System.out.println(
                "   ____                                ____        _      __ \n" +
                "  / __/__  ___ ___ _  __ _  ___ ____  / __/_______(_)__  / /_\n" +
                " _\\ \\/ _ \\/ _ `/  ' \\/  ' \\/ -_) __/ _\\ \\/ __/ __/ / _ \\/ __/\n" +
                "/___/ .__/\\_,_/_/_/_/_/_/_/\\__/_/   /___/\\__/_/ /_/ .__/\\__/ \n" +
                "   /_/                                           /_/         \n");
        Robot robot = new Robot();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your text:");
        String Text = scanner.nextLine();

        StringSelection stringSelection = new StringSelection(Text);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);


        System.out.println("The spamming will start in 5 seconds");
        Thread.sleep(5000);

        while(x <= 200) {

            Thread.sleep(100);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            x++;

        }

    }
}
