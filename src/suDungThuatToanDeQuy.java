import javafx.print.Collation;

import java.util.*;

public class suDungThuatToanDeQuy implements Comparator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("Nhập vào số lượng phần tử : ");
        int n = Integer.parseInt(input.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("nhập phần tử thứ : " + (i + 1));
            list.add(new Random().nextInt());
        }
        Collections.sort(list);
        binarySearch(list,0, list.size(), 9);
    }

    public static int binarySearch(List<Character> list, int left, int right, int value) {
        while (left <= right) {
            int middle = (left + right) / 2;
            if (list.get(middle) == value) {
                return middle;
            } else if (list.get(middle) > value) {
                return binarySearch(list,left,middle-1,value);
            } else {
                return binarySearch(list,middle+1,right,value);
            }
        }
        return -1;
    }

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2;
    }

}
