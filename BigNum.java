package bignum;
import java.util.Iterator;
import java.util.LinkedList;

public class BigNum {


    LinkedList<String> digit_list = new LinkedList<String>();


    public BigNum(int i) //constructor
    {
        digit_list.add("1");   //TODO AUTOMATE VIA LOOP
        digit_list.add("2");
        digit_list.add("3");
        digit_list.add("4");
    }

    public String toString() {
        String s = "";

        // using iterator for looping through linked-list
        Iterator<String> iterator = digit_list.iterator();

        while (iterator.hasNext()) {
            // appending using "+" operator
            s = s + iterator.next() + " ";
        }
        System.out.println(s);
        return s;


    }


}


