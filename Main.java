import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        ComplexMatrix a = null;
        ComplexMatrix b = null;
        ComplexMatrix result = null;
        Scanner scanner = new Scanner(System.in);

        int choice = -1;
        while (choice != 0) {
            System.out.println("1. создать матрицу а");
            System.out.println("2. создать матрицу в");
            System.out.println("3. сложить матрицы а и в");
            System.out.println("4. умножить матрицу а на в");
            System.out.println("5. разделить матрицу а на в");
            System.out.println("6. транспонировать матрицу");
            System.out.println("7. вычислить определитель у матрицы");
            System.out.println("8. показать последний результат");
            System.out.println("9. использовать последний результат для следующей операции");
            System.out.println("0. выход");
            choice = readInt(scanner, "ваш выбор : ");



            switch (choice){

                case 1: {
                    System.out.println("создание матрицы а");
                    int rows = readPositiveInt(scanner, "количество строк : ");
                    int cols = readPositiveInt(scanner, "количество столбцов : ");
                    a = new ComplexMatrix(rows, cols);
                    for (int i = 0; i < rows ; i++){
                        for (int j = 0; j < cols ; j++){
                            double real = readDouble(scanner, "действительная часть : ");
                            double imaginary = readDouble(scanner, "мнимая часть : ");
                            a.setelement(i,j,new Complex(real, imaginary));
                        }
                    }
                    break;
                }



                case 2: {
                    System.out.println("создание матрицы в");
                    int rows = readPositiveInt(scanner, "количество строк : ");
                    int cols = readPositiveInt(scanner, "количество столбцов : ");
                    b = new ComplexMatrix(rows, cols);
                    for (int i = 0; i < rows ; i++) {
                        for (int j = 0; j < cols; j++) {
                            double real = readDouble(scanner, "действительная часть : ");
                            double imaginary = readDouble(scanner, "мнимая часть : ");
                            b.setelement(i, j, new Complex(real, imaginary));
                        }
                    }
                    break;
                }



                case 3:{
                    if ( a ==null || b == null) {
                        System.out.println("сначала создайте обе матрицы !");
                        break;
                    }
                    try {
                        result = a.add(b);
                        printMatrix(result);
                    } catch ( IllegalArgumentException e) {
                        System.out.println("ошибка :  " + e.getMessage());
                    }
                    break;
                }



                case 4:{
                    if ( a ==null || b == null){
                        System.out.println("сначала создайте обе матрицы !");
                        break;
                    }
                    try {
                        result = a.multiply(b);
                        printMatrix(result);
                    } catch (IllegalArgumentException e) {
                        System.out.println("ошибка : " + e.getMessage());
                    }
                    break;

                }



                case 5:{
                    if ( a ==null || b == null){
                        System.out.println("сначала создайте обе матрицы !");
                        break;
                    }
                    try {
                        result = a.divide(b);
                        printMatrix(result);
                    } catch (IllegalArgumentException | ArithmeticException e ) {
                        System.out.println("ошибка : " + e.getMessage());
                    }
                    break;
                }



                case 6:{
                    System.out.println("какую матрицу транспонировать ?");
                    System.out.println("1. матрицу а");
                    System.out.println("2. матрицу в");
                    int matrixChoice = readInt(scanner, "ваш выбор : ");
                    if (matrixChoice == 1) {
                        if (a == null) {
                            System.out.println("сначала создайте матрицу а !");
                            break;
                        }
                        result = a.transpose();
                        printMatrix(result);
                    } else if (matrixChoice == 2) {
                        if (b == null) {
                            System.out.println("сначала создайте матрицу в !");
                            break;
                        }
                        result = b.transpose();
                        printMatrix(result);
                    } else {
                        System.out.println("неверный выбор матрицы !");
                    }
                    break;
                }



                case 7:{
                    System.out.println("определитель какой матрицы найти ?");
                    System.out.println("1. матрицу а");
                    System.out.println("2. матрицу в");
                    int matrixChoice = readInt(scanner, "ваш выбор : ");
                    try{
                        if (matrixChoice == 1) {
                            if (a == null) {
                                System.out.println("сначала создайте матрицу а !");
                                break;
                            }
                            Complex resultopr = a.determinant();
                            System.out.println("определитель матрицы а : ");
                            printComplex(resultopr);
                        } else if (matrixChoice == 2) {
                            if (b == null) {
                                System.out.println("сначала создайте матрицу в !");
                                break;
                            }
                            Complex resultopr = b.determinant();
                            System.out.println("определитель матрицы в : ");
                            printComplex(resultopr);
                        } else {
                            System.out.println("неверный выбор матрицы !");
                        }

                } catch (IllegalArgumentException | ArithmeticException e) {
                    System.out.println("ошибка: " + e.getMessage());
                }

                    break;
                }



                case 8:{
                    if (result == null){
                        System.out.println("результата пока нет !");
                        break;
                    }
                    System.out.println("последний рзультат : ");
                    printMatrix(result);
                    break;
                }



                case 9:{
                    if (result == null){
                        System.out.println("сначала выпоните операцию !");
                        break;
                    }
                    System.out.println("какую матрицу заменить результатом ?");
                    System.out.println("1. матрицу а");
                    System.out.println("2. матрицу в");
                    int matrixChoice = readInt(scanner, "ваш выбор : ");
                    if (matrixChoice == 1){
                        a = result;
                        System.out.println("матрица а заменена последним результатом !");
                    }
                    else if (matrixChoice == 2){
                        b = result;
                        System.out.println("матрица в заменена последним результатом !");
                    }
                    else {
                        System.out.println("неверный выбор !");
                    }
                    break;
                }



                case 0: {
                    System.out.println("завершение программы");
                    break;
                }



                default:
                    System.out.println("неверный выбор");
            }
        }
    }



    static void printMatrix(ComplexMatrix matrix){
        for (int i = 0; i < matrix.rows; i++) {
            for (int j = 0; j < matrix.cols; j++) {
                Complex number = matrix.getelement(i, j);

                if (number.imaginary >= 0) {
                    System.out.print(number.real + "+" + number.imaginary + "i  ");
                } else {
                    System.out.print(number.real + "" + number.imaginary + "i  ");
                }
            }
            System.out.println();
        }
    }



    static void printComplex(Complex number) {
        if (number.imaginary >= 0) {
            System.out.println(number.real + " + " + number.imaginary + "i");
        } else {
            System.out.println(number.real + " - " + Math.abs(number.imaginary) + "i");
        }
    }



    static int readInt(Scanner scanner, String message) {
        while (true) {
            System.out.print(message);

            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            }

            System.out.println("ошибка : введите целое число !");
            scanner.next();
        }
    }



    static int readPositiveInt(Scanner scanner, String message) {
        while (true) {
            int value = readInt(scanner, message);

            if (value > 0) {
                return value;
            }

            System.out.println("число должно быть больше нуля !");
        }
    }



    static double readDouble(Scanner scanner, String message) {
        while (true) {
            System.out.print(message);

            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            }

            System.out.println("ошибка : введите число !");
            scanner.next();
        }
    }
}
