import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai03{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Long> list = new ArrayList<>();
        while(true){
            System.out.println("*****MENU Nhập lương*****");
            System.out.println("1. Nhập lương nhân viên. ");
            System.out.println("2. Hiển thị thống kê. ");
            System.out.println("3. Tính tổng số tiền thưởng cho nhân viên. ");
            System.out.println("4. Thoát. ");
            String option;
            while(true){
                System.out.println("Lựa chọn của bạn: ");
                option = sc.nextLine();
                if(option.equals("1") || option.equals("2") || option.equals("3") || option.equals("4")) break;
                System.out.println("Bạn phải nhập đúng định dạng để thực thi. ");
            }
            switch(option){
                case "1":
                    System.out.println("Nhập lương nhân viên (nhập -2 để kết thức");
                    while(true){
                        System.out.print("Nhập lương: ");
                        Long luong = sc.nextLong();
                        sc.nextLine();
                        if(luong == -1) break;
                        if(luong < 0 || luong > 500000000){
                            System.out.println("Lương không hợp lệ. Nhập lại. ");
                            continue;
                        }
                        list.add(luong);
                        if(luong < 5000000) System.out.println("Thu nhập thấp. ");
                        else if(luong <= 15000000) System.out.println("Thu nhập trung bình. ");
                        else if(luong <= 50000000) System.out.println("Thu nhập khá. ");
                        else{
                            System.out.println("Thu nhập cao. ");
                        }
                    }
                    break;
                case "2":
                    System.out.println("----Thống kê-----");
                    int soLuong = list.size();
                    long tongLuong = 0;
                    for(var x : list){
                        tongLuong += x;
                    }
                    long luongTrungBinh = tongLuong / list.size();
                    long luongCaoNhat = Long.MIN_VALUE;
                    long luongThapNhat = Long.MAX_VALUE;
                    for(var x : list){
                        luongCaoNhat = Math.max(luongCaoNhat, x);
                    }
                    for(var x : list){
                        luongThapNhat = Math.min(luongThapNhat, x);
                    }
                    System.out.printf("Số nhân viên: %d\n", soLuong);
                    System.out.printf("Tổng số tiền: %d VND\n", tongLuong);
                    System.out.printf("Lương trung bình: %d VND\n", luongTrungBinh);
                    System.out.printf("Lương cao nhất: %d VND\n", luongCaoNhat);
                    System.out.printf("Lương thấp nhất: %d VND\n", luongThapNhat);
                    break;
                case "3":
                    Long tongTienThuong = 0L;
                    for(var x : list){
                        Long tienThuong = 0L;
                        if(x < 5000000) tienThuong = (x/100) * 5;
                        else if(x < 15000000) tienThuong = x/100 * 10;
                        else if(x < 50000000) tienThuong = x/100 * 15;
                        else if(x < 100000000) tienThuong = x/100 * 20;
                        else{
                            tienThuong = x/100 * 25;
                        }
                        tongTienThuong += tienThuong;
                    }
                    System.out.println("------Tính tổng tiền thưởng cho nhân viên-----");
                    System.out.printf("Tổng tiền thưởng nhân viên: %d VND\n", tongTienThuong);
                    break;
                case "4":
                    System.out.println("Kết thúc chương trình. ");
                    System.exit(0);
                    break;
            }
        }
    }
}
