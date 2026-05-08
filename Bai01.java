import java.util.Scanner;

public class Bai01{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String fullName, nameProduct, price, count;
        String card;
        while(true){
            System.out.print("Nhập tên khách hàng: ");
            fullName = sc.nextLine();
            if(fullName.length() < 1){
                System.out.println("Bạn phải nhập đầy đ thông tin. ");
                continue;
            }
            break;
        }
        while(true){
            System.out.print("Nhập tên sẳn phẩm: ");
            nameProduct = sc.nextLine();
            if(nameProduct.length() < 1){
                System.out.println("Bạn phải nhập đầy đủ thông tin. ");
                continue;
            }
            break;
        }
        while(true){
            System.out.print("Nhập giá sản phẩm: ");
            price = sc.nextLine();
            if(price.length() < 1 || Integer.parseInt(price) < 0){
                System.out.println("Bạn phải nhập đúng giá sản phẩm. ");
                continue;
            }
            break;
        }
        while(true){
            System.out.print("Nhập số lượng sản pẩm: ");
            count = sc.nextLine();
            if(count.length() < 0 || Integer.parseInt(count) < 0){
                System.out.println("Bạn phải nhập giá sản phẩm. ");
                continue;
            }
            break;
        }
        while(true){
            System.out.print("Khách có thẻ thành viên (true/false): ");
            card = sc.nextLine();
            if(card.length() < 1){
                System.out.println("Người dùng phải nhập thông tin. ");
                continue;
            }
            else if(!card.equals("true") && !card.equals("false")){
                System.out.println("Bạn phải nhập đúng định dạng. ");
                continue;
            }
            break;
        }
        int total = Integer.parseInt(price) * Integer.parseInt(count);
        int discount = card.equals("true")?total * 10/100:0;
        System.out.println("Khách hàng: " + fullName);
        System.out.println("Sản phẩm: " + nameProduct);
        System.out.println("Giá: " + price + " VNĐ");
        System.out.println("Số lượng: " + count);
        System.out.println("Thành tiền: " + total);
        System.out.println("Giảm giá: " + discount);
        System.out.println("Tiền VAT: " + (total * 8/100));
        System.out.println("Tổng tiền thanh toán: " + (total - discount + total * 8/100));
    }
}
