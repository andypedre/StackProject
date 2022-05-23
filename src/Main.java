public class Main {
    public static void main(String[] args) {

        //testing intellij ide
        System.out.println("Hello world!" );
        int test = 1;
        int test2 =2;
        int test3 = test + test2;
        System.out.println(test3);

        //testing interfaces and other things
        testStack A = new testStack();
        A.share();
        System.out.println(testStack.a);

        //testing class connection to interface within the main class
        System.out.println(testClass(testStack.a));
    }

    public static int testClass(int fun){
    return fun;
    }
}