/**
 * Created by Fisher on 27.05.2016.
 */
public class Shell {

    public static void shellSort(int[] a) {
        int size = a.length;
        int step = size / 2;
        while (step > 0)
        {
            for (int i = 0; i < (size - step); i++)
            {
                int j = i;
                while (j >= 0 && a[j] > a[j + step])
                {
                    int temp = a[j];
                    a[j] = a[j + step];
                    a[j + step] = temp;
                    j--;
                }
            }
            step = step / 2;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 6, 8, 1, 4, 7, 0, 2, 5};
        shellSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
