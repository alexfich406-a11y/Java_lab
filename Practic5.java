public class Practic5 {
    public static void main(String[] args){
        byte b1 = 10, b2 = 3;
        short s1 = 20, s2 = 4;
        int i1 = 30, i2 = 5;
        long l1 = 40L, l2 = 6L;
        float f1 = 7.5f, f2 = 2.5f;
        double d1 = 8.8, d2 = 2.2;
        char c1 = 'A', c2 = 'B';   // 'A'=65, 'B'=66
        
        int add_bb = b1 + b2;           // byte + byte -> int
        int add_ss = s1 + s2;           // short + short -> int
        int add_ii = i1 + i2;           // int + int -> int
        long add_ll = l1 + l2;          // long + long -> long
        float add_ff = f1 + f2;         // float + float -> float
        double add_dd = d1 + d2;        // double + double -> double
        int add_bc = b1 + c1;           // byte + char -> int (char автоматически -> int)
        int add_sc = s1 + c1;           // short + char -> int
        int add_ic = i1 + c1;           // int + char -> int
        long add_lc = l1 + c1;          // long + char -> long
        float add_fc = f1 + c1;         // float + char -> float
        double add_dc = d1 + c1;        // double + char -> double
        
        int sub_bb = b1 - b2;           // byte - byte -> int
        int sub_ss = s1 - s2;           // short - short -> int
        int sub_ii = i1 - i2;           // int - int -> int
        long sub_ll = l1 - l2;          // long - long -> long
        float sub_ff = f1 - f2;         // float - float -> float
        double sub_dd = d1 - d2;        // double - double -> double
        int sub_bc = b1 - c1;           // byte - char -> int
        int sub_sc = s1 - c1;           // short - char -> int
        int sub_ic = i1 - c1;           // int - char -> int
        long sub_lc = l1 - c1;          // long - char -> long
        float sub_fc = f1 - c1;         // float - char -> float
        double sub_dc = d1 - c1;        // double - char -> double
        
        int mul_bb = b1 * b2;           // byte * byte -> int
        int mul_ss = s1 * s2;           // short * short -> int
        int mul_ii = i1 * i2;           // int * int -> int
        long mul_ll = l1 * l2;          // long * long -> long
        float mul_ff = f1 * f2;         // float * float -> float
        double mul_dd = d1 * d2;        // double * double -> double
        int mul_bc = b1 * c1;           // byte * char -> int
        int mul_sc = s1 * c1;           // short * char -> int
        int mul_ic = i1 * c1;           // int * char -> int
        long mul_lc = l1 * c1;          // long * char -> long
        float mul_fc = f1 * c1;         // float * char -> float
        double mul_dc = d1 * c1;        // double * char -> double
        
        int div_ii = i1 / i2;           // int / int -> int (30/5=6)
        int div_bi = b1 / i2;           // byte / int -> int (10/5=2)
        long div_ll = l1 / l2;          // long / long -> long (40/6=6)
        double div_dd = d1 / d2;        // double / double -> double (8.8/2.2=4.0)
        float div_ff = f1 / f2;         // float / float -> float (7.5/2.5=3.0)
        double div_id = i1 / d2;        // int / double -> double (30/2.2=13.636)
        int div_cc = c1 / 2;            // char / int -> int (65/2=32)
        double div_cd = c1 / d2;        // char / double -> double (65/2.2=29.545)
        
        int mod_ii = i1 % i2;           // 30 % 5 -> 0
        int mod_bi = b1 % i2;           // 10 % 5 -> 0
        long mod_ll = l1 % l2;          // 40 % 6 -> 4
        double mod_dd = d1 % d2;        // 8.8 % 2.2 -> 0.0
        float mod_ff = f1 % f2;         // 7.5 % 2.5 -> 0.0
        int mod_cc = c1 % 10;           // 65 % 10 -> 5
    }
}
