package com.algorithm.math;

public class NPower {

    public double Power(double x, int n) {
        boolean isEvenNumber = false;
        if (n % 2 == 0) {
            isEvenNumber = true;
        }
        if (isEvenNumber) {
            return f(x, n/2) * f(x, n/2);
        } else {
            return x * f(x, (n - 1) / 2) * f(x, (n - 1) / 2);
        }
    }

    private double f(double x, int n) {
        boolean isEvenNumber = false;
        if (n % 2 == 0) {
            isEvenNumber = true;
        }
        if (n == 1) {
            return x;
        }
        if (isEvenNumber) {
            return f(x, n / 2) * f(x, n / 2);
        } else {
            return x * f(x, (n - 1) / 2) * f(x, (n - 1) / 2);
        }
    }

    public double powerV2(double x, int n) {
        boolean isEvenNumber = false;
        if (n % 2 == 0) {
            isEvenNumber = true;
        }
        if (n == 1) {
            return x;
        }
        if (isEvenNumber) {
            return powerV2(x, n/2) * powerV2(x, n/2);
        } else {
            return x * powerV2(x, (n - 1) / 2) * powerV2(x, (n - 1) / 2);
        }
    }

    public double powerv3(double x, int n) {
        boolean isNegative = false;
        if (n < 0) {
            n = -n;
            isNegative = true;
        }
        double res = pow(x, n);
        return isNegative ? 1 / res : res;
    }

    private double pow(double x, int n) {
        if (n == 0) return 1;
        if (n == 1) return x;
        double res = pow(x, n / 2);
        res = res * res;
        if (n % 2 != 0) res *= x;
        return res;
    }
}
