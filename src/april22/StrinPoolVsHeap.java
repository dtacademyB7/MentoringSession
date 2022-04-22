package april22;

public class StrinPoolVsHeap {


    public static void main(String[] args) {



//
           String str2 = "java";
           String str = new String("java");


        // How many objects are created and where
        // 2 obj are created, one in heap and one in string pool

      // Java programs use 2 memory types:
        // Stack -> smaller memory that stores local variables, references to objects, and also method call stack
        // StackOverflowError

        // Heap -> larger memory type that stores objects
        //


//     badRecursiveMethod(); // stackoverflow error

//        int[] arr = new int[1000000000]; //OutOfMemoryError: Java heap space

    goodRecursiveMethod(5);


    }

    public static void badRecursiveMethod(){
        badRecursiveMethod(); // recursive call, a method calling itself in its body
    }


    public static void goodRecursiveMethod(int i){
        if(i == 0){
            return;
        }else{
            System.out.println(i);
            i--;
           goodRecursiveMethod(i);
        }
         // recursive call, a method calling itself in its body
    }

}
