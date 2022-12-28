package ActivityArrays;

public class Activity2_1 {

    public static void main(String[] args) {

        int[] birdsPerDay = { 2, 5, 0, 7, 4, 1};

        boolean result = false;

        for (int i = 0; i < birdsPerDay.length; i++) {

            if(birdsPerDay[i] == 0) {
                result = true;
                System.out.print(result + ", ");
            } else {
                result = false;
                System.out.print(result + ", ");
            }


        }



    }
}
