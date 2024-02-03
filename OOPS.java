class Pen{
    String colour;
    String type;//ball or gel pen ho skta h

    public void write(){
        System.out.println("write something");
    }
}

public class OOPS{
    public static void main(String args[]){
        Pen  pen1=new Pen();
        pen1.colour="blue";
        pen1.type="gel";
        pen1.write();
    }
}