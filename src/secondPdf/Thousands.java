package secondPdf;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;

import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;


public class Thousands {
    public static void main(String[] args) {
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Arial", Font.ITALIC, 14)));
        UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Serif", Font.BOLD, 20)));
        String inputDigit = showInputDialog(null, "Enter the digit", "Primary digit", INFORMATION_MESSAGE);

        int primaryDigit = Integer.parseInt(inputDigit);
        int finalResult = (primaryDigit - (primaryDigit%1000))/1000;
        showMessageDialog(null, "The result is " + finalResult, "Number of thousands", INFORMATION_MESSAGE);
    }
}


