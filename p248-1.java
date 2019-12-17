public interface Sample{
    void test();
}

public class A implements Sample{
    public void test(){
        System.out.println( "A");
    }
}

public class B extends A {
    public void test(){
        System.out.println( "B");
    }
}

public class Main{
    public static void main( String[] args){
        Sample[] samples = { new A(), new B()};
        for ( Sample s : samples ){
            s.test();
        }
    }
}