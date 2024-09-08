import javax.swing.*;
import java.awt.*;

public class DSAIntroPage {

    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Welcome to DSA Journey");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new BorderLayout());
        
        // Create a JPanel with a colorful background
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        panel.setBackground(Color.decode("#FFFAF0")); // Light background color

        // Add a title label
        JLabel titleLabel = new JLabel("Welcome to Your DSA Journey!");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setForeground(Color.decode("#FF4500")); // Orange-red color
        panel.add(titleLabel, new GridBagConstraints());

        // Add a description label
        JLabel descriptionLabel = new JLabel("<html>This is the beginning of your Data Structures and Algorithms journey.<br>" +
                                            "Get ready to dive deep into the world of problem-solving and coding challenges.<br>" +
                                            "Let's make this journey colorful and exciting!</html>");
        descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        descriptionLabel.setForeground(Color.decode("#4682B4")); // Steel blue color
        panel.add(descriptionLabel, new GridBagConstraints());

        // Add a button to start the journey
        JButton startButton = new JButton("Start Your Journey");
        startButton.setFont(new Font("Arial", Font.BOLD, 18));
        startButton.setForeground(Color.WHITE);
        startButton.setBackground(Color.decode("#32CD32")); // Lime green color
        startButton.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Let’s get started!"));
        panel.add(startButton, new GridBagConstraints());

        // Add the panel to the frame
        frame.add(panel, BorderLayout.CENTER);

        // Display the window
        frame.setVisible(true);
    }
}

