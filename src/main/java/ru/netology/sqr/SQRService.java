package ru.netology.sqr;

import javax.security.auth.login.AccountException;

public class SQRService {
    public int calcSqrt(int lowLimit, int highLimit) {
        int countSqrt = 0;
        for (int i = 10; i <= 99; i++) {
            if ((i * i) >= lowLimit && (i * i)<=highLimit) {
                countSqrt++;
            }
        }
        return countSqrt;
    }
}

