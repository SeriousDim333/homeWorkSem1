package HomeWorkJava;

import java.util.LinkedList;

public class FuncForQueue {
    private LinkedList<Integer> link;

    public FuncForQueue() {
        link = new LinkedList<>();
    }
    public void enqueue(int num){
        link.addLast(num);
    }

    public int dequeue(){
        return link.pollFirst();
    }

    public int first(){
        return link.get(0);
    }
    public void print(){
        System.out.println(link);
    }
}
