import java.util.Arrays;

public class Processor {

public  void  process(int i, int e){
    System.out.println("Process 2 initigera " + i + e);
}

public  void  process(int[] ints){
    System.out.println("Dodaj integer listu " + Arrays.toString(ints));
}
    public  void  process(Object[] obj){
        System.out.println("Dodaj integer listu " + Arrays.toString(obj));
    }

}
