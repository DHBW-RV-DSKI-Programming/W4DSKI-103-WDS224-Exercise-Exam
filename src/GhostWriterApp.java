public class GhostWriterApp {

    public static void main(String[] args) {
        System.out.println(TextAnalyzer.countVowels("From great power comes great responsibility."));
        System.out.println(TextAnalyzer.countVowels(""));
        System.out.println(TextAnalyzer.countVowels(" "));
        System.out.println(TextAnalyzer.countVowels(null));
    }

}
