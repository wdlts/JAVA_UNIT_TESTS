package UNIT_TEST_DZ.DZ1;

public class TEMP_TEST {

    public static void main(String[] args) {

    }

    public static void totalProfit(){
        int[] N = new int[30];
        int addPriceEveryMFloors = 1000;
        int raiseEvery = 10;
        int firstFloorPrice = 10000;
        int total = 0;
        int count=0;

        for (int i = 0; i < N.length; i++) {
            N[i] = 10000;
            count++;
            if (count==10){
                N[i]+=1000;
                count=0;
            }
            System.out.println(N[i]);

        }

    }

}
