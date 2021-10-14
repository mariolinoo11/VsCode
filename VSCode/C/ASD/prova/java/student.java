package C.ASD.prova.java;

public class student {
    private String name;
    private String surname;
    private int age;

    public student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String GetName() {
        return name;
    }

    public String GetSurname() {
        return surname;
    }

    public int GetAge() {
        return age;
    }

    public void SetName(String x) {
        this.name= x;
    }

    public void SetSurname(String x) {
        surname = x;
    }
    public void Stampa(){
        System.out.println(name);
        System.out.println(surname);
        System.out.println(age);
    }
}