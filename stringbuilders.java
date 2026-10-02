public class stringbuilders {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("hello");
        System.out.println(sb);
        sb.append("java"); // append method is used to add the string at the end of the existing string
        System.out.println(sb);
        sb.insert(1,"java"); // insert method is used to add the string at the specified index
        System.out.println(sb);
        sb.replace(1,3,"java"); // replace method is used to replace the string in the specified range
        System.out.println(sb);
        sb.delete(1,3);
        System.out.println(sb);
        //sb charAt() method is used to return the character at the specified index
        System.out.println(sb.charAt(1));
        //sb setCharAt() method is used to set the character at the specified index

    
    }
}
