package leetcode;

import java.math.BigInteger;

// https://leetcode.com/problems/add-binary/
// Problem 67: Add Binary
public class AddBinary67 {

    private AddBinary67(){}

    public static String addBinary(String a, String b) {

        BigInteger binaryA = new BigInteger(a, 2);
        BigInteger binaryB = new BigInteger(b, 2);

        return binaryA.add(binaryB).toString(2);
    }
}
