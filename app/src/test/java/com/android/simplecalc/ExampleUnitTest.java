package com.android.simplecalc;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(JUnit4.class)
public class ExampleUnitTest {
    private  Calculator mCalculator;
    @Before
    public void setUp(){
        mCalculator= new Calculator();

    }
    @After
    public  void  tearDown(){

    }
    /*
    Test ADD
     */
    @Test
    public void addition_isCorrect() {

        double result =mCalculator.add(1d,2d);
        assertEquals(result,3d,0.001d);
    }
    @Test
    public void addTwoNumbers() {
        double resultAdd = mCalculator.add(1d, 1d);
        assertThat(resultAdd, is(equalTo(2d)));
    }

    @Test
    public void addTwoNumbersNegative() {
        double resultAdd = mCalculator.add(-1d, 2d);
        assertThat(resultAdd, is(equalTo(1d)));
    }
    @Test
    public void addTwoNumbersFloats() {
        double resultAdd = mCalculator.add(1.111f, 1.111d);
        assertEquals(resultAdd, 2.222, 0.01);
    }
    @Test
    public void addition() {

        double result =mCalculator.add(1d,2d);
        assertEquals(result,3d,0d);
    }
   /*
    Test Div
     */

    @Test
    public void divTwoNumbers() {
        double resultDiv = mCalculator.div(32d,2d);
        assertThat(resultDiv, is(equalTo(16d)));
    }
    @Test
    public void divTwoNumbersZero() {
        double resultDiv = mCalculator.div(32d,0);
        assertThat(resultDiv, is(equalTo(Double.POSITIVE_INFINITY)));
    }
    @Test
    public void divAm() {
        double resultDiv = mCalculator.div(1d,-2d);
        assertThat(resultDiv, is(equalTo(-1/2d)));
    }
    @Test
    public void divDuong() {
        double resultDiv = mCalculator.div(-1d,-3d);
        assertThat(resultDiv, is(equalTo(1/3d)));
    }
    @Test
    public void divDiv() {
        double resultDiv = mCalculator.div(-2d,2d);
        assertThat(resultDiv, is(equalTo(-1d)));
    }
    /*
    test sub
     */
    @Test
    public void subTwoNumbers() {
        double resultSub = mCalculator.sub(1d, 1d);
        assertThat(resultSub, is(equalTo(0d)));
    }
    @Test
    public void subWorksWithNegativeResult() {
        double resultSub = mCalculator.sub(1d, 17d);
        assertThat(resultSub, is(equalTo(-16d)));
    }
    @Test
    public void subsoam() {
        double resultSub = mCalculator.sub(1d,-1d);
        assertThat(resultSub, is(equalTo(2d)));
    }
    @Test
    public void subeasy() {
        double resultSub = mCalculator.sub(100d,100d);
        assertThat(resultSub, is(equalTo(0d)));
    }
    @Test
    public void subpro() {
        double resultSub = mCalculator.sub(100d,200d);
        assertThat(resultSub, is(equalTo(-100d)));
    }
     /*
    test mul
     */
     @Test
     public void mulTwoNumbers() {
         double resultMul = mCalculator.mul(32d, 2d);
         assertThat(resultMul, is(equalTo(64d)));
     }
     @Test

     public void mulzero() {
         double resultMul = mCalculator.mul(0d,0d);
         assertThat(resultMul, is(equalTo(0d)));
     }
    @Test
    public void mulzeros1() {
        double resultMul = mCalculator.mul(0d,100d);
        assertThat(resultMul, is(equalTo(0d)));
    }
    @Test
    public void mulamam() {
        double resultMul = mCalculator.mul(-1d,-100d);
        assertThat(resultMul, is(equalTo(100d)));
    }
    @Test
    public void mulamduong() {
        double resultMul = mCalculator.mul(-1d,2d);
        assertThat(resultMul, is(equalTo(-2d)));
    }
 /*
    test pow
     */
    @Test
    public void powamduong() {
     double resultPow = mCalculator.pow(2d,-1d);
     assertThat(resultPow, is(equalTo(1/2d)));
    }
    @Test
    public void powamduong1() {
        double resultPow = mCalculator.pow(-2d,1d);
        assertThat(resultPow, is(equalTo(-2d)));
    }
    @Test
    public void powamduong2() {
        double resultPow = mCalculator.pow(-2d,-1d);
        assertThat(resultPow, is(equalTo(-1/2d)));
    }
    @Test
    public void powzero() {
        double resultPow = mCalculator.pow(2d,0d);
        assertThat(resultPow, is(equalTo(1d)));
    }
    @Test
    public void powzero1() {
        double resultPow = mCalculator.pow(1d,-1d);
        assertThat(resultPow, is(equalTo(1d)));
    }
 /*
    test Log
     */
 @Test
 public void log1() {
     double resultLog = mCalculator.log(8,2);
     assertEquals(resultLog, 1/3d,0.001);
 }
    @Test
    public void log2() {
        double resultLog = mCalculator.log(3,3);
        assertThat(resultLog, is(equalTo(1d)));
    }
    @Test
    public void log3() {
        double resultLog = mCalculator.log(3,9);
        assertThat(resultLog, is(equalTo(2d)));
    }
    @Test
    public void log4() {
        double resultLog = mCalculator.log(2,1);
        assertThat(resultLog, is(equalTo(0d)));

    }
    @Test
    public void log5() {
        double resultLog = mCalculator.log(27,9);
        assertEquals(resultLog, 2/3d,0.001);


    }
}