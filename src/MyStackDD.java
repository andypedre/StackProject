
import java.util.*;

public class MyStackDD {

    private int count = 0;

    private Node first;

    /**
     * Constructs empty stack
     */
    public MyStackDD(){
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
                isFull();
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
        try {
            if (count == 0) {
                isEmpty();
                throw new NoSuchElementException("there is nothing to pop");
            } else {
                count = count -1;
                Object element = first.data;
                first = first.next;
                return element;
            }
        }
        catch(NoSuchElementException e){
            System.out.println("There is nothing to pop");
        }
        return null;
        //return isEmpty();
    }

    //returns the first element on top
    public void peek(){
        Object temp = first.data;
        System.out.println(temp);
    }

    public boolean isFull(){
        if (count == 4){
            return true;
        }else{
            return false;
        }
    }

    /**
     * Checks if stack is empty
     * @return true if stack empty
     */
    public boolean isEmpty() {
        return first == null;
    }

    class Node {
        public Object data;
        public Node next;
    }
}