public class Solution {
    public static void main(String[] args){
        int a = 10, b = 3;
        int add = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        int mod = a % b;
        
        int x = 5;
        int preInc = ++x;
        int postInc = x++;
        int preDec = --x;
        int postDec = x--;
        
        int max = (a > b) ? a : b;
        
        int y = 10;
        y += 5;
        y -= 3;
        y *= 2;
        y /= 4;
        y %= 4;
        
        boolean eq = (a == b);
        boolean ne = (a != b);
        boolean gt = (a > b);
        boolean lt = (a < b);
        boolean ge = (a >= b);
        boolean le = (a <= b);
        
        boolean and = (true && false);
        boolean or = (true || false);
        boolean not = !true;
        
        int bitAnd = 5 & 3;
        int bitOr = 5 | 3;
        int bitXor = 5 ^ 3;
        int bitNot = ~5;
        int shiftRight = 8 >> 2;
        int shiftLeft = 2 << 3;
        int unsignedShift = -8 >>> 2;
        
        String s1 = "Hello";
        String s2 = "World";
        String concat = s1 + " " + s2;
        s1 += "!";
        
        String str1 = new String("test");
        String str2 = new String("test");
        boolean refEq = (str1 == str2);
    }
}
