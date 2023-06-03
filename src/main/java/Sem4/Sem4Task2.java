package Sem4;

public class Sem4Task2 {
    public static void main(String[] args) {
        FuncForQueue test = new FuncForQueue();
        test.enqueue(4);
        test.enqueue(5);
        test.enqueue(6);
        test.enqueue(7);
        test.print();
        System.out.println(test.dequeue());
        System.out.println(test.dequeue());
        System.out.println(test.first());
        test.print();
    }
}
