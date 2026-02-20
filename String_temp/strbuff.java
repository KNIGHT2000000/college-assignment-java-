package String_temp;

public class strbuff {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("hello");
        System.out.println(sb);
        sb.append(" world");
        System.out.println(sb);
        sb.insert(5, " java");
        System.out.println(sb);
        sb.delete(5, 10);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.trimToSize();
        System.out.println(sb);
        // StringBuffer is mutable, so it can be changed, but it is not thread safe, so it is not recommended to use in multi-threaded environment, if you want to use in multi-threaded environment, you can use StringBuilder which is thread safe and mutable
        //to remove  all spaces in string and return
        String s = "   hello world   ";
        StringBuffer sb1 = new StringBuffer(s);
        sb1.deleteCharAt(0);
        sb1.deleteCharAt(sb1.length() - 1);
        System.out.println(sb1);
        String s1 =new String("oh my god");
        // remove ALL INNER SPACES IN STRING AND RETURN
        StringBuffer sb2 = new StringBuffer(s1);
        for (int i = 0; i < sb2.length(); i++) {
            if (sb2.charAt(i) == ' ') {
                sb2.deleteCharAt(i);
                i--;
            }
             //string tokenizer class is used to split a string into tokens, it is a legacy class and it is not recommended to use, instead we can use split() method of string class
                //s1= "oh my god";
            // StringTokenizer st = new StringTokenizer(s1," ");
            // while (st.hasMoreTokens()) {
            //     System.out.println(st.nextToken());
            // }





        }

    }
}
