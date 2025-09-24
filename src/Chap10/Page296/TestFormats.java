import java.util.Locale;

public class TestFormats {
    public static void main(String[] args) {
        long myBillion = 1_000_000_000;

        // Force comma formatting by using US or English locale
        String formattedNumber = String.format(Locale.US, "%,d", myBillion);

        System.out.println(formattedNumber); // Output: 1,000,000,000
    }
}