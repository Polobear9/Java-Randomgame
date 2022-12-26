import java.util.Random;
import java.util.Scanner;

public class Tools {
    private static Scanner scanner;
    private static Random random;

    private Tools(){}

    public static Scanner getScannerInstance(){
        if(scanner == null){
            scanner = new Scanner(System.in);
        }
        return scanner;
    }

    public static Random getrandomInstance(){
        if(random == null){
            random = new Random();
        }
        return random;
    }

}
