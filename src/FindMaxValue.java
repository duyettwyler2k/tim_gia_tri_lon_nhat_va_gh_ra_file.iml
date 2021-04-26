import java.io.FileNotFoundException;
import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer>numbers){
        int max=numbers.get(0);
        for (int i = 0; i <numbers.size() ; i++) {
            if (max<numbers.get(i)){
                max=numbers.get(i);
            }
        } return max;
    }

    public static void main(String[] args) throws FileNotFoundException {
        ReadAnWriteFile readAnWriteFile=new ReadAnWriteFile();
        List<Integer>numbers=readAnWriteFile.readFile("number.txt");
        int maxValue=findMax(numbers);
        readAnWriteFile.writeFile("result.txt",maxValue);
    }

}
