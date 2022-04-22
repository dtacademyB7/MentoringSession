import java.util.*;

public class CommonInterviewCodingTasks {


    /*
        Binary search implementation
     */


    public static void binarySearch(int arr[], int first, int last, int key) {
        int mid = (first + last) / 2;
        while (first <= last) {
            if (arr[mid] < key) {
                first = mid + 1;
            } else if (arr[mid] == key) {
                System.out.println("Element is found at index: " + mid);
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) {
            System.out.println("Element is not found!");
        }
    }

    /*
       Implementation of bubble sort algorithm
     */

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1]; // swap elements
                    arr[j - 1] = arr[j];
                    arr[j] = temp;

                }
            }
        }
    }


     /*
       Implementation checking for a palindrome
     */

    public static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }


    /*
     //You have a String : "mom and dad in a racecar"
    //Write a method to find and return the biggest palindrome  --> racecar

     */


    public static String biggestPalindrome(String str) {
        str = str.toLowerCase();
        String biggestPalindrome = "";
        String[] arr = str.split(" ");
        for (String each : arr) {
            String reverse = "";
            for (int i = each.length() - 1; i >= 0; i--) {
                reverse += each.charAt(i);
            }
            if (each.equals(reverse) && each.length() > biggestPalindrome.length()) {
                biggestPalindrome = each;
            }
        }
        return biggestPalindrome;
    }


    //Write a method to get the sum of digits in integer
    public static int sumOfDigits(int number) {

        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }



    //Write a method to reverse integer
    public static int reverse(int num) {
        int sum = 0;
        while (num > 0) {
            int lastDigit = (num % 10);
            sum = (sum * 10) + lastDigit;
            num = num / 10;
        }
        return sum;
    }

    //Write a method to check if a number is an armstrong number
    public static boolean isArmstrongNumber(int number) {

        int sum = 0;
        int digit;
        int temp;

        temp = number;
        while (temp > 0) {
            digit = temp % 10;
            sum = sum + (digit * digit * digit);
            temp = temp / 10;
        }

        if (number == sum)
            return true;
        else
            return false;
    }



    public static int fibonacciRecursive(int n) { // find fibonacci using recursion
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static int fibonacci(int n) { // find fibonacci without using recursion
        int a = 0, b = 1, c;
        if (n == 0)
            return a;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }


    public static int factorialRecursive(int number){     // find factorial using recursion
        //base case
        if(number == 0){
            return 1;
        }
        return number * factorialRecursive(number -1); //
    }


    public static int factorial(int number) { // find factorial without using recursion
        int result = 1;
        while (number != 0) {
            result = result * number;
            number--;
        }

        return result;
    }

    /*
       Very commonly asked
     */


    public static boolean isPrime(int n) {
        // check if n is a multiple of 2
        if (n % 2 == 0)
            return false;
        // if not, then just check the odds
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }


    //Create a method that divides 2 numbers without using  / or %

    public static String divisionWithoutUsingArithmeticDivisionOrModulo(int divident, int divisor) {
        int quotient = 0;
        int remainder = 0;
        while (divident >= divisor) {
            divident = divident - divisor;
            quotient++;
            remainder = divident;
        }
        return "quotient = " + quotient + " remainder = " + remainder;
    }




    //Reverse each word in a String without using additional memory space or so called "in-place reverse"
    public static String reverseEachWord(String str ) {


        char[] characters =  str.toCharArray();


        int start = 0;
        int end = 0;




        for (int i = 0; i < characters.length; i++) {

            while(i<characters.length && characters[i]==' ') {
                i++;
            }
            start = i;

            while( i<characters.length && characters[i]!=' ' ) {
                i++;
            }

            end = i-1;

            while(start<end) {
                char temp = characters[start];
                characters[start] = characters[end];
                characters[end] = temp;
                start++;
                end--;
            }

        }


        return new String(characters);


    }




    //Write a method that will count number of each char in a String
    //countChar("abbcdddd"); -> {a=1, b=2, c=1, d=4}

    public static Map<Object, Integer> countChar(String str) {

        Map<Object, Integer> map = new HashMap<>();
        int charCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (!map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), 1);
            } else {
                charCount = map.get(str.charAt(i));
                charCount++;
                map.put(str.charAt(i), charCount);
            }
        }
        return map;
    }




//
//	Write a method that checks if a string is anagram of another string, that is,
//	it is built out of the same letters as another string
//	isAnagram("abc","cab"); -> true
//	isAnagram("abc","abb"); -> false

    public static boolean isAnagram(String str1, String str2) {

        char[] charArray1 = str1.toCharArray(); // convert both to charArray
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1); // sort both
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2); // after sorting check equality for the same order and count of chars

    }


//	Write a method that accepts 2 arguments: int[] numbers,int target. It should find the 2 elements
//	in the array whose sum is equal to the given int target and then returns those 2 elements as an int[].

    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[1] = i;
                result[0] = map.get(target - numbers[i]);
                return result;
            }
            map.put(numbers[i], i);
        }
        return result;
    }


//	Write a program to print all permutations of a given string.
//	printPermutation("","ABC") -> "ABC ACB BAC BCA CBA CAB"



    public static void printPermutation(String prefix, String str) {  	//recursive method
        //method needs to be called with empty
        // prefix -> printPermutation("", "abc");
        int n = str.length();
        if (n == 0) System.out.println(prefix);
        else {
            for (int i = 0; i < n; i++)
                printPermutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
        }
    }



    //Write a method that will remove all duplicates from string
    //removeDuplicateChars("abcc"); -> "abc"

    public static String removeDuplicateChars(String str) {

        String unique = "";
        Set<String> set = new LinkedHashSet<>();

        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i) + "");
        }

        for (String string : set) {
            unique += string;
        }

        return unique;

    }

    /*
     * Method to remove duplicates from array in Java, without using
     * Collection classes e.g. Set or ArrayList. Algorithm for this
     * method is simple, it first sorts the array and then compares adjacent
     * objects, leaving out duplicates, which is already in the result.
     */
    public static int[] removeDuplicates(int[] numbersWithDuplicates) {

        // Sorting array to bring duplicates together
        Arrays.sort(numbersWithDuplicates);

        int[] result = new int[numbersWithDuplicates.length];
        int previous = numbersWithDuplicates[0];
        result[0] = previous;

        for (int i = 1; i < numbersWithDuplicates.length; i++) {
            int ch = numbersWithDuplicates[i];

            if (previous != ch) {
                result[i] = ch;
            }
            previous = ch;
        }
        return result;

    }




    //Write a method which takes in a space-separated string of integers, and prints out the number of occurrences of each integer.
    //E.x input: "1 5 9 2 1 5 8 1" .  Output: "1(3) 2(1) 5(2) 8(1) 9(1)"

    public static void occurenceOfIntegers(String nums) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length(); i++) {
            char number = nums.charAt(i);

            if (number != ' ') { // to avoid counting empty spaces

                if (!map.containsKey(number)) {
                    map.put(number, 1);
                } else {
                    Integer frequency = map.get(number);
                    map.put(number, ++frequency);
                }

            }

        }
        System.out.println(map);

    }


    //Given a  string "a2dF3hs8S66", write a method to eliminate
    //all characters and return only numbers as int -> 23866

    public static int getInteger(String str) {
        String dig = "";
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))) {
                dig+=str.charAt(i);
            }
        }
        return Integer.parseInt(dig);
    }

    //Swap 2 integer using temp variable
    public static void swapUsingTempVar(int x, int y) {


        int temp = x;
        x = y;
        y = temp;
        System.out.println("After swap x = " + x + ", y = " + y);
    }

    //Swap 2 integer without using temp variable
    public static void swapUsingSum(int x, int y) {


        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swap x = " + x + ", y = " + y);
    }



    //Write a method to convert a decimal number to binary format in Java

    public static String decimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }


    //Write a method to find two max values in an int array
    public static void printTwoMaxValues(int[] nums) {

        int maxOne = 0;
        int maxTwo = 0;
        for (int n : nums) {
            if (maxOne < n) {
                maxTwo = maxOne;
                maxOne = n;
            } else if (maxTwo < n) {
                maxTwo = n;
            }

        }
        System.out.println("Max1: " +maxOne+ " Max2: " + maxTwo);
    }






}
