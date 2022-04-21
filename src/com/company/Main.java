package com.company;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws AWTException, InterruptedException {
        int x =0;
        System.out.println(
                "   _____                                              _____           _       __ \n" +
                "  / ___/____  ____ _____ ___  ____ ___  ___  _____   / ___/__________(_)___  / /_\n" +
                "  \\__ \\/ __ \\/ __ `/ __ `__ \\/ __ `__ \\/ _ \\/ ___/   \\__ \\/ ___/ ___/ / __ \\/ __/\n" +
                " ___/ / /_/ / /_/ / / / / / / / / / / /  __/ /      ___/ / /__/ /  / / /_/ / /_  \n" +
                "/____/ .___/\\__,_/_/ /_/ /_/_/ /_/ /_/\\___/_/      /____/\\___/_/  /_/ .___/\\__/  \n" +
                "    /_/                                                            /_/           \n");
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
