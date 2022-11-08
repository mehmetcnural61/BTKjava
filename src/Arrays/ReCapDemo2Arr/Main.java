package Arrays.ReCapDemo2Arr;

public class Main {
    public static void main(String[] args) {


        // double[] myList = new double[4]; aşağıdaki ile aynı anlamda !
        double[] myList = {1.2, 1.3, 4.3, 5.6};
        double total = 0;
        double max = myList[0];

        for (double number : myList) {
            total = total + number;
            System.out.println(number);
        }
        System.out.println("Toplam: " + total);

        for (double number : myList) {
            if (max < number) {
                max = number;
            }

        }
        System.out.println("En Buyuk: " + max);


    }
}
