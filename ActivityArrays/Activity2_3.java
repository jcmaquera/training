package ActivityArrays;

public class Activity2_3 {


    public static void main(String[] args) {


        int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
        int total=0;

        for (int i = 0; i < birdsPerDay.length; i++) {

            if(birdsPerDay[i] >= 5) {
                total += 1;
            }
        }

        System.out.println(total);


    }
}
