import java.util.*;
public class Main {

    public static void main(String[] args) { //caller
    /*
        +stack = new myStack(10);
        if +stack is full(){
            + stack.push(3);
        }
        if(! +stack.isEmpty()){
            object obj = +stack.pop();
        }
    */
/*Stack WhoseStack = new Stack<>();
try {
    WhoseStack.pop();
}catch (EmptyStackException e){
    System.out.println("stack is empty");
}
*/

        MyStackDC stackDC = new MyStackDC();
        stackDC.pop();
        stackDC.push(1);
        stackDC.push(2);
        stackDC.push(2);
        stackDC.push(2);
        stackDC.push(2);
        //stackDC.push(2);
        stackDC.pop();






    }
}