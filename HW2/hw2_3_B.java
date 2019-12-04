//  2018115809, 김도훈, COMP217001, Homewwork 2-3

//  주어진 hw2_3_B.java 의 코드 중 IntegerMatrixTest() 와 DoubleMatrixTest() 에서
//  덧셈과 곱셈에 대한 결과값에 해당하는 행렬을 rr 로 중복하여 사용하고 있습니다.
//  이로 인해 생기는 곱셈의 결과의 오류를 해결하기 위해 ComplexMatrixTest() 와 같이
//  각각의 메소드에 rr 배열 대신 r1, r2 배열을 생성하여 각각의 결과를 저장하였습니다.

public class hw2_3_B {
  static void IntegerMatrixTest() {
    // Create Integer arrays m1, m2
    Integer[][] m1 = new Integer[][]{{1, 2, 3}, {4, 5, 6}, {1, 1, 1}};
    Integer[][] m2 = new Integer[][]{{1, 1, 1}, {2, 2, 2}, {0, 0, 0}};
    Integer[][] r1 = new Integer[m1.length][m1[0].length];
    Integer[][] r2 = new Integer[m1.length][m1[0].length];

    // Create an instance of IntegerMatrix
    IntegerMatrix integerMatrix = new IntegerMatrix();

    System.out.println("m1 + m2 is ");
    integerMatrix.addMatrix(r1, m1, m2);
    System.out.println(integerMatrix.toString(r1));

    System.out.println("m1 * m2 is ");
    integerMatrix.multiplyMatrix(r2, m1, m2);
    System.out.println(integerMatrix.toString(r2));
  }

  static void DoubleMatrixTest() {
    // Create Double arrays m1, m2
    Double[][] m1 = new Double[][]{
      {0.1, -0.2, 1.3}, {1.4, 1.5, -0.6}, {1.1, 1.1, -0.1}};
    Double[][] m2 = new Double[][]{
      {-0.1, 0.1, -0.1}, {0.2, 1.2, 1.2}, {0.0, 1.0, 1.0}};
    Double[][] r1 = new Double[m1.length][m1[0].length];
    Double[][] r2 = new Double[m1.length][m1[0].length];

    // Create an instance of DoubleMatrix
    DoubleMatrix doubleMatrix = new DoubleMatrix();

    System.out.println("m1 + m2 is ");
    doubleMatrix.addMatrix(r1, m1, m2);
    System.out.println(doubleMatrix.toString(r1));
    //Double[][] rr = doubleMatrix.addMatrix(m1, m2);
    //System.out.println("m1 + m2 is " + rr);

    System.out.println("m1 * m2 is ");
    doubleMatrix.multiplyMatrix(r2, m1, m2);
    System.out.println(doubleMatrix.toString(r2));
  }

  static void ComplexMatrixTest() {
    // Create Complex arrays m1, m2
    final int nrows = 2;
    final int ncols = 3;
    Complex[][] m1 = new Complex[nrows][ncols];
    Complex[][] m2 = new Complex[nrows][ncols];
    Complex[][] m3 = new Complex[ncols][nrows];
    Complex[][] r1 = new Complex[nrows][ncols];
    Complex[][] r2 = new Complex[nrows][nrows];
    for (int i=0; i<m1.length; i++) {
      for (int j=0; j<m1[i].length; j++) {
    	m1[i][j] = new Complex((double)i+1,(double)j+0.5);
    	m2[i][j] = new Complex((double)j+1,(double)i+0.5);
    	m3[j][i] = new Complex((double)i+1,(double)j+0.5);
      }
    }

    // Create an instance of ComplexMatrix
    ComplexMatrix complexMatrix = new ComplexMatrix();

    System.out.println("m1 + m2 is ");
    complexMatrix.addMatrix(r1, m1, m2);
    System.out.println(complexMatrix.toString(r1));

    System.out.println("m1 * m3 is ");
    complexMatrix.multiplyMatrix(r2, m1, m3);
    System.out.println(complexMatrix.toString(r2));
  }

  public static void main(String[] args) {
    IntegerMatrixTest();
    DoubleMatrixTest();
    ComplexMatrixTest();
  }
}
