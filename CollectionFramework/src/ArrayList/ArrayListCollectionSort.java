package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayListCollectionSort {
    public static void main(String[] args) {
        List<Integer> lt = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter required size");
        int n = sc.nextInt();
        System.out.println("Enter Required elements ");
        for (int i = 0; i < n; i++) {
            lt.add(sc.nextInt());
        }
        System.out.println(lt);

        Collections.sort(lt);
        System.out.println("After sorting");
        System.out.println(lt);
    }
}
