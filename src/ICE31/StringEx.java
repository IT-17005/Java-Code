package ICE31;

public class StringEx {
    public static void main(String[] args){
        String a = "Hello";
        String b = "Ruhan";
        String c = a.concat(b);
        c = c.replace("Ruhan","Nazmul");
        System.out.println(c);
        if (c.equals("HelloRuhan")){
            System.out.println("It's great!!");
        }
        else
            System.out.println("It's not great!!");
    }
}
