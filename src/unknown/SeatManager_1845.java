package unknown;

import java.util.PriorityQueue;

public class SeatManager_1845 {

    public static void main(String[] args) {

    }

    PriorityQueue<Integer> pq;
    int min = 0;

    public SeatManager_1845(int n) {
        pq = new PriorityQueue<>();
    }

    public int reserve() {
        if (pq.isEmpty()) {
            return ++min;
        }
        return pq.poll();
    }

    public void unreserve(int seatNumber) {
        pq.add(seatNumber);
    }

}
