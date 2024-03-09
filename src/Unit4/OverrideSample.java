package Unit4;

public class OverrideSample {
    public static int max(int a, int b) {
        if (a > b) return a;
        else return b;
    }
    
    public static int max(int a, int b, int c) {
        int temp = max(a, b);
        return (max(temp, c)); // We are using here the first function again
    }
    
    public static void main (String[] args) {
        int a = 5;
        int b = 10;
        int c = 2;
        
        System.out.println(max(a, b, c));
    }
}
