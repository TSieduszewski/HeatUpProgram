import java.util.Scanner;

public class Data {
    double insertedData;
    public Data(){

    }
    public void insertData(){
        Scanner insertionData = new Scanner(System.in);
        insertedData = insertionData.nextDouble();
    }

    public double getInsertData(){
        return insertedData;
    }
}
