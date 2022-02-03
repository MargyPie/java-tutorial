package com.margy;
// The class needs two fields (instance variables) with name real and imaginary of type double.
// The class needs to have one constructor.
//    The constructor has parameters real and imaginary of type double and it needs to initialize the fields.
//
//Write the following methods (instance methods):
//* Method named getReal without any parameters, it needs to return the value of real field.
//* Method named getImaginary without any parameters, it needs to return the value of imaginary field.
//* Method named add with two parameters real and imaginary of type double, it needs to add parameters to fields.
//  In other words, it needs to do a complex number add operation as described above.
//* Method named add with one parameter of type ComplexNumber.
//  It needs to add the ComplexNumber parameter to the corresponding instance variables.
//* Method named subtract with two parameters real and imaginary of type double.
//  It needs to subtract parameters from fields, in other words,
//  it needs to do a complex number subtract operation as described above.
//* Method named subtract with one parameter other of type ComplexNumber.
//  It needs to subtract the other parameter from this complex number.

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    public void add(ComplexNumber complexNumber) {
        add(complexNumber.getReal(), complexNumber.getImaginary());
    }

    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public void subtract(ComplexNumber complexNumber) {
        subtract(complexNumber.getReal(), complexNumber.getImaginary());
    }
}
