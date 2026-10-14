public class ComplexMatrix {
    int rows;
    int cols;
    Complex[][] data;
    ComplexMatrix(int rows, int cols) {
        if (rows <= 0 || cols <= 0) {
            throw new IllegalArgumentException("количество строк и столбцов должно быть положительным");
        }
        this.rows = rows;
        this.cols = cols;
        this.data = new Complex[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                this.data[i][j] = new Complex(0, 0);
            }
        }
    }

    int getRows(){
        return this.rows;
    }

    int getCols(){
        return this.cols;
    }

    Complex getelement(int i, int j){
        return this.data[i][j];
    }

    void setelement(int i, int j, Complex newelement){
        this.data[i][j] = newelement;
    }



    ComplexMatrix add(ComplexMatrix other){
        if (this.rows == other.rows && this.cols == other.cols){
            ComplexMatrix result = new ComplexMatrix(this.rows,this.cols);
            for (int i = 0; i < this.rows; i++){
                for (int j = 0; j < this.cols; j++){
                   result.data[i][j] = this.data[i][j].add(other.data[i][j]);
                }
            }
            return result;
        }
        else{throw new IllegalArgumentException("Размеры матриц не совпадают");
        }
    }



    ComplexMatrix transpose(){
        ComplexMatrix resulttr = new ComplexMatrix(this.cols, this.rows);
        for (int i = 0; i < this.rows; i++){
            for (int j = 0; j < this.cols; j++){
                resulttr.data[j][i] = this.data[i][j];
            }
        }
        return resulttr;
    }


    ComplexMatrix multiply(ComplexMatrix other){
        if (this.cols == other.rows){
            ComplexMatrix resultmul = new ComplexMatrix(this.rows,other.cols);
            for (int i = 0; i < this.rows; i++){
                for (int j = 0 ; j < other.cols; j++){
                    Complex summa = new Complex(0,0);
                    for (int k = 0; k < this.cols; k++){
                        summa = summa.add(this.data[i][k].multiply(other.data[k][j]));
                    }
                    resultmul.data[i][j] = summa;
                }
            }
            return resultmul;
        }
        else {throw new IllegalArgumentException("матрицы нельзя перемножить");
        }
    }


    Complex determinant(){
        if (this.rows !=  this.cols){
            throw new IllegalArgumentException("матрица должна быть квадратной");
        }
        ComplexMatrix temp = new ComplexMatrix(this.rows,this.cols);
        for ( int i = 0; i < this.rows; i++){
            for (int j = 0; j < this.cols; j++){
                temp.data[i][j] = this.data[i][j];
            }
        }
        int sign = 1;
        for (int p = 0; p < this.rows ; p++){
            if (temp.data[p][p].real ==0 && temp.data[p][p].imaginary ==0){
                for (int k = p + 1; k < this.rows;k++){
                    if (temp.data[k][p].real != 0 || temp.data[k][p].imaginary != 0){
                        Complex[] temprow = temp.data[p];
                        temp.data[p] = temp.data[k];
                        temp.data[k] = temprow;
                        sign = -sign;
                        break;
                    }
                }
                if (temp.data[p][p].real == 0 && temp.data[p][p].imaginary ==0){
                return new Complex(0,0);
                }
            }
            for (int i = p + 1; i < this.rows ; i++){
                Complex factor = temp.data[i][p].divide(temp.data[p][p]);
                for (int j = p; j < this.cols ;j++){
                    temp.data[i][j] = temp.data[i][j].subtract(factor.multiply(temp.data[p][j]));
                }
            }
        }
        Complex det = new Complex(1,0);
        for (int i = 0;i < this.rows; i++){
            det = det.multiply(temp.data[i][i]);
        }
        det = det.multiply(new Complex(sign,0));
        return det;
    }



    ComplexMatrix inverse(){
        if (this.rows != this.cols){
            throw new IllegalArgumentException("матрица должна быть квадратной");
        }
        ComplexMatrix temp = new ComplexMatrix(this.rows,this.cols);
        for (int i = 0;i < this.rows;i++){
            for (int j = 0; j < this.cols; j++){
                temp.data[i][j] = this.data[i][j];
            }
        }
        ComplexMatrix inverse = new ComplexMatrix(this.rows,this.cols);
        for (int i = 0; i < this.rows;i++){
            for (int j = 0; j < this.cols; j++){
                if (i == j){
                    inverse.data[i][j] = new Complex(1,0);
                }
                else if (i !=j ){
                    inverse.data[i][j] = new Complex(0,0);
                }
            }
        }
        for (int p = 0;p < this.rows; p++ ){
            if (temp.data[p][p].real == 0 && temp.data[p][p].imaginary == 0){
                for (int k = p + 1; k < this.rows;k++){
                    if (temp.data[k][p].real != 0 || temp.data[k][p].imaginary != 0) {
                        Complex[] temprow = temp.data[p];
                        temp.data[p] = temp.data[k];
                        temp.data[k] = temprow;
                        Complex[] inverserow = inverse.data[p];
                        inverse.data[p] = inverse.data[k];
                        inverse.data[k] = inverserow;
                        break;
                    }
                }
            }
            if (temp.data[p][p].real == 0 && temp.data[p][p].imaginary == 0){
                throw new ArithmeticException("обратной матрицы не существует");
            }
            Complex pivot = new Complex(temp.data[p][p].real, temp.data[p][p].imaginary);
            for (int j = 0; j < this.cols;j++){
                temp.data[p][j] = temp.data[p][j].divide(pivot);
                inverse.data[p][j] = inverse.data[p][j].divide(pivot);
            }
            for (int i = 0; i < this.rows; i++){
                if (i != p ){
                    Complex factor = temp.data[i][p];
                    for (int j = 0; j < this.cols; j++){
                        temp.data[i][j] = temp.data[i][j].subtract(factor.multiply(temp.data[p][j]));
                        inverse.data[i][j] = inverse.data[i][j].subtract(factor.multiply((inverse.data[p][j])));
                    }
                }
            }
        }
        return inverse;
    }



    ComplexMatrix divide(ComplexMatrix other){
        ComplexMatrix inverseother = other.inverse();
        return this.multiply(inverseother);
    }
}


