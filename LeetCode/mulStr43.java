// 43 - Multiply Strings

import java.math.*;
class Solution {
    public String multiply(String num1, String num2) {
        
        BigInteger x = new BigInteger(num1);
        BigInteger y = new BigInteger(num2);

        BigInteger mul = x.multiply(y);
        return mul.toString();
    }
}