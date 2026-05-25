import java.util.HashMap;

public class ResponseDatabase {

    private HashMap<String, String> responses;

    public ResponseDatabase() {

        responses = new HashMap<>();

        responses.put("hello", "Hello! How can I help you?");
        responses.put("hi", "Hi there!");
        responses.put("how are you", "I am doing great!");
        responses.put("your name", "I am an AI Chatbot.");
        responses.put("java", "Java is a powerful programming language.");
        responses.put("bye", "Goodbye! Have a nice day.");
        responses.put("help", "You can ask me programming related questions.");
        responses.put("oop", "OOP stands for Object-Oriented Programming.");
        responses.put("nlp", "NLP means Natural Language Processing.");
    }

    public String getResponse(String input) {

        for (String key : responses.keySet()) {

            if (input.contains(key)) {
                return responses.get(key);
            }
        }

        return "Sorry, I don't understand that.";
    }
}