package com.android.simplecalc;
import java.lang.Math;

public class Calculator {

    // Available operations
    public enum Operator {ADD, SUB, DIV, MUL,POW,GIAITHUA,LOG}

    /**
     * Addition operation
     */
    public double add(double firstOperand, double secondOperand) {
        return firstOperand + secondOperand;
    }

    /**
     * Subtract operation
     */
    public double sub(double firstOperand, double secondOperand) {
        return firstOperand - secondOperand;
    }

    /**
     * Divide operation
     */
    public double div(double firstOperand, double secondOperand) {
        return firstOperand / secondOperand;
    }

    /**
     * Multiply operation
     */
    public double mul(double firstOperand, double secondOperand) {
        return firstOperand * secondOperand;
    }
    public double pow(double firstOperand, double secondOperand) {
        return Math.pow(firstOperand,secondOperand);
    }

    public double log(double firstOperand, double secondOperand) {
        return Math.log(secondOperand)/Math.log(firstOperand);
    }
}