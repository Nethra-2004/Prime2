public class Prime2 {
    public static void main(String[] args) {
        int num = 29; // Change this to the number you want to check
        boolean flag = false;
        
        for (int i = 2; i <= num / 2; ++i) {
            // Condition for nonprime number
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        
        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}