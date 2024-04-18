package leetcode;

// https://leetcode.com/problems/time-needed-to-buy-tickets
// Problem 2073: Time Needed to Buy Tickets
public class TimeToBuyTickets2073 {

    private TimeToBuyTickets2073(){}

    public static int timeRequiredToBuy(int[] tickets, int kthPerson) {

        int kthPersonNumTickets = tickets[kthPerson];

        int totalSeconds = 0;
        for (int i = 0; i < tickets.length; i++) {
            totalSeconds += Math.min(kthPersonNumTickets, tickets[i]);
            if(i > kthPerson && tickets[i] >= kthPersonNumTickets){
                totalSeconds--;
            }
        }

        return totalSeconds;
    }
}
