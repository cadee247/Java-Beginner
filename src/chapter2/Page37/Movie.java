package chapter2.Page37;

class Movie {
    String title;
    String genre;
    int rating;

    void playIt() {
        System.out.println("🎬 Playing \"" + title + "\"...");
    }

    void displayInfo() {
        System.out.println("🎞️ Title: " + title);
        System.out.println("📚 Genre: " + genre);
        System.out.println("⭐ Rating: " + rating);
    }

    void rate(int newRating) {
        rating = newRating;
        System.out.println("✅ Rating updated to " + rating);
    }

    @Override
    public String toString() {
        return "Movie{title='" + title + "', genre='" + genre + "', rating=" + rating + "}";
    }
}