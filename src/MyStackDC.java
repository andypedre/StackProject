import java.util.*;

public class MyStackDC {
/*
    List <MyClass> st;
    //constructor
    public boolean isFull (){
        //stuff in here
    }

    public boolean isEmpty(){
        return top == null;
    }

    void push (object obj){ // insert at the beginning
        st.addfront(obj);   // create a new obj.

    }

    public void pop(){ // remove at the beginning
        return st.front();
    }

    public void peek(){

    }

*/
private int count = 0;

private Node first;

    /**
     * Constructs empty stack
     */
    public MyStackDC(){
    first = null;

    }
/**
 * Add an element on top of stack
 */
public void push(Object element){
    //newNode.size() >=5
    try {
        Node newNode = new Node();
        newNode.data = element;
        newNode.next = first;
        first = newNode;
        //if more than five elements, the stack will overflow
        if (count > 4) {
           throw new NoSuchElementException("stack too big");
        }else{
        count++;
        }
    }
    catch(NoSuchElementException e){
        System.out.println("list is too big.");
    }
}

/**
 * Removes element from top of the stack
 */
public Object pop() {
    //throw exception when there is nothing to pop
        if (isEmpty()) {
            throw new NoSuchElementException("there is nothing to pop");
        }
         Object element = first.data;
        first = first.next;
        return element;
    }

    /**
     * Checks if stack is empty
     * @return true if stack empty
     */
    public boolean isEmpty () {
        return first == null;
    }

    class Node {
        public Object data;
        public Node next;
    }
}
