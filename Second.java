class Second {
  public int publicAge = 23;
  private int privateAge = 24;
  public static void main(String[] args) {
    Second mySecond = new Second();
    Main myObj = new Main(5, "ShaNayNay");
    System.out.println(myObj.x);

    Main myCar = new Main(5, "Daniel Handsomes");     // Create a myCar object
    myCar.fullThrottle();      // Call the fullThrottle() method
    myCar.speed(200);          // Call the speed() method

    System.out.println(mySecond.privateAge);

    Student myStudent = new Student();

    System.out.println("Name: " + myStudent.fname);
    System.out.println("Age: " + myStudent.age);
    System.out.println("Graduation Year: " + myStudent.graduationYear);
    myStudent.study(); // call abstract method
  }
}
