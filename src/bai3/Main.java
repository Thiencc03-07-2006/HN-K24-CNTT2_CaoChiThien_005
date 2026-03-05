package bai3;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    //bai3
    public static void main(String[] args) {
        //tao stack
        Stack<String> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi nhap bieu thuc toan hoc: ");
        //tach chuoi
        String[] str = sc.nextLine().trim().split("");
        if (str.length != 0) {
            //cam co
            Boolean flag = true;
            for (String e : str) {
                //day (,[,{ vao stack
                if (e.equals("(") || e.equals("[") || e.equals("{")) {
                    stack.push(e);
                }
                //kiem tra co dong dung khong
                if (e.equals(")")) {
                    if (!stack.isEmpty() && stack.peek().equals("(")) {
                        //lay ra neu dung
                        stack.pop();
                    } else {
                        flag = false;
                        break;
                    }
                }
                if (e.equals("]")) {
                    if (!stack.isEmpty() && stack.peek().equals("[")) {
                        stack.pop();
                    } else {
                        flag = false;
                        break;
                    }
                }
                if (e.equals("}")) {
                    if (!stack.isEmpty() && stack.peek().equals("{")) {
                        stack.pop();
                    } else {
                        flag = false;
                        break;
                    }
                }
            }
            //kiem tra xem con gi trong stack khong
            System.out.println(stack.isEmpty() && flag);
        } else {
            System.out.println("Loi: Bieu thuc hop le");
        }
        sc.close();
    }
}
