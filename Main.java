package ru.vicero13.homeprojects;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main {

    private static String action;
    private static int a;
    private static int b;
    private static String result;

    private static String divide(int a, int b){
        result = Integer.toString(a / b);
        return result;
    }

    private static String plus(int a, int b){
        result = Integer.toString(a + b);
        return result;
    }

    private static String multiply(int a, int b){
        result = Integer.toString(a * b);
        return result;
    }

    private static String subtraction(int a, int b){
        result = Integer.toString(a - b);
        return result;
    }

    public static void main (String[] args) {
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton buttonDivide = new JButton("/");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton buttonMultiply = new JButton("x");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        JButton buttonSubtraction = new JButton("-");
        JButton buttonClear = new JButton("C");
        JButton button0 = new JButton("0");
        JButton buttonEqually = new JButton("=");
        JButton buttonPlus = new JButton("+");


        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(350, 250);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.CENTER);

        JTextField textField = new JTextField(20);
        textField.setHorizontalAlignment(JTextField.RIGHT);
        Font font = new Font("TimesNewRoman", Font.PLAIN, 20);
        textField.setFont(font);
        textField.setEditable(false);
        panel1.add(textField);

        panel2.setLayout(new GridLayout(4, 4));


        panel2.add(button1);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textField.setText(textField.getText() + "1");
            }
        });

        panel2.add(button2);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textField.setText(textField.getText() + "2");
            }
        });

        panel2.add(button3);
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textField.setText(textField.getText() + "3");
            }
        });

        panel2.add(buttonDivide);
        buttonDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                a = Integer.parseInt(textField.getText());
                action = e.getActionCommand();
                textField.setText("");

            }
        });


        panel2.add(button4);
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "4");
            }
        });

        panel2.add(button5);
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textField.setText(textField.getText() + "5");
            }
        });

        panel2.add(button6);
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textField.setText(textField.getText() + "6");
            }
        });

        panel2.add(buttonMultiply);
        buttonMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                a = Integer.parseInt(textField.getText());
                action = e.getActionCommand();
                textField.setText("");
            }
        });

        panel2.add(button7);
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textField.setText(textField.getText() + "7");
            }
        });

        panel2.add(button8);
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textField.setText(textField.getText() + "8");
            }
        });

        panel2.add(button9);
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textField.setText(textField.getText() + "9");
            }
        });

        panel2.add(buttonSubtraction);
        buttonSubtraction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                a = Integer.parseInt(textField.getText());
                action = e.getActionCommand();
                textField.setText("");
            }
        });

        panel2.add(buttonClear);
        buttonClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textField.setText("");
            }
        });

        panel2.add(button0);
        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textField.setText(textField.getText() + "0");
            }
        });

        panel2.add(buttonEqually);
        buttonEqually.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b = Integer.parseInt(textField.getText());

                try {
                    if (action.equals("/")) {
                        textField.setText(divide(a, b));
                    }
                    if (action.equals("+")) {
                        textField.setText(plus(a, b));
                    }
                    if (action.equals("-")) {
                        textField.setText(subtraction(a, b));
                    }
                    if (action.equals("x")) {
                        textField.setText(multiply(a, b));
                    }
                } catch (Exception exception){
                    textField.setText("Ошибка!");
                }

            }
        });

        panel2.add(buttonPlus);
        buttonPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                a = Integer.parseInt(textField.getText());
                action = e.getActionCommand();
                textField.setText("");
            }
        });
    }
}
