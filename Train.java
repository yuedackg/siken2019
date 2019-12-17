public class Train{
    static String name = "none";

    public Train( String name){
        this.name = name;
    }
    public static void main( String [] args){
        Train t1 = new Train();
        Train t2 = new Train( "aline");
        System.out.println( t1.name + " " + t2.name );
    }
}