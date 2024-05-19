import javax.swing.*;
import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class CTA3_menu_UI extends JFrame {
    private JTextArea textArea;

    public CTA3_menu_UI() {
        // Set up the frame
        setTitle("CSC372 Module3 Menu Example");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a text area for displaying output
        textArea = new JTextArea();
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        // Create a menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create a menu and add it to the menu bar
        JMenu menu = new JMenu("Options");
        menuBar.add(menu);

        // Create menu items and add them to the menu
        JMenuItem menuItem1 = new JMenuItem("Show Date and Time");
        menu.add(menuItem1);
        // Add action listener to the first menu item
        menuItem1.addActionListener(e -> showDateTime());

        JMenuItem menuItem2 = new JMenuItem("Save to File");
        menu.add(menuItem2);
        // Add action listener to the second menu item
        menuItem2.addActionListener(e -> saveToFile());

        JMenuItem menuItem3 = new JMenuItem("Change Background Color");
        menu.add(menuItem3);
        // Add action listener to the third menu item
        menuItem3.addActionListener(e -> changeBackgroundColor(menuItem3));

        JMenuItem menuItem4 = new JMenuItem("Exit");
        menu.add(menuItem4);
        // Add action listener to the fourth menu item
        menuItem4.addActionListener(e -> System.exit(0));

        // Set the menu bar for the frame
        setJMenuBar(menuBar);
    }

    // Method to display the current date and time in the text area
    private void showDateTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String dateTime = LocalDateTime.now().format(formatter);
        textArea.setText(dateTime);
    }

    // Method to save the contents of the text area to a file named "log.txt"
    private void saveToFile() {
        try (FileWriter writer = new FileWriter("log.txt", true)) {
            writer.write(textArea.getText() + "\n");
            JOptionPane.showMessageDialog(this, "Saved to log.txt");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error saving to file", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Method to change the background color of the frame to a random green hue
    private void changeBackgroundColor(JMenuItem menuItem) {
        Random rand = new Random();
        float hue = 0.25f + rand.nextFloat() * (0.45f - 0.25f);  // Random hue in the green range
        menuItem.setText(String.format("Change Background Color (Hue: %.2f)", hue));
        Color randomGreen = Color.getHSBColor(hue, 1.0f, 1.0f);
        getContentPane().setBackground(randomGreen);
    }
}