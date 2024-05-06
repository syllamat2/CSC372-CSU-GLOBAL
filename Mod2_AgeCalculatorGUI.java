import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.Period;

public class Mod2_AgeCalculatorGUI extends JFrame implements ActionListener {
    private JPanel panel;
    private JButton calculateButton;
    private JLabel birthDateLabel;
    private JTextField yearField, monthField, dayField;
    private JLabel ageLabel;

    public Mod2_AgeCalculatorGUI() {
        // Set up the JFrame
        setTitle("Age Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        // Create JPanel
        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        // Create components
        birthDateLabel = new JLabel("Enter your birth date (YYYY-MM-DD):");
        yearField = new JTextField(4);
        monthField = new JTextField(2);
        dayField = new JTextField(2);
        calculateButton = new JButton("Calculate Age");
        calculateButton.addActionListener(this);
        ageLabel = new JLabel();

        // Add components to the panel
        panel.add(birthDateLabel);
        panel.add(new JLabel()); // Placeholder for spacing
        panel.add(new JLabel("Year: "));
        panel.add(yearField);
        panel.add(new JLabel("Month: "));
        panel.add(monthField);
        panel.add(new JLabel("Day: "));
        panel.add(dayField);
        panel.add(calculateButton);
        panel.add(ageLabel);

        // Add panel to the frame
        add(panel);

        // Make the frame visible
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Calculate age when the button is clicked
        LocalDate birthDate = LocalDate.of(Integer.parseInt(yearField.getText()),
                                            Integer.parseInt(monthField.getText()),
                                            Integer.parseInt(dayField.getText()));
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(birthDate, currentDate);
        ageLabel.setText("Your age is: " + age.getYears() + " years, " + age.getMonths() + " months, and " + age.getDays() + " days.");
    }

    public static void main(String[] args) {
        new Mod2_AgeCalculatorGUI();
    }
}