package C.ASD.prova.java;

public class first {
    public static void main(String[] args) {
        student s = new student("mario", "ripesi", 20);
        s.Stampa();
        System.out.println(s.GetName());
        s.SetName("Cesare");
        s.SetSurname("Ripesi");
        s.Stampa();
    }
}
