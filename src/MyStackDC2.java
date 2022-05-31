import java.util.*;


public class MyStackDC2 {

    //Linked list to store Integer objects
    LinkedList<Integer> MyList;
    public MyStackDC2(){
       MyList = new LinkedList<Integer>();
    }

    //get and removes the last element on the linked list
    public int pop() {
       return MyList.removeLast();
    }
    //add new element at the end
    public void push(int element){
        MyList.addLast(element);
    }
    //get last element
    public int peek(){
        return MyList.getFirst();
    }

    //check if the linked list is empty
    public boolean isEmpty(){
        return MyList.size() ==0;
    }
    //check if the linked list is full
    public boolean isFull(){
        return M
    }

}
