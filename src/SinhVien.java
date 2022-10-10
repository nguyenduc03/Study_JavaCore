import lombok.Data;

import java.util.Scanner;

public @Data class SinhVien {
    private String name;
    private int age;

    public SinhVien(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public SinhVien() {
    }
    public void InitSinhVien (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui long nhap ten sinh vien : ");
        this.name = sc.nextLine();
        System.out.println("Vui long nhap tuoi sinh vien : ");
        this.age = sc.nextInt();
    }
}
