/* 김도훈 2018115809
 * 암호화된 수를 복호화시키는 방법으로 다음의 방법을 사용하였습니다 :
 * 복호화시킬 값(y)에 10의 배수를 더한 값이 key 로 나누어떨어질 때의 몫
 */

import java.util.Scanner;

public class EncryptMult {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Encryption key r and numbers y1, y2 in thar key : ");
        int r = scan.nextInt();
        int y1 = scan.nextInt();
        int y2 = scan.nextInt();

        int x1 = decrypt(y1, r);
        int x2 = decrypt(y2, r);

        int x3 = x1 * x2;
        int y3 = encrypt(x3, r);

        System.out.println(y1 + "(" + r + ") * " + y2 + "(" + r + ") = "
                + x1 + " * " + x2 + " = " + x3 + " = " + y3 + "(" + r + ")");
    }

    static int decryptOneDigit(int y, int r) {
        while ( y % r != 0 ) y += 10;
        return y / r;
    }

    static int decrypt(int y, int r) {
        int result = 0, tmp = 1;
        while ( y != 0 ) {
            result += tmp * decryptOneDigit((y % 10), r);
            y /= 10; tmp *= 10;
        }
        return result;
    }

    static int encryptOneDigit(int x, int r) {
        return (x * r) % 10;
    }

    static int encrypt(int x, int r) {
        int result = 0, tmp = 1;
        while ( x != 0 ) {
            result += tmp * encryptOneDigit((x % 10), r);
            x /= 10; tmp *= 10;
        }
        return result;
    }
}
