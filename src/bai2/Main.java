package bai2;

import java.util.*;

public class Main {
    //bai2
    public static void main(String[] args) {
        //su dung Map de luu chu
        Map<String, Integer> categorys = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi nhap chuoi danh muc (cach nhau boi dau ,):");
        String str = sc.nextLine().trim();
        //kiem tra chuoi rong
        if (!str.isEmpty()) {
            //tach chuoi
            String[] arr = str.toLowerCase().split(",");
            // luu vao categorys
            for (String e : arr) {
                String temp = e.trim();
                if (categorys.containsKey(temp)) {
                    categorys.put(temp, categorys.get(temp) + 1);
                } else {
                    categorys.put(temp, 1);
                }
            }
            //hien thi danh sach
            System.out.print("Danh sach: ");
            for (Map.Entry<String, Integer> e : categorys.entrySet()) {
                System.out.printf("%s:%d, ", e.getKey(), e.getValue());
            }
            System.out.print("\nMoi nhap ten danh muc can tra cuu: ");
            String seach = sc.nextLine().trim().toLowerCase();
            //tim kiem danh muc
            if (categorys.containsKey(seach)) {
                System.out.printf("Search \"%s\": %d", seach, categorys.get(seach));
            } else {
                System.out.println("Khong tim thay danh muc");
            }
        } else {
            System.out.println("Loi: Chuoi khong hop le");
        }
        sc.close();
    }
}