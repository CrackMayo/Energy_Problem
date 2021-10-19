import java.util.Scanner;

public class energy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int normalRate = 0;
        int expensiveRate = 0;
        int clientsNum = 0;
        int powerConsumption = 0;
        int charges = 0;
        normalRate = sc.nextInt();
        expensiveRate = sc.nextInt();
        clientsNum = sc.nextInt();
        for (int i = 0; i < clientsNum; i++) {
            powerConsumption = sc.nextInt();
            if(powerConsumption <= 1000){
                charges = powerConsumption * normalRate;
            }else{
                charges = (1000 * normalRate) + ((powerConsumption - 1000) * expensiveRate);
            }
            
            System.out.println(powerConsumption + " " + charges);
        }
    }
}
