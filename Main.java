public class Main {
  int x = 5;
  final int finalX = 10;

  String fname = "John";
  String lname = "Doe";
  int age = 24;


  static void myMethod() {
    System.out.println("I just got executed!");
  }

  static void myNameFormatter(String fname) {
    System.out.println(fname + " Abdul JaBird");
  }

  static void myAgePrinter(String fname, int age) {
    String msg = (fname == "Charloe") ? "! Gadzooks! Also, dumb dumb dumb dumb dumb name. Give her me timbers!" : "! Gadzooks!";
    System.out.println(fname + " is " + age + msg);
  }

  static int myReturnMethod(int x, int y) {
    return x + y;
  }

  static void checkAge(int age) {

    // If age is less than 18, print "access denied"
    if (age < 18) {
      System.out.println("Access denied - You are not old enough!");

    // If age is greater than, or equal to, 18, print "access granted"
    } else {
      System.out.println("Access granted - You are old enough!");
    }

  }

  static int plusMethod(int x, int y) {
    return x + y;
  }
  
  static double plusMethod(double x, double y) {
    return x + y;
  }

  public static int sum(int k) {
    if (k > 0) {
      return k + sum(k - 1);
    } else {
      return 0;
    }
  }

  public static int haltSum(int start, int end) {
    if (end > start) {
      return end + haltSum(start, end - 1);
    } else {
      return end;
    }
  }

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

    for (int cf = 0; cf < 10; cf++) {
      if (cf == 4) {
        continue;
      }
      System.out.println(cf);
    }

    int cw = 0;
    while (cw < 10) {
      if (cw == 4) {
        cw++;
        continue;
      }
      System.out.println(cw);
      cw++;
    }

    String[] autos = {"Miwenium Flalcon", "Peter Spidermon's Car", "Carpet from Aladdin", "Tan Corolla"};
    int[] myNums = {10, 20, 30, 40};

    System.out.println(autos[0]);
    System.out.println(autos.length);

    myNums[2] = 130;
    System.out.println(myNums[2]);

    for (int auto = 0; auto < autos.length; auto++) {
      System.out.println(autos[auto]);
    }

    int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
    myNumbers[1][2] = 9;
    System.out.println(myNumbers[1][2]); // Outputs 9 instead of 7

    for (int arr = 0; arr < myNumbers.length; ++arr) {
      for(int inarr = 0; inarr < myNumbers[arr].length; ++inarr) {
        System.out.println(myNumbers[arr][inarr]);
      }
    }

    myMethod();

    myNameFormatter("Larry");
    myNameFormatter("Farnsworth");
    myNameFormatter("Dr. Shrimp");

    myAgePrinter("Anddresspski", 14);
    myAgePrinter("Jenvonard", 28);
    myAgePrinter("Charloe", 56);

    int returnValue = myReturnMethod(4, 5);
    System.out.println(returnValue);

    checkAge(20);
    checkAge(14);

    int myInt1 = plusMethod(8, 5);
    double myDouble1 = plusMethod(4.3, 6.26);
    System.out.println("int: " + myInt1);
    System.out.println("double: " + myDouble1);

    /* Variables declared directly inside a method
    are available anywherein the method following
    the line of code in which they were declared */

    // Code here CANNOT use x
    int sandwich = 100;

    // Code here can use x
    System.out.println(sandwich);

    
    // Code here CANNOT use x

    { // This is a block

      // Code here CANNOT use x

      int taterTots = 100;

      // Code here CAN use x
      System.out.println(taterTots);

    } // The block ends here

    // Code here CANNOT use x

    int sumResult = sum(10);
    System.out.println(sumResult);

    int haltSum = haltSum(5, 10);
    System.out.println(haltSum);

    Main myObj = new Main();
    myObj.x = 25; // x is now 25
    System.out.println(myObj.x);

    // myObj.finalX = 25; // will generate an error: cannot assign a value to a final variable
    System.out.println(myObj.finalX);

    Main myObj1 = new Main();  // Object 1
    Main myObj2 = new Main();  // Object 2
    myObj2.x = 25;
    System.out.println(myObj1.x);  // Outputs 5
    System.out.println(myObj2.x);  // Outputs 25

    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Age: " + myObj.age);
  }
}
