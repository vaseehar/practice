package unknown;

import java.util.concurrent.Semaphore;

public class FooBar_1115 {

    public static void main(String[] args) {

    }

    private int n;
    Semaphore semFoo = new Semaphore(1), semBar = new Semaphore(0);

    public FooBar_1115(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            semFoo.acquire();
            printFoo.run();
            semBar.release();
        }

    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            semBar.acquire();
            printBar.run();
            semFoo.release();
        }
    }

}
