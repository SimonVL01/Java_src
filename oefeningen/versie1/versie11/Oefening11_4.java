package oefeningen.versie1.versie11;

public class Oefening11_4 extends Exception {

    public Oefening11_4(String message) throws Exception {
        super(message);
        if (message == null) {
           exceptionOne("Invalid value.");
        }
        else if (message == "") {
           exceptionTwo("Nothing in it.");
        } else if (message == "destroy") {
            exceptionThree("The world is gone.");
        }
    }

    public void exceptionOne(String message) throws NullPointerException {
                throw new NullPointerException(message);
    }

    public void exceptionTwo(String message) throws Exception {
                throw new Exception(message);
    }
    public void exceptionThree(String message) throws Exception {
                throw new Exception(message);
    }

    public static void main(String[] args) {
            try {
              String message = null;
              throw new Oefening11_4(message);
            } catch(Exception exc) {
                System.out.println(exc);
            } finally {
                System.out.println("This exercise has ended.");
            }
    }
}
