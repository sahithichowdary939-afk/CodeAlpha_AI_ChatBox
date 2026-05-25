import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChatbotGUI extends JFrame implements ActionListener {

    private JTextArea chatArea;
    private JTextField inputField;
    private JButton sendButton;

    private ChatbotEngine chatbot;

    public ChatbotGUI() {

        chatbot = new ChatbotEngine();

        setTitle("AI Chatbot");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        chatArea = new JTextArea();
        chatArea.setEditable(false);
        chatArea.setFont(new Font("Arial", Font.PLAIN, 16));

        JScrollPane scrollPane = new JScrollPane(chatArea);

        inputField = new JTextField();

        sendButton = new JButton("Send");
        sendButton.addActionListener(this);

        JPanel bottomPanel = new JPanel(new BorderLayout());

        bottomPanel.add(inputField, BorderLayout.CENTER);
        bottomPanel.add(sendButton, BorderLayout.EAST);

        add(scrollPane, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);

        chatArea.append("Bot: Hello! I am your AI Chatbot.\n");

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String userText = inputField.getText();

        if (!userText.isEmpty()) {

            chatArea.append("You: " + userText + "\n");

            String botReply = chatbot.getBotReply(userText);

            chatArea.append("Bot: " + botReply + "\n\n");

            inputField.setText("");
        }
    }

    public static void main(String[] args) {

        new ChatbotGUI();
    }
}