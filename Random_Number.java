import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Random;

public class Random_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Kaç Tane Sayı Uretmek İstersiniz: ");
        int numberCount=scanner.nextInt();

        ArrayList<Integer> numbers=new ArrayList<>();
        for(int i=0;i<numberCount;i++){
            int randomNumber =random.nextInt(101);
            numbers.add(randomNumber);
        }
        Map<Integer,Integer> frequencyMap =new HashMap<>();
         for(int number:numbers){
             frequencyMap.put(number,frequencyMap.getOrDefault(number,0)+1);
         }
        System.out.println("Üretilen Sayılar ve Frekansları: ");
         for(Map.Entry<Integer,Integer> entry:frequencyMap.entrySet()){
             System.out.println(entry.getKey()+" "+entry.getValue()+"  kez");
         }
    }
}
