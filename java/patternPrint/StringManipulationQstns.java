package patternPrint;

public class StringManipulationQstns {

    //program to find special character in a string
    public static void findSpecialCharacterInAString(String testString) {
        System.out.print("Special character are: ");
        for (int i = 0; i < testString.length(); i++) {
            char currentChar = testString.charAt(i);
            if (!(Character.isLetter(currentChar) || Character.isDigit(currentChar))) {
                System.out.print(currentChar);
            }
        }
    }

    /*
    Java program to print all unique words present in the string. The task is to print all words occurring only once in the string.

        Illustration:

        Input  : Welcome to Geeks for Geeks.
        Output : Welcome
                 to
                 for
     */
    public static void printUniqueWordsInAString(String testString) {
        String[] wordsInString = testString.split(" ");

        //Using MAP
        /*Map wordMap = new LinkedHashMap();
        for (int i = 0; i < wordsInString.length; i++) {
            wordMap.put(wordsInString[i], i);
        }
        System.out.println("Below are the unique words in the sentence");
        Set uniqWords = wordMap.keySet();
        Iterator wordItr = uniqWords.iterator();
        while (wordItr.hasNext()) {
            System.out.println(wordItr.next());
        }*/

        //Using nested Loop
        for (int i = 0; i < wordsInString.length; i++) {
            for (int j = i + 1; j < wordsInString.length; j++) {
                if (wordsInString[i].equals(wordsInString[j])) {
                    wordsInString[j] = "";
                }
            }
            if (!wordsInString[i].equals(""))
                System.out.print(wordsInString[i] + " ");
        }

    }

    public static boolean checkIfPalindrome(String testString) {
        int strlenth = testString.length();
        if (strlenth > 1) {
            for (int i = 0; i < strlenth / 2; i++) {
                if (!(testString.charAt(i) == testString.charAt(strlenth - i - 1))) {
                    return false;
                }
            }
        }
        return true;

    }

    public static void printAllPalindromeInAString(String testString){
        for (int i = 1; i < testString.length(); i++) {
            String testSubStr = testString.substring(0,i);
            if(checkIfPalindrome(testSubStr)){
                System.out.println(testSubStr);
            }
        }
    }
}



