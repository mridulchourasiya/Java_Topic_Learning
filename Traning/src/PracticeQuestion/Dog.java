package PracticeQuestion;

public class Dog {
    private  String name;
    private  String breed;

    public  Dog(String name, String breed){
        this.name = name;
        this.breed = breed;
    }


    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    // display Info Function

    public  void  displayInfo(){
        System.out.println("Dog p :" + name);
        System.out.println("Breed : "+ breed);
    }
}
