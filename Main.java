public class Main {
  public static void main(String[] args) {
    /* The code below will print the words Hello World
    to the screen */
    System.out.println("Hello World! ");
    System.out.println("I will print on the same line.");
    System.out.println(3);
    // This code will print out 51 to the screen
    System.out.println(358 / 7);
    System.out.println(50000);

    String name = "John";
    System.out.println(name);

    int myNum = 15;
    myNum = 20;  // myNum is now 20
    System.out.println(myNum);

    float myFloat = 5.99f;
    char myChar = 'Z';
    boolean myBoolean = true;
    String myString = "Hello";

    System.out.println(myFloat);
    System.out.println(myChar);
    System.out.println(myBoolean);
    System.out.println(myString);

    String firstName = "Zack ";
    String lastName = "C";
    String fullName = firstName + lastName;
    System.out.println(fullName);

    int x = 5;
    int y = 6;
    System.out.println(x + y); // Print the value of x + y

    int j = 5, k = 6, l = 50;
    System.out.println(j + k + l);

    int a, b, c;
    a = b = c = 50;
    System.out.println(a + b + c);

    byte myByte = 100;
    System.out.println(myByte);

    short myShort = 5000;
    System.out.println(myShort);

    int myInt = 100000;
    System.out.println(myInt);

    long myLong = 15000000000L;
    System.out.println(myLong);

    double myDouble = 19.99d;
    System.out.println(myDouble);

    boolean isJavaFun = true;
    boolean isLeonardADonkey = false;
    System.out.println(isJavaFun);     // Outputs true
    System.out.println(isLeonardADonkey);   // Outputs false

    char myGrade = 'Z';
    System.out.println(myGrade);

    /* Alternatively, if you are familiar with ASCII values
    you can use those to display certain characters */
    char myChar1 = 65, myChar2 = 66, myChar3 = 67;
    System.out.println(myChar1);
    System.out.println(myChar2);
    System.out.println(myChar3);

    String greeting = "Hello World";
    System.out.println(greeting);

    /* Widening casting is done automatically when passing
    a smaller size type to a larger size type */
    int myWideningInt = 9;
    double myWideningDouble = myWideningInt; // Automatic casting: int to double

    System.out.println(myWideningInt);      // Outputs 9
    System.out.println(myWideningDouble);   // Outputs 9.0

    /* Narrowing casting must be done manually by placing
    the type in parentheses in front of the value */
    double myNarrowingDouble = 9.78d;
    int myNarrowingInt = (int) myNarrowingDouble; // Manual casting: double to int

    System.out.println(myNarrowingDouble);   // Outputs 9.78
    System.out.println(myNarrowingInt);      // Outputs 9

    int sum1 = 100 + 50;        // 150 (100 + 50)
    int sum2 = sum1 + 250;      // 400 (150 + 250)
    int sum3 = sum2 + sum2;     // 800 (400 + 400)

    int difference1 = sum3 - sum2;    // 400 (800 - 400)
    int product1 = sum1 * sum2;       // 60000 (150 * 400)
    int quotient1 = sum3 / sum2;      // 2 (800 / 400)
    int remainder1 = sum3 % sum1;     // 50 (800 / 150)

    ++sum3;
    --sum1;

    sum3 |= 3;

    // System.out.println(sum1);   // Outputs 149
    // System.out.println(sum2);   // Outputs 400
    // System.out.println(sum3);   // Outputs 801
    // System.out.println(difference1);   // Outputs 400
    // System.out.println(product1);   // Outputs 60000
    // System.out.println(quotient1);   // Outputs 2
    // System.out.println(remainder1);   // Outputs 50

    int test1 = 2;
    test1 ^= 3;
    System.out.println(test1);

    int test2 = 2;
    test2 <<= 3;
    System.out.println(test2);

    int test3 = 15;
    test3 >>= 3;
    System.out.println(test3);

  }
}
