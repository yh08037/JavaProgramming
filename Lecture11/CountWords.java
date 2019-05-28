import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        String URLString = "http://websitetips.com/articles/copy/lorem/ipsum.txt";
        try {
            java.net.URL url = new java.net.URL(URLString);
            int count = 0;
            Scanner input = new Scanner(url.openStream());
            while (input.hasNext()) { count++; input.next(); }
            // while (input.hasNext()) {
            //     String[] tokens = input.nextLine().split("[\t| |\n]");
            //     if(tokens[0].equals("")) continue;
            //     count += tokens.length;
            // }
            System.out.println(count);
        } catch (java.net.MalformedURLException ex) {
            System.out.println("Invaild URL");
        } catch (java.io.IOException ex) {
            System.out.println("IO Errors");
        }
    }
}
