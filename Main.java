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

    System.out.println(sum1);   // Outputs 149
    System.out.println(sum2);   // Outputs 400
    System.out.println(sum3);   // Outputs 801
    System.out.println(difference1);   // Outputs 400
    System.out.println(product1);   // Outputs 60000
    System.out.println(quotient1);   // Outputs 2
    System.out.println(remainder1);   // Outputs 50

    int test1 = 2;
    test1 ^= 3;
    System.out.println(test1);

    int test2 = 2;
    test2 <<= 3;
    System.out.println(test2);

    int test3 = 15;
    test3 >>= 3;
    System.out.println(test3);


    System.out.println("The length of the txt string is: " + greeting.length());
    System.out.println(greeting.toUpperCase());   // Outputs "HELLO WORLD"
    System.out.println(greeting.toLowerCase());   // Outputs "hello world"

    String indexTxt = "Please find the index where 'index' occurs!";
    System.out.println(indexTxt.indexOf("index")); // Outputs 16

    System.out.println(firstName.concat(lastName));

    int q = 10;
    int r = 20;
    int s = q + r;  // s will be 30 (an integer/number)

    String t = "10";
    String u = "20";
    String v = t + u;  // v will be 1020 (a String)

    String w = t + r;  // w will be 1020 (a String)

    System.out.println(s);
    System.out.println(v);
    System.out.println(w);

    String quoteTxt = "We are the so-called \"Vikings\" from the north.";
    String apostropheTxt = "It\'s alright.";
    String backslashTxt = "The character \\ is called backslash.";
    String newLineTxt = "Hello\nWorld!";
    String carriageReturnTxt = "Hello\rWorld!";
    String tabTxt = "Hello\tWorld!";
    String backspaceTxt = "Hel\blo World!";

    System.out.println(quoteTxt);
    System.out.println(apostropheTxt);
    System.out.println(backslashTxt);
    System.out.println(newLineTxt);
    System.out.println(carriageReturnTxt);
    System.out.println(tabTxt);
    System.out.println(backspaceTxt);

    int myAge = 25;
    int votingAge = 18;
    System.out.println(myAge >= votingAge);

    int time = 22;
    if (time < 10) {
      System.out.println("Good morning.");
    } else if (time < 18) {
      System.out.println("Good day.");
    } else {
      System.out.println("Good evening.");
    }
    // Outputs "Good evening."

    String result = (time < 18) ? "Good day." : "Good evening.";
    System.out.println(result);

    int day = 4;
    switch (day) {
      case 6:
        System.out.println("Today is Saturday");
        break;
      case 7:
        System.out.println("Today is Sunday");
        break;
      default:
        System.out.println("Looking forward to the Weekend");
    }
    // Outputs "Looking forward to the Weekend"


    int i = 0;
    do {
      System.out.println(i);
      i++;
    } while (i < 5);

    for (int h = 0; h <= 10; h += 2) {
      System.out.println(h);
    }

    for (int m = 1; m <= 2; m++) {
      System.out.println("Outer: " + m); // Executes 2 times
      
      // Inner loop
      for (int n = 1; n <= 3; n++) {
        System.out.println(" Inner: " + n); // Executes 6 times (2 * 3)
      }
    } 

    String[] cars = {"Ferrari", "Audi", "Land Rover", "Tesla"};
    for (String car: cars) {
      System.out.println(car);
    }

    for (int brf = 0; brf < 10; brf++) {
      if (brf == 4) {
        break;
      }
      System.out.println(brf);
    }

    int brw = 0;
    while (brw < 10) {
      System.out.println(brw);
      brw++;
      if (brw == 4) {
        break;
      }
    }
  }
}
