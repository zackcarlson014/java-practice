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
  }
}
