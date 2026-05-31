public class Practic1 {
	  public static void main(String[] args){
        Integer d1 = Integer.decode("123");
        Integer d2 = Integer.decode("0x7B");
        Integer d3 = Integer.decode("#7B");
        Integer d4 = Integer.decode("0173");

        Long d5 = Long.decode("0xFF");
        Byte d6 = Byte.decode("077");
        Short d7 = Short.decode("-0x10");
    }
}

