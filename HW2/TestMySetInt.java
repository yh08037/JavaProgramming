//  2018115809, 김도훈, COMP217001, Homewwork 2-1

import java.io.File;
import java.util.Scanner;

class MySetInt {
    private static final int MAX_ELEMENTS = 10;
    private int[] elements = new int[MAX_ELEMENTS];
    private int num_elements = 0;

    public int[] getElements() {
        return elements;
    } // elements 필드의 get 메소드를 추가하였습니다.

    public int numelms() {
        return num_elements;
    } // O1

    public boolean isIn(int x) { // O2
        for (int i = 0; i < num_elements; i++) if (elements[i] == x) return true;
        return false;
    }

    public boolean add(int x) { // O3
        int idx = 0;
        for (int i = 0; i < num_elements; i++) {
            if (elements[i] == x) return true;
            if (elements[i] > x) break;
            idx++;
        }
        if (num_elements == MAX_ELEMENTS) return false;
        if (num_elements - idx >= 0)
            System.arraycopy(elements, idx, elements, idx + 1, num_elements - idx);
        elements[idx] = x;
        num_elements++;
        return true;
    }

    public void remove(int x) { // O4
        for (int i = 0; i < num_elements; i++) {
            if (elements[i] == x) {
                if (num_elements - 1 - i >= 0)
                    System.arraycopy(elements, i + 1, elements, i, num_elements - 1 - i);
                num_elements--;
                break;
            }
        }
    }

    public boolean union(MySetInt X, MySetInt Y) { // O5: this = X U Y  returns false if overflowed */
        MySetInt dif = new MySetInt();
        dif.difference(Y, X);
        int numD = dif.numelms();
        if (X.numelms() + numD > MAX_ELEMENTS) return false;
        copy(X);
        for (int i = 0; i < numD; i++) add(dif.getElements()[i]);
        num_elements = X.numelms() + numD;
        return true;
    }

    public void intersection(MySetInt X, MySetInt Y) { // O6: this = X and Y
        this.num_elements = 0;
        int[] tmp = X.getElements();
        for (int i = 0; i < X.numelms(); i++) {
            if (Y.isIn(tmp[i])) this.add(tmp[i]);
        }
    }

    public void difference(MySetInt X, MySetInt Y) { // O7: this = X - Y
        this.num_elements = 0;
        int[] tmp = X.getElements();
        for (int i = 0; i < X.numelms(); i++) {
            if (!Y.isIn(tmp[i])) this.add(tmp[i]);
        }
    }

    public void complement(MySetInt X, MySetInt U) { // O8: this = X^c where U is universal set
        difference(U, X);
    }

    public void print() { // prints the set as '{1 2 3}'
        System.out.print("{");
        for (int i = 0; i < num_elements - 1; i++) System.out.print(elements[i] + " ");
        System.out.println(elements[num_elements - 1] + "}");
    }

    public void copy(MySetInt X) { // O9: this = X
        num_elements = X.numelms();
        int[] tmp = X.getElements();
        if (num_elements >= 0)
            System.arraycopy(tmp, 0, elements, 0, num_elements);
    }

    /* add your own methods or variable if necessary */
}

public class TestMySetInt {
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.out.println("Usage: java FindStatistics sourceFile");
            System.exit(1);
        }

        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[0] + " does not exists");
            System.exit(2);
        }

        try (Scanner sc = new Scanner(sourceFile)) {
            String[] SetNames = new String[]{"A", "B", "C", "D", "U"};

            MySetInt[] mysets = new MySetInt[SetNames.length];
            for (int i = 0; i < mysets.length; i++) {
                mysets[i] = new MySetInt();
            }

            while (sc.hasNextLine()) {
                String[] tokens = sc.nextLine().split(" ");
                if (tokens[0].equals("exit")) {
                    System.exit(3);
                } else if (tokens[0].equals("numel")) {
                    System.out.println(mysets[indexOf(tokens[1])].numelms());
                } else if (tokens.length == 3) {
                    MySetInt X = mysets[indexOf(tokens[1])];
                    if (Character.isDigit(tokens[2].charAt(0))) {
                        int data = Integer.parseInt(tokens[2]);
                        switch (tokens[0]) {
                            case "isin":
                                System.out.println(X.isIn(data));
                                break;
                            case "add":
                                if (X.add(data) && mysets[4].add(data)) X.print();
                                else System.out.println("overflow");
                                break;
                            case "remove":
                                X.remove(data);
                                X.print();
                                break;
                        }
                    } else {
                        MySetInt Y = mysets[indexOf(tokens[2])];
                        switch (tokens[0]) {
                            case "copy":
                                X.copy(Y);
                                X.print();
                                break;
                            case "complement":
                                X.complement(Y, mysets[4]);
                                X.print();
                                break;
                        }
                    }
                } else if (tokens.length == 4) {
                    MySetInt Z = mysets[indexOf(tokens[1])];
                    MySetInt X = mysets[indexOf(tokens[2])];
                    MySetInt Y = mysets[indexOf(tokens[3])];
                    switch (tokens[0]) {
                        case "union":
                            if (Z.union(X, Y)) Z.print();
                            else System.out.println("overflow");
                            break;
                        case "intersection":
                            Z.intersection(X, Y);
                            Z.print();
                            break;
                        case "difference":
                            Z.difference(X, Y);
                            Z.print();
                            break;
                    }
                }
            }
        }
    }

    // 문자열 A, B, C, D, U로부터 배열 SetNames의 인덱스를 반환하는 메소드
    // 배열 mysets의 요소 객체에 쉽게 접근하기 위함
    private static int indexOf(String str) {
        switch (str) {
            case "A":
                return 0;
            case "B":
                return 1;
            case "C":
                return 2;
            case "D":
                return 3;
            default:
                return 4;
        }
    }
}
