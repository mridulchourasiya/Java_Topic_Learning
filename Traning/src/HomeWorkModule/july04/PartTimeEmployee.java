package HomeWorkModule.july04;

 class PartTimeEmployee extends  Employee{
     private double hourlyRate;
     private int hoursWorked;

     public PartTimeEmployee(double hourlyRate, int hoursWorked){
         this.hourlyRate = hourlyRate;
         this.hoursWorked = hoursWorked;
     }

     @Override
     double calculateSalary(){
         return  hourlyRate * hoursWorked;
     }
}
