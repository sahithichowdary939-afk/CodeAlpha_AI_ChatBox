public class NLPProcessor {

    public String processInput(String input) {

        input = input.toLowerCase();

        input = input.replace("?", "");
        input = input.replace("!", "");
        input = input.replace(".", "");

        return input;
    }
}