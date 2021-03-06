package top.wuhaojie.library;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void getBit() {
        int num = 1, n = 0;

        while (n < 4) {
            int i = num % 10;
            System.out.println(i);
            num /= 10;
            n++;
        }

    }

    @Test
    public void getBit2() {
        int to = 2048, from = 239;
        // operate to
        int number = to, count = 0;
        while (number > 0) {
            int i = number % 10;
            System.out.println("to: " + i);
            number /= 10;
            count++;
        }
        // operate from
        number = from;
        while (count > 0) {
            int i = number % 10;
            System.out.println("from: " + i);
            number /= 10;
            count--;
        }
    }

    @Test
    public void getFloatBit() {
        float num = 125.35F;
        ArrayList<Integer> mTargetNumbers = new ArrayList<>();

        String str = String.valueOf(num);
        char[] charArray = str.toCharArray();
        int pointIndex = -1;
        for (int i = charArray.length - 1; i >= 0; i--) {
            if (Character.isDigit(charArray[i])) {
                mTargetNumbers.add(charArray[i] - '0');
            } else {
                pointIndex = i;
            }
        }
        System.out.println(mTargetNumbers);


    }

}