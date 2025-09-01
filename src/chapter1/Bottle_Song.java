package chapter1;

public class Bottle_Song {
    public static void main(String[] args) {
        int bottlesNum = 10;

        while (bottlesNum > 0) {
            // Determine correct word based on bottle count
            String word = (bottlesNum == 1) ? "bottle" : "bottles";

            // Print the verse
            System.out.println(bottlesNum + " green " + word + ", hanging on the wall");
            System.out.println(bottlesNum + " green " + word + ", hanging on the wall");
            System.out.println("And if one green bottle should accidentally fall,");

            // Decrement bottle count
            bottlesNum--;

            // Update word again for the new count
            word = (bottlesNum == 1) ? "bottle" : "bottles";

            // Print the result of the fall
            if (bottlesNum > 0) {
                System.out.println("There'll be " + bottlesNum + " green " + word + ", hanging on the wall");
            } else {
                System.out.println("There'll be no green bottles, hanging on the wall");
            }

            // Add a blank line between verses
            System.out.println();
        }

        // Call PhraseOMatic after the song finishes
        PhraseOMatic.generatePhrase();
    }
}

// Secondary class — not public
class PhraseOMatic {
    public static void generatePhrase() {
        // First group of descriptive words
        String[] wordListOne = {
                "happy", "bright", "fast", "small", "fun", "brave", "quiet"
        };

        // Second group of color words
        String[] wordListTwo = {
                "red", "blue", "green", "yellow", "pink", "orange", "purple"
        };

        // Third group of objects and animals
        String[] wordListThree = {
                "cat", "dog", "car", "ball", "tree", "book", "bird"
        };

        // Create a random number generator
        java.util.Random randomGenerator = new java.util.Random();

        // Pick one random index from each list
        int rand1 = randomGenerator.nextInt(wordListOne.length);
        int rand2 = randomGenerator.nextInt(wordListTwo.length);
        int rand3 = randomGenerator.nextInt(wordListThree.length);

        // Combine the random words into a phrase
        String phrase = wordListOne[rand1] + " " +
                wordListTwo[rand2] + " " +
                wordListThree[rand3];

        // Print the final phrase to the screen
        System.out.println("What we need is a " + phrase);
    }
}