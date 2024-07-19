package oops;

public class Main {
    public static void main(String[] args) {
        int x;
        x=10;
        System.out.println(x);
        Employe employe = new Employe();
        System.out.println("Employe id "+employe.id);
        Employe employe1 = new Employe();
        employe1.name = "name2";
        Employe employe2;
        employe2 = employe1;




    }
}
