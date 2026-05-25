public class ChatbotEngine {

    private NLPProcessor processor;
    private ResponseDatabase database;

    public ChatbotEngine() {

        processor = new NLPProcessor();
        database = new ResponseDatabase();
    }

    public String getBotReply(String userInput) {

        String processedInput = processor.processInput(userInput);

        return database.getResponse(processedInput);
    }
}