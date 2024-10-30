//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import javax.swing.JOptionPane;
//import javax.swing.JFrame;
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//
//public class UIFeatures {
//    private JFrame frame;
//    private JTextArea textArea;
//    private JRadioButton playInstructions,playGame;
//    private ButtonGroup buttonGroup;
//
//    public UIFeatures() {
//        frame = new JFrame("Roulette");
//        frame.setSize(600, 1000);
//        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
//
//        // Load the image
//        ImageIcon imageIcon = new ImageIcon("C:\\Users\\raide\\IdeaProjects\\Projct7\\src\\Routtlespinner.jpg"); // Ensure this path is correct
//
//        // Resize the image
//        Image originalImage = imageIcon.getImage();
//        Image resizedImage = originalImage.getScaledInstance(400, 200, Image.SCALE_SMOOTH); // Change width and height as needed
//        ImageIcon resizedIcon = new ImageIcon(resizedImage);
//
//        // Create a label with the resized icon
//        JLabel imageLabel = new JLabel(resizedIcon);
//        imageLabel.setHorizontalAlignment(JLabel.CENTER);
//        imageLabel.setVerticalAlignment(JLabel.CENTER);
//
//        // Create a title label
//        JLabel titleLabel = new JLabel("WELCOME TO THE GAME OF ROULETTE");
//        titleLabel.setFont(new Font("Ariel", Font.BOLD, 22));
//        titleLabel.setHorizontalAlignment(JLabel.CENTER);
//
//        // Create a panel to hold the image and the title
//        JPanel northPanel = new JPanel();
//        northPanel.setLayout(new BorderLayout());
//        northPanel.add(imageLabel, BorderLayout.NORTH);
//        northPanel.add(titleLabel, BorderLayout.SOUTH);
//
//        textArea = new JTextArea();
//        textArea.setEditable(false);
//        textArea.setFont(new Font("Monospaced", Font.PLAIN, 20));
//        JScrollPane scrollPane = new JScrollPane(textArea);
//
//        frame.setLayout(new BorderLayout());
//        frame.add(northPanel, BorderLayout.NORTH);
//        frame.add(scrollPane, BorderLayout.CENTER);
//
//        // Create a panel for the button
//        Dimension buttonSize = new Dimension(100, 50); // Set button size
//
//
//        playInstructions = new JRadioButton("Instructions");
//        playInstructions.setBackground(Color.YELLOW);
//        playInstructions.setPreferredSize(buttonSize);
//
//        playGame = new JRadioButton("Place Bets");
//        playGame.setBackground(Color.GREEN);
//        playGame.setPreferredSize(buttonSize);
//
//        JPanel buttonPanel = new JPanel();
//        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
//        buttonPanel.add(playInstructions);
//        buttonPanel.add(playGame);
//
//        // Add the button panel to the frame
//        frame.add(buttonPanel, BorderLayout.SOUTH);
//
//        frame.setVisible(true);
//
//
//        playGame.addActionListener(new ActionListener() {
//
//            public void actionPerformed(ActionEvent e) {
//                playGame();
//            }
//        });
//
//        playInstructions.addActionListener(new ActionListener() {
//
//            public void actionPerformed(ActionEvent e) {
//                playerInstructions();
//            }
//        });
//    }
//
//    private void playerInstructions() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("Roulette is a game of chance, so your \n" +
//                "odds of winning on each spin are the\n" +
//                "same, regardless of whether you've won  \n" +
//                "before. However, you can control how much  \n" +
//                "you bet, how long you play\n" +
//                "-------------------------------\n");
//
//        sb.append("Here are some basic rules of roulette:\n" +
//                "Objective: Predict where the ball will land on \n" +
//                "the spinning wheel\n" +
//                "\n" +
//                "Bets: Place chips on the inside or outside \n" +
//                "sections of the table, on specific numbers, \n" +
//                "or on groups of numbers\n" +
//                "\n" +
//                "Payouts: Depending on how specific your \n" +
//                "prediction was, you can win up to 35 times \n" +
//                "your bet\n" +
//                "\n" +
//                "Winning number: After the ball stops spinning, \n" +
//                "the dealer will announce the winning number \n" +
//                "and the color of the pocket it landed in\n" +
//                "\n" +
//                "Winning bets: Markers are usually used to mark \n" +
//                "winning bets, and then the dealer pays out \n" +
//                "the winners\n" +
//                " \n" +
//                "Losing bets: The dealer sweeps losing bets off \n" +
//                "the table\n" +
//                "\n" +
//                "Next spin: Once payouts are complete, players \n" +
//                "can place bets for the next spin\n");
//
//        textArea.setText(sb.toString());
//    }
//    private void playGame() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("Test 1");
//
//        textArea.setText(sb.toString());
//    }
//
//
//}

//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.Random;
//
//public class UIFeatures {
//    private JFrame frame;
//    private JTextArea textArea;
//    private JRadioButton playInstructions, playGame;
//    private ButtonGroup buttonGroup;
//    private JTextField betAmountField;
//    private JComboBox<String> betTypeComboBox;
//    private Random random;
//
//    public UIFeatures() {
//        random = new Random();
//
//        frame = new JFrame("Roulette");
//        frame.setSize(600, 1000);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        // Load the image
//        ImageIcon imageIcon = new ImageIcon("C:\\Users\\raide\\IdeaProjects\\Projct7\\src\\Routtlespinner.jpg"); // Ensure this path is correct
//
//        // Resize the image
//        Image originalImage = imageIcon.getImage();
//        Image resizedImage = originalImage.getScaledInstance(400, 200, Image.SCALE_SMOOTH); // Change width and height as needed
//        ImageIcon resizedIcon = new ImageIcon(resizedImage);
//
//        // Create a label with the resized icon
//        JLabel imageLabel = new JLabel(resizedIcon);
//        imageLabel.setHorizontalAlignment(JLabel.CENTER);
//        imageLabel.setVerticalAlignment(JLabel.CENTER);
//
//        // Create a title label
//        JLabel titleLabel = new JLabel("WELCOME TO THE GAME OF ROULETTE");
//        titleLabel.setFont(new Font("Arial", Font.BOLD, 22));
//        titleLabel.setHorizontalAlignment(JLabel.CENTER);
//
//        // Create a panel to hold the image and the title
//        JPanel northPanel = new JPanel();
//        northPanel.setLayout(new BorderLayout());
//        northPanel.add(imageLabel, BorderLayout.NORTH);
//        northPanel.add(titleLabel, BorderLayout.SOUTH);
//
//        textArea = new JTextArea();
//        textArea.setEditable(false);
//        textArea.setFont(new Font("Monospaced", Font.PLAIN, 20));
//        JScrollPane scrollPane = new JScrollPane(textArea);
//
//        frame.setLayout(new BorderLayout());
//        frame.add(northPanel, BorderLayout.NORTH);
//        frame.add(scrollPane, BorderLayout.CENTER);
//
//        // Create a panel for the betting inputs and buttons
//        JPanel bettingPanel = new JPanel();
//        bettingPanel.setLayout(new GridLayout(2, 2));
//
//        JLabel betAmountLabel = new JLabel("Bet Amount:");
//        betAmountField = new JTextField();
//        JLabel betTypeLabel = new JLabel("Bet Type:");
//        betTypeComboBox = new JComboBox<>(new String[]{"Number", "Red", "Black", "Odd", "Even"});
//
//        bettingPanel.add(betAmountLabel);
//        bettingPanel.add(betAmountField);
//        bettingPanel.add(betTypeLabel);
//        bettingPanel.add(betTypeComboBox);
//
//        frame.add(bettingPanel, BorderLayout.WEST);
//
//        // Create a panel for the radio buttons
//        playInstructions = new JRadioButton("Instructions");
//        playInstructions.setBackground(Color.YELLOW);
//        playGame = new JRadioButton("Place Bets");
//        playGame.setBackground(Color.GREEN);
//
//        buttonGroup = new ButtonGroup();
//        buttonGroup.add(playInstructions);
//        buttonGroup.add(playGame);
//
//        JPanel buttonPanel = new JPanel();
//        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
//        buttonPanel.add(playInstructions);
//        buttonPanel.add(playGame);
//
//        frame.add(buttonPanel, BorderLayout.SOUTH);
//
//        frame.setVisible(true);
//
//        playGame.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                playGame();
//            }
//        });
//
//        playInstructions.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                playerInstructions();
//            }
//        });
//    }
//
//    private void playerInstructions() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("Roulette is a game of chance, so your \n" +
//                "odds of winning on each spin are the\n" +
//                "same, regardless of whether you've won  \n" +
//                "before. However, you can control how much  \n" +
//                "you bet, how long you play\n" +
//                "-------------------------------\n");
//
//        sb.append("Here are some basic rules of roulette:\n" +
//                "Objective: Predict where the ball will land on \n" +
//                "the spinning wheel\n" +
//                "\n" +
//                "Bets: Place chips on the inside or outside \n" +
//                "sections of the table, on specific numbers, \n" +
//                "or on groups of numbers\n" +
//                "\n" +
//                "Payouts: Depending on how specific your \n" +
//                "prediction was, you can win up to 35 times \n" +
//                "your bet\n" +
//                "\n" +
//                "Winning number: After the ball stops spinning, \n" +
//                "the dealer will announce the winning number \n" +
//                "and the color of the pocket it landed in\n" +
//                "\n" +
//                "Winning bets: Markers are usually used to mark \n" +
//                "winning bets, and then the dealer pays out \n" +
//                "the winners\n" +
//                " \n" +
//                "Losing bets: The dealer sweeps losing bets off \n" +
//                "the table\n" +
//                "\n" +
//                "Next spin: Once payouts are complete, players \n" +
//                "can place bets for the next spin\n");
//
//        textArea.setText(sb.toString());
//    }
//
//    private void playGame() {
//        String betAmountStr = betAmountField.getText();
//        String betType = (String) betTypeComboBox.getSelectedItem();
//
//        if (betAmountStr.isEmpty() || betType.isEmpty()) {
//            JOptionPane.showMessageDialog(frame, "Please enter a bet amount and select a bet type.");
//            return;
//        }
//
//        int betAmount;
//        try {
//            betAmount = Integer.parseInt(betAmountStr);
//        } catch (NumberFormatException e) {
//            JOptionPane.showMessageDialog(frame, "Please enter a valid bet amount.");
//            return;
//        }
//
//        int winningNumber = random.nextInt(37); // 0 to 36
//        String winningColor = (winningNumber == 0) ? "Green" : (winningNumber % 2 == 0 ? "Black" : "Red");
//
//        StringBuilder sb = new StringBuilder();
//        sb.append("The winning number is: ").append(winningNumber).append("\n");
//        sb.append("The winning color is: ").append(winningColor).append("\n");
//
//        boolean isWin = false;
//        switch (betType) {
//            case "Number":
//                String chosenNumberStr = JOptionPane.showInputDialog(frame, "Enter the number you bet on (0-36):");
//                int chosenNumber;
//                try {
//                    chosenNumber = Integer.parseInt(chosenNumberStr);
//                    if (chosenNumber == winningNumber) {
//                        isWin = true;
//                    }
//                } catch (NumberFormatException e) {
//                    JOptionPane.showMessageDialog(frame, "Please enter a valid number.");
//                    return;
//                }
//                break;
//            case "Red":
//                if ("Red".equals(winningColor)) isWin = true;
//                break;
//            case "Black":
//                if ("Black".equals(winningColor)) isWin = true;
//                break;
//            case "Odd":
//                if (winningNumber != 0 && winningNumber % 2 != 0) isWin = true;
//                break;
//            case "Even":
//                if (winningNumber != 0 && winningNumber % 2 == 0) isWin = true;
//                break;
//        }
//
//        if (isWin) {
//            sb.append("Congratulations! You won the bet of ").append(betAmount).append(" on ").append(betType).append("!\n");
//        } else {
//            sb.append("Sorry, you lost the bet of ").append(betAmount).append(" on ").append(betType).append(".\n");
//        }
//
//        textArea.setText(sb.toString());
//    }
//
//}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class UIFeatures {
    private JFrame frame;
    private JTextArea textArea;
    private JRadioButton playInstructions, playGame;
    private JRadioButton betNumber, betRed, betBlack, betOdd, betEven;
    private ButtonGroup betTypeGroup;
    private JTextField betAmountField;
    private Random random;

    public UIFeatures() {
        random = new Random();

        frame = new JFrame("Roulette");
        frame.setSize(600, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Load the image
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\raide\\IdeaProjects\\Projct7\\src\\Routtlespinner.jpg"); // Ensure this path is correct

        // Resize the image
        Image originalImage = imageIcon.getImage();
        Image resizedImage = originalImage.getScaledInstance(400, 200, Image.SCALE_SMOOTH); // Change width and height as needed
        ImageIcon resizedIcon = new ImageIcon(resizedImage);

        // Create a label with the resized icon
        JLabel imageLabel = new JLabel(resizedIcon);
        imageLabel.setHorizontalAlignment(JLabel.CENTER);
        imageLabel.setVerticalAlignment(JLabel.CENTER);

        // Create a title label
        JLabel titleLabel = new JLabel("WELCOME TO THE GAME OF ROULETTE");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 22));
        titleLabel.setHorizontalAlignment(JLabel.CENTER);

        // Create a panel to hold the image and the title
        JPanel northPanel = new JPanel();
        northPanel.setLayout(new BorderLayout());
        northPanel.add(imageLabel, BorderLayout.NORTH);
        northPanel.add(titleLabel, BorderLayout.SOUTH);

        textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 20));
        JScrollPane scrollPane = new JScrollPane(textArea);

        frame.setLayout(new BorderLayout());
        frame.add(northPanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Create a panel for the betting inputs and buttons
        JPanel bettingPanel = new JPanel();
        bettingPanel.setLayout(new GridLayout(3, 2));

        JLabel betAmountLabel = new JLabel("Bet Amount:");
        betAmountField = new JTextField();

        // Radio buttons for bet types
        betNumber = new JRadioButton("Number");
        betRed = new JRadioButton("Red");
        betBlack = new JRadioButton("Black");
        betOdd = new JRadioButton("Odd");
        betEven = new JRadioButton("Even");

        // Group the bet type radio buttons
        betTypeGroup = new ButtonGroup();
        betTypeGroup.add(betNumber);
        betTypeGroup.add(betRed);
        betTypeGroup.add(betBlack);
        betTypeGroup.add(betOdd);
        betTypeGroup.add(betEven);

        // Add the components to the betting panel
        bettingPanel.add(betAmountLabel);
        bettingPanel.add(betAmountField);
        bettingPanel.add(betNumber);
        bettingPanel.add(betRed);
        bettingPanel.add(betBlack);
        bettingPanel.add(betOdd);
        bettingPanel.add(betEven);

        frame.add(bettingPanel, BorderLayout.WEST);

        // Create a panel for the radio buttons
        playInstructions = new JRadioButton("Instructions");
        playInstructions.setBackground(Color.YELLOW);
        playGame = new JRadioButton("Place Bets");
        playGame.setBackground(Color.GREEN);

        ButtonGroup mainButtonGroup = new ButtonGroup();
        mainButtonGroup.add(playInstructions);
        mainButtonGroup.add(playGame);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(playInstructions);
        buttonPanel.add(playGame);

        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.setVisible(true);

        playGame.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                playGame();
            }
        });

        playInstructions.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                playerInstructions();
            }
        });
    }

    private void playerInstructions() {
        StringBuilder sb = new StringBuilder();
        sb.append("Roulette is a game of chance, so your \n" +
                "odds of winning on each spin are the\n" +
                "same, regardless of whether you've won  \n" +
                "before. However, you can control how much  \n" +
                "you bet, how long you play\n" +
                "-------------------------------\n");

        sb.append("Here are some basic rules of roulette:\n" +
                "Objective: Predict where the ball will land on \n" +
                "the spinning wheel\n" +
                "\n" +
                "Bets: Place chips on the inside or outside \n" +
                "sections of the table, on specific numbers, \n" +
                "or on groups of numbers\n" +
                "\n" +
                "Payouts: Depending on how specific your \n" +
                "prediction was, you can win up to 35 times \n" +
                "your bet\n" +
                "\n" +
                "Winning number: After the ball stops spinning, \n" +
                "the dealer will announce the winning number \n" +
                "and the color of the pocket it landed in\n" +
                "\n" +
                "Winning bets: Markers are usually used to mark \n" +
                "winning bets, and then the dealer pays out \n" +
                "the winners\n" +
                " \n" +
                "Losing bets: The dealer sweeps losing bets off \n" +
                "the table\n" +
                "\n" +
                "Next spin: Once payouts are complete, players \n" +
                "can place bets for the next spin\n");

        textArea.setText(sb.toString());
    }

    private void playGame() {
        String betAmountStr = betAmountField.getText();
        if (betAmountStr.isEmpty() || !isBetTypeSelected()) {
            JOptionPane.showMessageDialog(frame, "Please enter a bet amount and select a bet type.");
            return;
        }

        int betAmount;
        try {
            betAmount = Integer.parseInt(betAmountStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Please enter a valid bet amount.");
            return;
        }

        int winningNumber = random.nextInt(37); // 0 to 36
        String winningColor = (winningNumber == 0) ? "Green" : (winningNumber % 2 == 0 ? "Black" : "Red");

        StringBuilder sb = new StringBuilder();
        sb.append("The winning number is: ").append(winningNumber).append("\n");
        sb.append("The winning color is: ").append(winningColor).append("\n");

        boolean isWin = false;
        if (betNumber.isSelected()) {
            String chosenNumberStr = JOptionPane.showInputDialog(frame, "Enter the number you bet on (0-36):");
            int chosenNumber;
            try {
                chosenNumber = Integer.parseInt(chosenNumberStr);
                if (chosenNumber == winningNumber) {
                    isWin = true;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(frame, "Please enter a valid number.");
                return;
            }
        } else if (betRed.isSelected() && "Red".equals(winningColor)) {
            isWin = true;
        } else if (betBlack.isSelected() && "Black".equals(winningColor)) {
            isWin = true;
        } else if (betOdd.isSelected() && winningNumber != 0 && winningNumber % 2 != 0) {
            isWin = true;
        } else if (betEven.isSelected() && winningNumber != 0 && winningNumber % 2 == 0) {
            isWin = true;
        }

        if (isWin) {
            sb.append("Congratulations! You won the bet of ").append(betAmount).append(" on ").append(getSelectedBetType()).append("!\n");
        } else {
            sb.append("Sorry, you lost the bet of ").append(betAmount).append(" on ").append(getSelectedBetType()).append(".\n");
        }

        textArea.setText(sb.toString());
    }

    private boolean isBetTypeSelected() {
        return betNumber.isSelected() || betRed.isSelected() || betBlack.isSelected() || betOdd.isSelected() || betEven.isSelected();
    }

    private String getSelectedBetType() {
        if (betNumber.isSelected()) {
            return "Number";
        } else if (betRed.isSelected()) {
            return "Red";
        } else if (betBlack.isSelected()) {
            return "Black";
        } else if (betOdd.isSelected()) {
            return "Odd";
        } else if (betEven.isSelected()) {
            return "Even";
        }
        return "";
    }
}

