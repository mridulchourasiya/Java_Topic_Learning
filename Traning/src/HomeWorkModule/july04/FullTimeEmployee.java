package HomeWorkModule.july04;

 class FullTimeEmployee extends Employee {
     private  double salary;

     public FullTimeEmployee(double salary){
         this.salary= salary;
     }

     @Override
     double calculateSalary(){
         return  salary;
     }
}
