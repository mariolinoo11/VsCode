package Java.progetto1;

public class StackStudenti {

    private final int max = 10;
    private static int count = 0;

    private int sp;
    private studente[] array;

    public StackStudenti(int maxSize) {
        array = new studente[maxSize];
        sp = 0;
        count++;
    }

    public studente pop() {
        studente p = array[sp - 1];
        array[sp - 1] = null;
        sp--;
        return p;
    }

    public void push(studente x) {
        array[sp] = x;
        sp++;
    }

    public studente top() {
        return (array[sp - 1]);
    }

    public boolean isEmpty() {
        return (sp == 0);
    }

    public boolean isFull() {
        return (array.length == sp);
    }

    public int size() {
        return sp;
    }
    public StackStudenti() {
        array = new studente[max];
        sp = 0;
        count++;
    }

    public static int getCount() {
        return count;
    }
    

}