import java.util.Scanner;

public class init {
    public static void main(String[] args) {
        Customer customer = new Customer();
        int changeMon =0;
        while(true){

            System.out.println("-------------零钱通菜单-------------");
            System.out.println("          1、零钱通明细             ");
            System.out.println("          2、收益入账               ");
            System.out.println("          3、消费                   ");
            System.out.println("          4、退出                   ");
            System.out.println("---------------请选择---------------");

            Scanner scanner = new Scanner(System.in);
            int sN = scanner.nextInt();
            if(sN==4) {
                System.out.println("          4、退出                   ");
                break;
            }
            System.out.println("-----------零钱通明细---------------");

            if (sN==1) {
                System.out.println("          1、零钱通明细             ");
                customer.show();
            } else if (sN==2) {
                System.out.println("          2、收益入账               ");
                Scanner scanner1 = new Scanner(System.in);
                changeMon=scanner1.nextInt();
                customer.add(changeMon);
            } else if (sN==3) {
                System.out.println("          3、消费                   ");
                Scanner scanner1 = new Scanner(System.in);
                changeMon = scanner1.nextInt();
                customer.del(changeMon);
            }else {
                System.out.println("input wrong");
            }

        }
        System.out.println("已退出");
    }
}

class Customer{
    int deposit =0;
    public Customer(){

    }
    public void show(){
        System.out.println("          "+deposit+"          ");
    }
    public void add(int money){
        if (money < 0) {
            System.out.println("金额不正确");
        }else {
            deposit+=money;
            System.out.println("收入 +"+money);
            show();
        }
    }
    public void del(int money){
        if (money < 0) {
            System.out.println("金额不正确");
        } else if (money>deposit) {
            System.out.println("取不出这么多钱");
        }else {
            System.out.println("支出 -"+money);
            deposit-=money;
            show();
        }
    }

}