package homework;

import edu.princeton.cs.algs4.StdOut;

import java.util.LinkedList;

public class BigNum {
    LinkedList<String> digit_list  = new LinkedList<String>();
    BigNum(String input){

        if (input.equals("")){
            digit_list.add("0");
        }

        for (int i =0; i < input.length(); i++){
            digit_list.add("" + input.charAt(i));
        }
    }

    public String toString(){
        StringBuilder s = new StringBuilder();
        for (String value : digit_list){
            s.append(value);
        }
        return s.toString();
    }

    public void makeNumsSameLength(BigNum a, BigNum b){
        int max_str_len = Math.max(a.digit_list.size(), b.digit_list.size());
        int a_size = a.digit_list.size();
        int b_size = b.digit_list.size();
        if (a_size != b_size){
            for (int i = Math.min(a_size, b_size); i < max_str_len; i++){
                if (a_size > b_size){
                    b.digit_list.addFirst("0");
                }
                else {
                    a.digit_list.addFirst("0");
                }
            }
        }
    }

    public BigNum plus(BigNum a) {
        makeNumsSameLength(this, a);

        int max_str_len = Math.max(this.digit_list.size(), a.digit_list.size());

        StringBuilder c_String = new StringBuilder();
        for (int i = max_str_len - 1 ; i >= 0; i--){
            String this_digit = this.digit_list.get(i);
            String a_digit = a.digit_list.get(i);
            int digit_answer = Integer.parseInt(String.valueOf(this_digit)) + Integer.parseInt(String.valueOf(a_digit));
            if (digit_answer >= 10){
                if (i == 0){
                    this.digit_list.addFirst("0");
                    a.digit_list.addFirst("0");
                    i = i+1;
                }
                int add_to_next = digit_answer / 10;
                int next_digit = Integer.parseInt(String.valueOf(this.digit_list.get(i - 1)));
                this.digit_list.set(i-1, Integer.toString(next_digit + add_to_next) );
                digit_answer = digit_answer % 10;
            }

            c_String.insert(0, Integer.toString(digit_answer));
        }

        return new BigNum(c_String.toString());
    }

    public BigNum times(BigNum b) {
        BigNum product = new BigNum("0");
        BigNum counter = new BigNum("0");


//        Works, but very inefficient with long numbers
//        while(!(counter.toString().equals(b.toString()))){
//            product = new BigNum(product.plus(this).toString());
//            counter = new BigNum(counter.plus(new BigNum("1")).toString());
//        }
        return product;
    }

}
