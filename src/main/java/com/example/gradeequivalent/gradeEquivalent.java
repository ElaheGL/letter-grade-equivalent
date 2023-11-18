package com.example.gradeequivalent;

import javax.swing.*;

public class gradeEquivalent {
    public static void main(String[] args) {
        double userEnter = Double.parseDouble
                (JOptionPane.showInputDialog(null, "enter your yearly average mark from CPE 313 /\n" +
                        "ISE 313 / MIS 313"));
        double Result = calculation(userEnter);
    }

    private static double calculation(double number) {
        if (number >= 95 && number <= 100) {
            JOptionPane.showMessageDialog(null, "Your grade is A ");
        } else if (number >= 90 && number < 95) {
            JOptionPane.showMessageDialog(null, "Your grade is A- ");
        } else if (number >= 85 && number < 90) {
            JOptionPane.showMessageDialog(null, "Your grade is B+ ");
        } else if (number >= 80 && number < 85) {
            JOptionPane.showMessageDialog(null, "Your grade is B ");
        } else if (number >= 77 && number < 80) {
            JOptionPane.showMessageDialog(null, "Your grade is B- ");
        } else if (number >= 74 && number < 77) {
            JOptionPane.showMessageDialog(null, "Your grade is C+ ");
        } else if (number < 74 && number > 30) {
            JOptionPane.showMessageDialog(null, "It ia acceptable ");

        } else {
            JOptionPane.showMessageDialog(null, "It ia not acceptable ");

        }
        return number;
    }




}
