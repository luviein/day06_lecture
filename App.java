import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Function;

public class App {
    public static void main(String[] args) throws Exception {
        // Runnable r = () -> { //cannot put in parameter cos runnable no parameter
        //     System.out.println("Hello World\n");
        //     //cannot return "Hello" cos runnable returns void
        // };

        Greetings g = new Greetings();
        // g.run(); //prints hi world

        Runnable a = g;
        Function<String,String> f = g;
        a.run();
        System.out.printf("f.apply %s\n", f.apply("hello world"));
        //Lambda Expression
        Runnable r = () -> {
            System.out.println("***** hello, world ******");
        };
        Function<String, String> s = (String x) ->{
            return x.toLowerCase();
        };

        r.run();
        System.out.printf("******* apply %s\n,", s.apply("hello world"));
            
        };


        // Function<Integer, String> intToStr = (Integer i) -> {
        // //takes in int returns string
        //     return Integer.toString(i);
        // };

        // String strVal = intToStr.apply(300);
        // r.run();
        // System.out.printf("intToStr: %s\n", strVal);

        // ExecutorService svc = Executors.newSingleThreadExecutor();
        // svc.submit(r);


}


//javac -sourcepath src -d 