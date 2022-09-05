
//String in java are obj that bached initially by backed array. Since array are immutable(can't grow), string are
// mutable as well as whenever a change to a string are made, an entirely new string is created

public class intro {
    public static void main (String[] args) {

        //declair str without new operator
        String s = "AbhishekAryanGiri";

        //cheatCode => sout+enter -> to print

        //print the str
        System.out.println("String s = " + s );

        //declair string using new variable
        String s1 = new String ("AbhishekAryanGiri");

        //print
        System.out.println("String sl = " + s1);


    }
}
