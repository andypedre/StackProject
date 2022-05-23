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

        //testing colors
        for(int i =0; 10 >= i ; i++){

            if(i==5) {
                System.out.println("blue brackets ");
                System.out.println(".");
                for(int j =0; 10>= j; j++){
                    if(j==5 || j==4 ){
                        System.out.print("yellow brackets ");
                        }
                        else {
                        System.out.println("yellow else brackets");
                        do {
                            System.out.println("do it");
                           break;
                        } while (i == 5); {
                            System.out.println("loop again green brackets");
                            i++;
                        }


                    }

                }
            }
        }
    }

    public static int testClass(int fun){
    return fun;
    }
}