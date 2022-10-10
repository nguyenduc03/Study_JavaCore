import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int choose = -1;
        do {
            choose = chooseMenuList();
            switch (choose) {
                case 1:
                    // array list
                    xuLy();
                    break;
                case 2:
                    // LinkedList

                    break;

            }
        } while (choose != 0);
    }

    private static void xuLy() {
        List<SinhVien> sinhViens = new ArrayList<>();
        int choose = -1;
        do {
            choose = menuForList();
            switch (choose) {
                case 1:
                    SinhVien sinhVien = new SinhVien();
                    sinhVien.InitSinhVien();
                    sinhViens.add(sinhVien);
                    break;

                case 2:
                    int index = -1;
                    do {
                        System.out.println("Vui long nhap vi tri phan tu : ");
                        Scanner sc = new Scanner(System.in);
                        index = sc.nextInt();
                    } while (index < 0 || index > sinhViens.size());
                    System.out.println(sinhViens.get(index));
                case 3:
                    System.out.println("Vui long nhap vi tri muon thay doi ");
                    Scanner sc = new Scanner(System.in);
                    int indexSet = -1;
                    indexSet = sc.nextInt();
                    if (indexSet < 0 || indexSet > sinhViens.size() - 1)
                        System.out.println("Vi tri khong dung ");
                    else {
                        SinhVien sinhVienInput = new SinhVien();
                        sinhVienInput.InitSinhVien();
                        sinhViens.set(indexSet, sinhVienInput);
                    }
                    break;
                case 4:
                    sc = new Scanner(System.in);
                    int chooseRemove = -1;
                    do {
                        System.out.println("1: xoa ta vi tri");
                        System.out.println("2: xoa phan tu");
                        System.out.println("0: tro ve");
                        chooseRemove = sc.nextInt();
                        if (chooseRemove < 0 || chooseRemove > 2) System.out.println("vui long nhap lai :");

                    } while (chooseRemove < 0 || chooseRemove > 2);
                    switch (chooseRemove) {
                        case 1:
                            int indexRemove = -1;
                            System.out.println("vui long nhap vi tri");
                            indexRemove = sc.nextInt();
                            if (indexRemove < 0 || indexRemove > sinhViens.size()) {
                                System.out.println("Vi tri khong ton tai");
                            } else {
                                sinhViens.remove(indexRemove);
                            }
                            break;
                        case 2:
                            SinhVien sinhVienRemove = new SinhVien();
                            sinhVienRemove.InitSinhVien();
                            sinhViens.remove(sinhVienRemove);
                            break;
                    }
                case 5:
                    sinhViens.clear();
                    break;
                case 6:
                    System.out.println("So luong phan tu la : " + sinhViens.size());
                    break;
                case 7:
                    System.out.println("vui long nhap thong tin sinh vien muon tim ");
                    SinhVien sinhVienInput = new SinhVien();
                    sinhVienInput.InitSinhVien();
                    sinhViens.contains(sinhVienInput);
                    break;
                case 8:
                    System.out.println(sinhViens);

            }
        } while (choose != 0);


    }

    private static int menuForList() {
        int key = 0;
        do {
            System.out.println("1:\tAdd");
            System.out.println("2:\tget");
            System.out.println("3:\tset");
            System.out.println("4:\tremove ");
            System.out.println("5:\tclear ");
            System.out.println("6:\tsize ");
            System.out.println("7:\tcontains ");
            System.out.println("8:\tshow list");
            System.out.println("0:\ttro ve ");
            System.out.print("vui long chon : ");
            Scanner sc = new Scanner(System.in);
            key = sc.nextInt();
            if (key < 0 || key > 11) {
                System.out.println("Vui long nhap lai >0 va <11");
                key = sc.nextInt();
            }
        } while (key < 0 || key > 11);
        return key;
    }

    private static int chooseMenuList() {
        int key = 0;
        do {
            System.out.println("1:\tArrayList");
            System.out.println("2:\tLinkedList");
            System.out.println("0:\tBack ");
            System.out.print("vui long chon : ");
            Scanner sc = new Scanner(System.in);
            key = sc.nextInt();
            if (key < 0 || key > 2) {
                System.out.println("Vui long nhap lai >0 va <3");
                key = sc.nextInt();
            }
        } while (key < 0 || key > 2);
        return key;
    }
}