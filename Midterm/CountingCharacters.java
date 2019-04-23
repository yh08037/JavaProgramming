public class CountingCharacters {
    public static void main(String[]args){
        int temp;
        char[] arr = new char[100];
        for ( int i = 0; i < 100; i++ ) {
            temp = (int) (Math.random() * 62);
            if ( temp < 26 ) {
                arr[i] = getRandomLowerCaseLetter();
            } else if ( temp < 52 ) {
                arr[i] = getRandomUpperCaseLetter();
            } else {
                arr[i] = getRandomDigitCharacter();
            }
        }

        int[] cnt = new int[3];

        for ( int i = 0; i < 100; i++ ) {
            if ( isLowerCaseLetter(arr[i]) ) cnt[0]++;
            else if ( isUpperCaseLetter(arr[i]) ) cnt[1]++;
            else if ( isDigitLetter(arr[i]) ) cnt[2]++;
        }

        for ( int v : cnt ) {
            System.out.print(v + " ");
        }
        System.out.println();
        System.out.println("Sum of three numbers : " + (cnt[0]+cnt[1]+cnt[2]));
    }

    private static char getRandomCharacter(char ch1, char ch2) {
        return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    private static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }

    private static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }

    private static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }

    private static boolean isLowerCaseLetter(char ch) {
        return ch >= 'a' && ch <= 'z';
    }

    private static boolean isUpperCaseLetter(char ch) {
        return ch >= 'A' && ch <= 'Z';
    }

    private static boolean isDigitLetter(char ch) {
        return ch >= '0' && ch <= '9';
    }
}