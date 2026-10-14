public class notes {
    public static void main(String[] args) {

//        for (int i = 1; i<11;i++){
//            System.out.println(i);
//        }
//        int i = 10;
//        while (i >0){
//            System.out.println(i);
//            i--;
//        }
//        int[] numbers ={5,10,15,20,25};
//        for (int i = 0; i < numbers.length;i++){
//            System.out.println(numbers[i]);
//        }
//        int[][] matrix = {
//                {1,2,3},
//                {4,5,6}
//        };
//        System.out.println(matrix[0][1]);
//        System.out.println(matrix[1][0]);
//        System.out.println(matrix[1][2]);
//        int[][] matrix = {
//                {2,4},
//                {6,8},
//                {10,12}
//        };
//        for (int i = 0; i < matrix.length; i++){
//            for (int j = 0; j < matrix[i].length; j++){
//                System.out.print(matrix[i][j]+" ");
//            }
//            System.out.println();
//        }



//        doubleNumber(5);
//        doubleNumber(12);
//        int result = sum(7,8);
//        System.out.println(result);
//      Student student1 = new Student("Ivan", 19);
//        System.out.println(student1.name);
//        System.out.println(student1.age);
//    static void doubleNumber(int x) {
//        System.out.println(x * 2);
//    }



//    static int sum(int a,int b){
//        return a+b;
//        Complex z1 = new Complex(4,-3);
//        System.out.println(z1.real);
//        System.out.println(z1.imaginary);
//        Complex z2 = new Complex(-2,7);
//        Complex result1 = z1.add(z2);
//        System.out.println(result1.real);
//        System.out.println(result1.imaginary);
//        Complex result2 = z1.subtract(z2);
//        System.out.println(result2.real);
//        System.out.println(result2.imaginary);
//        Complex result3=z1.multiply(z2);
//        System.out.println(result3.real);
//        System.out.println(result3.imaginary);
//        Complex h1 = new Complex(4,2);
//        Complex h2 = new Complex(1,1);
//        Complex resultdivide = h1.divide(h2);
//        System.out.println(resultdivide.real);
//        System.out.println(resultdivide.imaginary);
//        Complex[][] matrix = new Complex[2][2];
//        matrix[0][0] = new Complex(2,3);
//        matrix[0][1] = new Complex(4,-5);
//        matrix[1][0] = new Complex(1,2);
//        matrix[1][1] = new Complex(-3,6);
//        for (int i = 0; i < 2; i++){
//            for (int j = 0; j < 2; j++){
//                if (matrix[i][j].imaginary >=0) {
//                    System.out.print(matrix[i][j].real + "+" + matrix[i][j].imaginary + "i" + " ");
//                } else{
//                    System.out.print(matrix[i][j].real +""+ matrix[i][j].imaginary + "i" + " ");
//                }
//            }
//            System.out.println();
//        }



//        ComplexMatrix cm1 = new ComplexMatrix(3,4);
//        System.out.println(cm1.rows);
//        System.out.println(cm1.cols);
//        System.out.println(cm1.data[0][1].imaginary);
//        for (int i =0; i < cm1.rows; i++){
//            for (int j = 0; j < cm1.cols; j++){
//                cm1.data[i][j] = new Complex(i,j);
//            }
//        }
//        System.out.println(cm1.data[2][3].real);
//        System.out.println(cm1.data[2][3].imaginary);
//        Complex number = cm1.getelement(1,2);
//        System.out.println(number.real);
//        System.out.println(number.imaginary);
//
//
//
//        cm1.setelement(0,1,new Complex(7,-2));
//        number = cm1.getelement(0,1);
//        System.out.println(number.real);
//        System.out.println(number.imaginary);


//        ComplexMatrix HH1 = new ComplexMatrix(2,2);
//        ComplexMatrix HH2 = new ComplexMatrix(2,2);
//
//
//        HH1.setelement(0,0,new Complex(1,2));
//        HH1.setelement(0,1,new Complex(3,1));
//        HH1.setelement(1,0,new Complex(2,-1));
//        HH1.setelement(1,1,new Complex(4,3));
//
//        HH2.setelement(0,0,new Complex(2,1));
//        HH2.setelement(0,1,new Complex(1,3));
//        HH2.setelement(1,0,new Complex(3,2));
//        HH2.setelement(1,1,new Complex(2,-1));
//
//        ComplexMatrix resulthh = HH1.add(HH2);
//
//        Complex resulthhh = resulthh.getelement(1,1);
//        System.out.println(resulthhh.real);
//        System.out.println(resulthhh.imaginary);
//
//
//        ComplexMatrix resulttr = HH1.transpose();
//        Complex number = resulttr.getelement(0, 1);
//        System.out.println(number.real);
//        System.out.println(number.imaginary);
//
//
//
//        ComplexMatrix nn1 = new ComplexMatrix(2,2);
//        ComplexMatrix nn2 = new ComplexMatrix(2,2);
//
//        nn1.setelement(0,0,new Complex(1,0));
//        nn1.setelement(0,1,new Complex(2,0));
//        nn1.setelement(1,0,new Complex(3,0));
//        nn1.setelement(1,1,new Complex(4,0));
//
//        nn2.setelement(0,0,new Complex(5,0));
//        nn2.setelement(0,1,new Complex(6,0));
//        nn2.setelement(1,0,new Complex(7,0));
//        nn2.setelement(1,1,new Complex(8,0));
//
//
//        nn1.setelement(0,0,new Complex(1,2));
//        nn2.setelement(0,0,new Complex(5,1));
//
//
//        ComplexMatrix numbermul = nn1.multiply(nn2);
//        System.out.println(numbermul.getelement(0,0).real);
//        System.out.println(numbermul.getelement(0,1).real);
//        System.out.println(numbermul.getelement(1,0).real);
//        System.out.println(numbermul.getelement(1,1).real);
//
//        nn1.setelement(0,0,new Complex(1,2));
//        nn2.setelement(0,0,new Complex(5,1));
//        System.out.println(numbermul.getelement(0,0).real);
//        System.out.println(numbermul.getelement(0,0).imaginary);

//        ComplexMatrix zz = new ComplexMatrix(2,2);
//        zz.setelement(0,0,new Complex(1,1));
//        zz.setelement(0,1,new Complex(2,0));
//        zz.setelement(1,0,new Complex(3,0));
//        zz.setelement(1,1,new Complex(4,0));
//        Complex result = zz.determinant();
//        System.out.println(result.real);
//        System.out.println(result.imaginary);

//        ComplexMatrix kkk = new ComplexMatrix(2,2);
//        kkk.setelement(0,0, new Complex (2,0));
//        kkk.setelement(0,1, new Complex (1,0));
//        kkk.setelement(1,0, new Complex (1,0));
//        kkk.setelement(1,1, new Complex (1,0));
//        ComplexMatrix resultttt = kkk.inverse();
//        System.out.println(kkk.getelement(0, 0).real);
//        System.out.println(kkk.getelement(0, 1).real);
//        System.out.println(resultttt.getelement(0,0).real);
//        System.out.println(resultttt.getelement(0,1).real);
//        System.out.println(resultttt.getelement(1,0).real);
//        System.out.println(resultttt.getelement(1,1).real);




//        ComplexMatrix kkk = new ComplexMatrix(2, 2);
//        kkk.setelement(0, 0, new Complex(1, 0));
//        kkk.setelement(0, 1, new Complex(2, 0));
//        kkk.setelement(1, 0, new Complex(2, 0));
//        kkk.setelement(1, 1, new Complex(4, 0));
//        ComplexMatrix result = kkk.inverse();
//        System.out.println(result.getelement(0, 0).real);
//        System.out.println(result.getelement(0, 1).real);
//        System.out.println(result.getelement(1, 0).real);
//        System.out.println(result.getelement(1, 1).real);




//        ComplexMatrix aaa = new ComplexMatrix(2, 2);
//        ComplexMatrix bbb = new ComplexMatrix(2, 2);
//        aaa.setelement(0, 0, new Complex(2, 0));
//        aaa.setelement(0, 1, new Complex(4, 0));
//        aaa.setelement(1, 0, new Complex(6, 0));
//        aaa.setelement(1, 1, new Complex(8, 0));
//        bbb.setelement(0, 0, new Complex(2, 0));
//        bbb.setelement(0, 1, new Complex(0, 0));
//        bbb.setelement(1, 0, new Complex(0, 0));
//        bbb.setelement(1, 1, new Complex(2, 0));
//        ComplexMatrix result = aaa.divide(bbb);
//        System.out.println(result.getelement(0, 0).real);
//        System.out.println(result.getelement(0, 1).real);
//        System.out.println(result.getelement(1, 0).real);
//        System.out.println(result.getelement(1, 1).real);
    }
}
