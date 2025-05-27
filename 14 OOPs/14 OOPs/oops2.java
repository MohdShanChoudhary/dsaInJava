
public class oops2 {

    public static void main(String[] args) {

        Pen p1 = new Pen();
        p1.pencolor("red");
        System.out.println(p1.colour);
        p1.penno(56);
        System.out.println(p1.no);

    }
}

class bankaccount {

    public int pass;
    private String uname;

}

class Pen {

    int no;
    String colour;

    void penno(int n) {
        no = n;
    }

    void pencolor(String n) {
        colour = n;
    }
}
