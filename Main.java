package tk.nowbie;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class Main {

	public static void main(String[] args) {
		
		try {
	        Robot robot = new Robot();

	        // simula um clique no mouse
	        /*
	        robot.mousePress(InputEvent.BUTTON1_MASK);
	        robot.mouseRelease(InputEvent.BUTTON1_MASK);

	        // simula teclas do keyboard
	        robot.keyPress(KeyEvent.VK_WINDOWS);
	        robot.keyPress(KeyEvent.VK_R);
	        robot.keyRelease(KeyEvent.VK_WINDOWS);
	        robot.keyRelease(KeyEvent.VK_R);
	        
	        
	        robot.keyPress(KeyEvent.VK_H);
	        robot.keyRelease(KeyEvent.VK_H);
	        robot.keyPress(KeyEvent.VK_T);
	        robot.keyRelease(KeyEvent.VK_T);
	        robot.keyPress(KeyEvent.VK_T);
	        robot.keyRelease(KeyEvent.VK_T);
	        robot.keyPress(KeyEvent.VK_P);
	        robot.keyRelease(KeyEvent.VK_P);
	        */
	        
	        
	        String text = "http://google.com.br/ ";
	        StringSelection stringSelection = new StringSelection(text);
	        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
	        clipboard.setContents(stringSelection, stringSelection);
	        /*
	        robot.keyPress(KeyEvent.VK_WINDOWS);
	        robot.keyPress(KeyEvent.VK_R);
	        robot.keyRelease(KeyEvent.VK_WINDOWS);
	        robot.keyRelease(KeyEvent.VK_R);
	        */
	        robot.keyPress(KeyEvent.VK_CONTROL);
	        robot.keyPress(KeyEvent.VK_V);
	        robot.keyRelease(KeyEvent.VK_V);
	        robot.keyRelease(KeyEvent.VK_CONTROL);
	        robot.keyPress(KeyEvent.VK_ENTER);
	        robot.keyRelease(KeyEvent.VK_ENTER);

	} catch (AWTException e) {
	        e.printStackTrace();
	}

	}

}
