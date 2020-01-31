public class Person {

   private String firstName;
   private String lastName;
   private int birthYear;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public Person(String firstName, String lastName, int birthYear) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.birthYear = birthYear;

    }
    public Person() {

    }

    public  int getAge(){
        int p = 2020;
        birthYear = p - birthYear;
        return birthYear;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
    public void input(String firstName, String lastName, int birthYear){
        this.firstName = firstName;
        this.birthYear = birthYear;
        this.lastName = lastName;
    }

    public void output(){
        System.out.print("\n" + this.firstName + "\n" + this.lastName + "\n" + this.birthYear + "\n");
    }

    public void changeName (String firstName,String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }



}
