public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("tony kakkar");

        // get character
        System.out.println(sb);
        System.out.println(sb.charAt(8));

        // set character
        sb.setCharAt(5,'e');
        System.out.println(sb);

        // insert
        sb.insert(8,'y');
        System.out.println(sb);

        // for delete
        sb.delete(3,8);
        System.out.println(sb);

        // for joinig element at last
        sb.append("v");
        System.out.println(sb);

        System.out.println(sb.length());
        
    }
}
