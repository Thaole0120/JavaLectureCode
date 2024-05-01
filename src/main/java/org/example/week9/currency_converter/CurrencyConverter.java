package org.example.week9.currency_converter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class CurrencyConverter extends JFrame {
    private JTextField dollarsTextField;
    private JButton convertButton;
    private JLabel conversionResultLabel;
    private JPanel mainPanel;
    private JComboBox<String> currencyComboBox;


    private String EUROS = "Euros" ;
    private String POUNDS = "Pounds" ;

    private Map<String, Double> exchangeRates = Map.of(EUROS, 0.84, POUNDS, 0.75);

    CurrencyConverter(){
        setContentPane(mainPanel);
        setPreferredSize( new Dimension(500, 300));
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        getRootPane().setDefaultButton(convertButton);

        currencyComboBox.addItem(EUROS);
        currencyComboBox.addItem(POUNDS);

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // what was typed in the JTextField dollarsTextField?
                String dollarString = dollarsTextField.getText();

                try {
                    //convert to a number
                    double dollars = Double.parseDouble(dollarString);
                    String toCurrency = (String)currencyComboBox.getSelectedItem();

                    double exchangeRate = exchangeRates.get(toCurrency);

                    //convert to Euros
                    double convertedValue = dollars * exchangeRate;
                    //display result in euroResultLabel JLabel
                    String resultString = String.format("%.2f dollars is quivalent to %.2f %s ", dollars, convertedValue, toCurrency);
                    conversionResultLabel.setText(resultString);
                }catch (NumberFormatException nfe){
                    JOptionPane.showMessageDialog(CurrencyConverter.this, "Please enter a number without any $ or other characters. ");

                }
            }
        });
    }
}

