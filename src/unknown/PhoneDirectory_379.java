package unknown;

import java.util.PriorityQueue;

public class PhoneDirectory_379 {

    PriorityQueue<Integer> available;
    int maxSize;

    public PhoneDirectory_379(int maxNumbers) {
        available = new PriorityQueue<>(maxNumbers, (a, b) -> (a - b));
        this.maxSize = maxNumbers;
        for (int i = 0; i < maxNumbers; i++) {
            available.add(i);
        }
    }

    public int get() {
        if (!available.isEmpty())
            return available.poll();
        else
            return -1;
    }

    public boolean check(int number) {
        return available.contains(number);

    }

    public void release(int number) {
        if (!available.contains(number))
            available.add(number);
    }
}
