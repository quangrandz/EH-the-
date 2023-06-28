public class test {

    /**
     * @param args the command line arguments
     */
    
    
    private static List<Integer> findAllAnagramsInText(String text, String pattern) {
        List<Integer> indices = new ArrayList<>();

        int textLen = text.length();
        int patternLen = pattern.length();

        int[] textCharCountInWindow = new int[26];
        int[] patternCharCount = new int[26];

        for (int i = 0; i < patternLen; i++) {
            patternCharCount[pattern.charAt(i) - 'a']++;
        }

        for (int i = 0; i < textLen; i++) {
            textCharCountInWindow[text.charAt(i) - 'a']++;
            if (i >= patternLen) {
                textCharCountInWindow[text.charAt(i - patternLen) - 'a']--;
            }
            if (Arrays.equals(textCharCountInWindow, patternCharCount)) { // loops 26 times no matter the text/pattern length
                indices.add(i - patternLen + 1);
            }
        }

        return indices;
    }
        
    

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}