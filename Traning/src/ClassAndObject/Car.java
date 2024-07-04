package ClassAndObject;

 class Car {
    private String CarName;
    private int CarNumber;
    private  double CarPrise;

     public Car (String CarName, int CarNumber, double CarPrise){
         this.CarName= CarName;
         this.CarNumber = CarNumber;
         this.CarPrise = CarPrise;
     }

     public double getCarPrise() {
         return CarPrise;
     }

     public void setCarPrise(double carPrise) {
         CarPrise = carPrise;
     }

     public int getCarNumber() {
         return CarNumber;
     }

     public void setCarNumber(int carNumber) {
         CarNumber = carNumber;
     }

     public String getCarName() {
         return CarName;
     }

     public void setCarName(String carName) {
         CarName = carName;
     }


     public void displaInfo(){
         System.out.println("Car Name"+ CarName);
         System.out.println("Car Prise"+CarPrise);
         System.out.println("Car Number "+ CarNumber);
     }


}
