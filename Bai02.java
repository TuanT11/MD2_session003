import java.util.Scanner;
import java.util.*;

public class Bai02{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Float> list = new ArrayList<>();
        while(true){
            System.out.println("*****MENU NHẬP ĐIỂM*****");
            System.out.println("1. Nhập điểm học viên. ");
            System.out.println("2. Hiển thị thống kê.");
            System.out.println("3. Thoát");

            String option;
            boolean ok = true;
            while(true){
                System.out.print("Lựa chọn của bạn: ");
                option = sc.nextLine();
                if(option.length() < 1){
                    System.out.println("Bạn phải nhập thông tin. ");
                    continue;
                }
                else if(!option.equals("1") && !option.equals("2") && !option.equals("3")){
                    System.out.println("Bạn phải nhập đúng định dạng. ");
                    continue;
                }
                break;
            }
            switch(option){
                case "1":
                    String score;
                    while(true){
                        System.out.print("Nhập điểm: ");
                        score = sc.nextLine();
                        if(score.length() < 1){
                            System.out.println("Bạn phải nhập thông tin. ");
                            continue;
                        }
                        else if(Float.parseFloat(score) < 0 || Float.parseFloat(score) > 10){
                            if(Float.parseFloat(score) == -1) break;
                            System.out.print("Điểm không hợp lệ. Nhập lại. ");
                            continue;
                        }
                        float ans = Float.parseFloat(score);
                        if(ans < 5) System.out.println("Học lực: " + "Yếu");
                        else if(ans >= 5 && ans < 7) System.out.println("Học lực: " + "Trung bình");
                        else if(ans >= 7 && ans < 8) System.out.println("Học lực: " + "Khá");
                        else if(ans >= 8 && ans < 9) System.out.println("Học lực: " + "Giỏi");
                        else System.out.println("Học lực: " + "Xuất sắc");
                        list.add(ans);
                    }
                    break;
                case "2":
                    if(list.isEmpty()){
                        System.out.println("Không có dữ liệu nào. ");
                    }
                    else{
                        System.out.println("Số học viên đã nhập: " + list.size());
                        float sum = 0f;
                        for(var x : list){
                            sum += x;
                        }
                        System.out.printf("Điểm trung bình: %.2f\n", (sum/ list.size()));
                        float maxn = -1f;
                        float minn = 11f;
                        for(var x : list){
                            maxn = Math.max(maxn, x);
                        }
                        for(var x : list){
                            minn = Math.min(minn, x);
                        }
                        System.out.printf("Điểm cao nhất: %.2f\n", maxn);
                        System.out.printf("Điểm thấp nhất: %.2f\n", minn);
                    }
                    break;
                case "3":
                    ok = false;
                    break;
            }
            if(!ok) break;
        }
    }
}
