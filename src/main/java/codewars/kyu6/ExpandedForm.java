package codewars.kyu6;

import java.util.ArrayList;
import java.util.List;

// https://www.codewars.com/kata/5842df8ccbd22792a4000245/train/java
// Problem: Write Number in Expanded Form
public class ExpandedForm {
    
    private ExpandedForm(){}

    public static String expandedForm(int num){

        List<String> parts = new ArrayList<>();
 
        for(int i = num, tens = 1; i > 0; i /= 10, tens *= 10){
            int lastDigit = (i % 10) * tens;

            if(lastDigit == 0) continue;

            parts.add(0, String.valueOf(lastDigit));
        }

        return String.join(" + ", parts);
    }
}
