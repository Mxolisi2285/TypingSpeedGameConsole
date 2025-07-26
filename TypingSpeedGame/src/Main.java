import java.util.*;

public class Main {

    static String[] sentences = {
            "The quick brown fox jumps over the lazy dog.",
            "Typing fast is a skill that improves with practice.",
            "Java is a powerful and versatile programming language.",
            "Always remember to write clean and maintainable code.",
            "Developers build the future one line at a time."
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain;

        do {
            System.out.println("\n🧠 Typing Speed Test");
            System.out.println("Type the sentence below as fast and accurately as you can:");

            // Pick random sentence
            String sentence = getRandomSentence();
            System.out.println("\n👉 \"" + sentence + "\"");

            System.out.println("\nPress Enter when ready...");
            scanner.nextLine();

            // Start timing
            System.out.print("\nStart typing: ");
            long startTime = System.currentTimeMillis();
            String userInput = scanner.nextLine();
            long endTime = System.currentTimeMillis();

            // Time taken
            double timeTaken = (endTime - startTime) / 1000.0;

            // Words Per Minute
            int wordCount = sentence.split("\\s+").length;
            double wpm = (wordCount / timeTaken) * 60;

            // Accuracy calculation (character-level)
            double accuracy = calculateAccuracy(sentence, userInput);

            // Word-level correct words
            int correctWords = countCorrectWords(sentence, userInput);

            // Keystroke speed
            double kps = userInput.length() / timeTaken;

            // Display Results
            System.out.printf("\n⏱️ Time Taken: %.2f seconds\n", timeTaken);
            System.out.printf("📈 Words Per Minute: %.2f WPM\n", wpm);
            System.out.printf("🎯 Accuracy: %.2f%%\n", accuracy);
            System.out.printf("✅ Correct Words: %d/%d\n", correctWords, wordCount);
            System.out.printf("⌨️ Keystrokes per second: %.2f\n", kps);

            // Feedback
            printFeedback(sentence, userInput);

            // Play again?
            System.out.print("\n🔁 Do you want to play again? (y/n): ");
            String response = scanner.nextLine();
            playAgain = response.equalsIgnoreCase("y");

        } while (playAgain);

        System.out.println("\n🚀 Thanks for playing. Keep practicing!");
        scanner.close();
    }

    static String getRandomSentence() {
        Random rand = new Random();
        return sentences[rand.nextInt(sentences.length)];
    }

    static double calculateAccuracy(String expected, String actual) {
        int correctChars = 0;
        int minLen = Math.min(expected.length(), actual.length());
        for (int i = 0; i < minLen; i++) {
            if (Character.toLowerCase(expected.charAt(i)) == Character.toLowerCase(actual.charAt(i))) {
                correctChars++;
            }
        }
        return ((double) correctChars / expected.length()) * 100;
    }

    static int countCorrectWords(String expected, String actual) {
        String[] expectedWords = expected.toLowerCase().split("\\s+");
        String[] actualWords = actual.toLowerCase().split("\\s+");
        int count = 0;
        for (int i = 0; i < Math.min(expectedWords.length, actualWords.length); i++) {
            if (expectedWords[i].equals(actualWords[i])) {
                count++;
            }
        }
        return count;
    }

    static void printFeedback(String expected, String actual) {
        System.out.println("\n📝 Feedback:");
        int minLen = Math.min(expected.length(), actual.length());

        for (int i = 0; i < minLen; i++) {
            if (expected.charAt(i) == actual.charAt(i)) {
                System.out.print(expected.charAt(i)); // correct
            } else {
                System.out.print("*"); // mistake
            }
        }

        // Highlight remaining characters
        if (actual.length() < expected.length()) {
            System.out.print(expected.substring(actual.length()));
        } else if (actual.length() > expected.length()) {
            System.out.print(" [Extra input: " + actual.substring(expected.length()) + "]");
        }

        System.out.println();
    }
}
