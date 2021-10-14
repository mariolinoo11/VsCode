package Java.progetto1;

public class testStudente {
    public static void main(String[] args) {
        studente s = new studente("mario"," ripesi ",20);
        s.stampa();
        StackStudenti p = new StackStudenti(10);
        p.push(s);
        System.out.println("ci sono n elementi "+p.size());
        p.push(new studente("Andrea"," Marino ",21));
        p.top().stampa();
        StackStudenti q = new StackStudenti();
        System.out.println(StackStudenti.getCount());
    }
}
