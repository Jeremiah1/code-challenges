package leetcode;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class TimeToBuyTickets2073Test {

    @Test
    void givenLineOfPeople_returnTimeToGetTickets() {
        int[] tickets = new int[]{2, 3, 2};
        int kthPerson = 2;

        int actualTimeTaken = TimeToBuyTickets2073.timeRequiredToBuy(tickets, kthPerson);
        int expectedTime = 6;

        assertThat(actualTimeTaken).isEqualTo(expectedTime);

        // =================================

        tickets = new int[]{5, 1, 1, 1};
        kthPerson = 0;

        actualTimeTaken = TimeToBuyTickets2073.timeRequiredToBuy(tickets, kthPerson);
        expectedTime = 8;

        assertThat(actualTimeTaken).isEqualTo(expectedTime);

        // =================================

        tickets = new int[]{8, 3, 4, 1};
        kthPerson = 2;

        actualTimeTaken = TimeToBuyTickets2073.timeRequiredToBuy(tickets, kthPerson);
        expectedTime = 12;

        assertThat(actualTimeTaken).isEqualTo(expectedTime);

        // =================================

        tickets = new int[]{8,8,2,5,8,8,8,3};
        kthPerson = 3;

        actualTimeTaken = TimeToBuyTickets2073.timeRequiredToBuy(tickets, kthPerson);
        expectedTime = 32;

        assertThat(actualTimeTaken).isEqualTo(expectedTime);

        // =================================

        tickets = new int[]{84,49,5,24,70,77,87,8};
        kthPerson = 3;

        actualTimeTaken = TimeToBuyTickets2073.timeRequiredToBuy(tickets, kthPerson);
        expectedTime = 154;

        assertThat(actualTimeTaken).isEqualTo(expectedTime);
    }
}