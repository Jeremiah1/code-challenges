package leetcode.dynamicprogramming.studyplan.level1;

// https://leetcode.com/problems/best-sightseeing-pair/
// Problem 1014: Best Sight Seeing Pair
public class BestSightSeeingPair1014 {
    
    private BestSightSeeingPair1014(){}
    
    public static Integer maxScoreSightseeingPair(int[] values) {
        
        int prevMax = values[0];
        int result = values[0] + values[1] - 1;

        for (int j = 1; j < values.length; j++) {

            result = Math.max(prevMax + values[j] - j, result);
            prevMax = Math.max(prevMax, values[j] + j);
        }

        return result;
    }
}
