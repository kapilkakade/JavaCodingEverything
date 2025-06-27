package Numbers;

public class ReverseNumberRecurssion {
    
    public static int rev(int num, int rev) {
        if (num == 0) {
            return rev;
        }
        int rem = num % 10;
        rev = rev * 10 + rem;
        return rev(num / 10, rev);
    }

    public static void main(String[] args) {
        
        int a = 12345;
        int reversedNum = rev(a, 0);
        System.out.println(reversedNum);
    }
}
