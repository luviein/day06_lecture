import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class WorkWithNum {
    public static void main(String[] args) throws IOException{
        List<Integer> numList = new LinkedList<>();

        //Read num into numList
        BufferedReader br = new BufferedReader(new FileReader(args[0]));
        String msg = "";

        while((msg = br.readLine())!= null){
            int i = Integer.parseInt(msg);
            if(i<0){ //adding negatives to list
                numList.add(i);
            }
            

           
        }
        System.out.printf("numList: %s\n", numList, numList.size());

        br.close();
    }
}
