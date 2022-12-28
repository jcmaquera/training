package ActivityRegex;

public class RegexAct {


    public static void main(String[] args) {

        String phrase = "JACK AND JILL WENT UP THE THE HILL";
        String[] words = phrase.split(" ");

        String previousWord = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.equals(previousWord)) {
                System.out.println("Repeated word: " + word);
            }
            previousWord = word;
        }

    }
}
