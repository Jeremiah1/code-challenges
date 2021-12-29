package codewars.kyu6;

// https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec/train/java
// Problem: Persistent Bugger
public class PersistentBugger {
    
    private PersistentBugger(){}

    public static int persistence(long n) {

        int result = 0;
        while(n >= 10){
            long multiplication = 1;
            
            while(n > 0){
                multiplication *= n % 10;
                n /= 10;
            }
            result++;
            n = multiplication;
        }
		
        return result;
	}
}
