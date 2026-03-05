package bai1;

import java.util.*;

public class Main {
    //bai1
    public static void main(String[] args) {
        //tao list so thuc
        List<Double> ships = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập số đơn: ");
        int n = Integer.parseInt(sc.nextLine());
        if (n == 0) {
            System.out.println("Lỗi số lượng đơn hàng không hợp lệ");
        } else {
            for (int i = 0; i < n; i++) {
                System.out.println("Mời nhập giá tri đơn thứ " + (i + 1) + ": ");
                ships.add(Double.parseDouble(sc.nextLine()));
            }
            Double min = ships.getFirst();
            Double max = ships.getFirst();
            Double sum = 0.0;
            int express = 0;
            //su dung set de loc trung
            Set<Double> setShips = new TreeSet<>(ships).reversed();
            for (Double e : ships) {
                //tim max
                if (e > max) {
                    max = e;
                }
                //tim min
                if (e < min) {
                    min = e;
                }
                //ting tong
                sum += e;
                //dem don hang hoa toc
                if (e >= 50) {
                    express++;
                }
            }
            System.out.printf("Min: %.1f, Max: %.1f\n", min, max);
            //trung binh phi
            System.out.printf("Average: %.1f\n", sum / n);
            System.out.print("Unque (Desc):");
            for (Double e : setShips) {
                System.out.printf(" %.1f", e);
            }
            System.out.println("\nExpress: " + express);
        }
        sc.close();
    }
}
