class Second {
  public static void main(String[] args) {
    Main myObj = new Main();
    System.out.println(myObj.x);

    Main myCar = new Main();     // Create a myCar object
    myCar.fullThrottle();      // Call the fullThrottle() method
    myCar.speed(200);          // Call the speed() method
  }
}
