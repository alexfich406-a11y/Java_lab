public class Practic1 {
	  public static void main(String[] args){
        int i = 2;
        switch(i) {
            case 1: break;
            case 2: break;
        }
        
        byte b = 1;
        switch(b) {
            case 1: break;
        }
        
        short s = 2;
        switch(s) {
            case 2: break;
        }
        
        char c = 'A';
        switch(c) {
            case 'A': break;
            case 'B': break;
        }
        
        Integer integer = 3;
        switch(integer) {
            case 3: break;
        }
        
        enum Day { MON, TUE }
        Day day = Day.MON;
        switch(day) {
            case MON:
                break;
            case TUE: 
                break;
        }
        
        String str = "hello";
        switch(str) {
            case "hello": 
                break;
            case "world": 
                break;
        }
        
        var v = 5;
        switch(v) {
            case 5:
                break;
        }
    }
}

