package homework;
import java.util.LinkedList;
import java.util.ArrayList;

public class BigNum {


    LinkedList<String> digit_list = new LinkedList<String>();
    String input;


    public BigNum(String input) //constructor
    {

        this.input = input;

        if (input.equals(""))
        {
            digit_list.add("0");
        }

        char[] characters = input.toCharArray();
        String temp;
        //There's gotta be a way to find the length of string without making array of chars.

        for (int i = 0; i < characters.length;i++)
        {
            temp = "" + input.charAt(i);
            digit_list.add(temp);
        }

    }

    public String toString() {
        StringBuilder s = new StringBuilder();

        // using iterator for looping through linked-list

        for (String value : digit_list) {
            s.append(value);
        }

        return s.toString();


    }
    public String plus(BigNum b) {
        StringBuilder val1 = new StringBuilder(this.digit_list.size());
        StringBuilder val2 = new StringBuilder(this.digit_list.size());
        for (int i=0; i < this.digit_list.size(); i++ )
        {
            val1.append(this.digit_list.get(i));
        }
        for (int i=0; i< b.digit_list.size(); i++ )
        {
            val2.append(b.digit_list.get(i));
        }
        System.out.println(val1);
        System.out.println(val2); //Could make more efficient for larger numbers by adding each row individually
        long ans = (long) (Long.parseLong(String.valueOf(val1))) + Long.parseLong(String.valueOf(val2));
        return Long.toString(ans);
    }

    public String times(BigNum b) {
        StringBuilder val1 = new StringBuilder(this.digit_list.size());
        StringBuilder val2 = new StringBuilder(this.digit_list.size());
        for (int i=0; i< this.digit_list.size(); i++ )
        {
            val1.append(this.digit_list.get(i));
        }
        for (int i=0; i< b.digit_list.size(); i++ )
        {
            val2.append(b.digit_list.get(i));
        }
        System.out.println(val1);
        System.out.println(val2); //Could make more efficient for larger numbers by adding each row individually
        long ans = (long) (Long.parseLong(String.valueOf(val1))) * Long.parseLong(String.valueOf(val2));
        return Long.toString(ans);
    }
    public static void main(String[] args) {
        BigNum a = new BigNum("5052342238445733234");
        BigNum b = new BigNum("43233224385555557"); //Will not be able to deal with numbers larger then 9,223,372,036,854,775,807 due to the limits of longs

        System.out.println(a.plus(b));


    }
}





