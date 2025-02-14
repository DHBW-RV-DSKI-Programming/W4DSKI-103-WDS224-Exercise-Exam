class TextAnalyzer {

    static int countVowels(String text) {
        if (text == null) { // 1 Punkt
            return -1; // 1 Punkt
        }

        int count = 0; // 0 Punkt → bereits vorgegeben
        text = text.toLowerCase(); // 1 Punkt
        for (int i = 0; i < text.length(); i++) { // 1 Punkt
            char c = text.charAt(i); // 1 Punkt
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') { // 1 Punkt
                count++; // 1 Punkt
            }
        }
        return count; // 1 Punkt
    }

    // 8 Punkte

}
