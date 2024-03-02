import model.ThiSinh;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin cho thí sinh:");
        System.out.print("Nhập số báo danh: ");
        int soBD = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập họ và tên: ");
        String hoTen = scanner.nextLine();
        System.out.print("Nhập địa chỉ: ");
        String diaChi = scanner.nextLine();
        System.out.print("Nhập mức ưu tiên: ");
        int mucUuTien = scanner.nextInt();
        scanner.nextLine();
        ThiSinh thiSinh = new ThiSinh(soBD, hoTen, diaChi, mucUuTien);
        System.out.println("Thông tin thí sinh:");
        System.out.println(thiSinh);
        scanner.close();
    }
}
