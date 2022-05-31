import java.util.LinkedList;

/*
//(documentation here)





*/
public class Main {

    public static void main(String[] args) { //caller



        MyStackDC2 myStackDC2 = new MyStackDC2();

        myStackDC2.push(1);
        //for the user to check if the stack is empty
        if(!myStackDC2.isEmpty()){
            System.out.println(myStackDC2.peek());
            myStackDC2.pop();
        } else {
            System.out.println("The stack is empty.");
        }


    /*
        MyStackDD stackDD = new MyStackDD();
        stackDD.pop();
        stackDD.push(1);
        System.out.println();
        stackDD.push(2);
        stackDD.push(3);
        stackDD.push(4);
        stackDD.push(5);
      */

    }
}