import java.util.function.Function;

public class Greetings implements Runnable, Function<String,String> {
    @Override
    public void run(){
        System.out.println("Hi World");
    }

    @Override
    public String apply(String s ) {
        return s.toLowerCase();
    }
}
