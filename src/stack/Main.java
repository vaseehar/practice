package stack;

public class Main {

    public static void main(String[] args) {
        MyQueue_232 myQueue_232 = new MyQueue_232();
        myQueue_232.push(1);
        myQueue_232.push(2);
        myQueue_232.push(3);
        myQueue_232.push(4);
        System.out.println(myQueue_232.pop());
        myQueue_232.push(5);
        System.out.println(myQueue_232.pop());
        System.out.println(myQueue_232.pop());
        System.out.println(myQueue_232.pop());
        System.out.println(myQueue_232.pop());

    }

}
