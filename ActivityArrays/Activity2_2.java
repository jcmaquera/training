package ActivityArrays;

public class Activity2_2 {

    public static void main(String[] args) {

        int[] birdsPerDay = {2, 5, 0, 7, 4, 1};
        int total = 0;

        for(int i = 0; i < 5; i++) {
            total += birdsPerDay[i];
        }
        System.out.println(total);
    }
}
