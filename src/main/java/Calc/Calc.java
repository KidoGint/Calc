package Calc;

public class Calc {

    public Object summ(Object arg1, Object arg2) {
        System.out.println("Складываем " + arg1 + " и " + arg2);
        try {
            int a = Integer.parseInt(arg1.toString());
            int b = Integer.parseInt(arg2.toString());
            return a + b;
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

    public Object substract(Object arg1, Object arg2) {
        System.out.println("Из " + arg1 + " вычитаем  " + arg2);
        try {
            int a = Integer.parseInt(arg1.toString());
            int b = Integer.parseInt(arg2.toString());
            return (a - b);
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

    public Object division(Object arg1, Object arg2) {
        System.out.println("Делим " + arg1 + " на  " + arg2);
        try {
            int a = Integer.parseInt(arg1.toString());
            int b = Integer.parseInt(arg2.toString());
            return (int)(a/b);
        } catch (IllegalArgumentException e) {
            return null;
        } catch (ArithmeticException e) {
            return null;
        }
    }

    public Object mult(Object arg1, Object arg2) {
        System.out.println("Умножаем " + arg1 + " на  " + arg2);
        try {
            int a = Integer.parseInt(arg1.toString());
            int b = Integer.parseInt(arg2.toString());
            return a * b;
        } catch (IllegalArgumentException e) {
            return null;
        }
    }
}
