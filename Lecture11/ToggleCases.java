import java.util.Scanner;

public class ToggleCases {
    public static void main(String[] args) {
        String URLString = "http://websitetips.com/articles/copy/lorem/ipsum.txt";
        try {
            java.net.URL url = new java.net.URL(URLString);
            Scanner input = new Scanner(url.openStream());

            while (input.hasNextLine()) {
                String line = input.nextLine();
                for (int i = 0; i < line.length(); i++) {
                    char tmp = line.charAt(i);
                    if (Character.isLowerCase(tmp) {
                        System.out.print(Character.toUpperCase(tmp));
                    } else if (Character.isUpperCase(tmp)) {
                        System.out.print(Character.toLowerCase(tmp));
                    } else {
                        System.out.print(tmp);
                    }
                }
                System.out.println();
            }
            
        } catch (java.net.MalformedURLException ex) {
            System.out.println("Invaild URL");
        } catch (java.io.IOException ex) {
            System.out.println("IO Errors");
        }
    }
}
