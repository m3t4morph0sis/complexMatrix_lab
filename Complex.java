public class Complex {
    double real;
    double imaginary;
    Complex( double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    Complex add(Complex other){
        double newreal = this.real + other.real;
        double newimaginary = this.imaginary + other.imaginary;
        Complex result = new Complex(newreal, newimaginary);
        return result;
    }

    Complex subtract(Complex other){
        double newreal = this.real - other.real;
        double newimaginary = this.imaginary - other.imaginary;
        Complex result = new Complex(newreal,newimaginary);
        return result;
    }

    Complex multiply(Complex other){
        double newreal = this.real * other.real - this.imaginary * other.imaginary;
        double newimaginary = this.real * other.imaginary + this.imaginary * other.real;
        Complex result = new Complex(newreal,newimaginary);
        return result;
    }

    Complex divide(Complex other){
        double denominator = other.real * other.real + other.imaginary * other.imaginary;
        if (denominator == 0){
            throw new ArithmeticException("деление на ноль");
        }

        double newreal = (this.real * other.real + this.imaginary * other.imaginary) / denominator;
        double newimaginary = ( this.imaginary * other.real - this.real * other.imaginary) / denominator;
        Complex result = new Complex(newreal, newimaginary);
        return result;
    }
}
