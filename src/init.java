import java.util.Scanner;

public class init {
    public static void main(String[] args) {
        Customer customer = new Customer();
        int changeMon =0;
        while(true){

            System.out.println("-------------��Ǯͨ�˵�-------------");
            System.out.println("          1����Ǯͨ��ϸ             ");
            System.out.println("          2����������               ");
            System.out.println("          3������                   ");
            System.out.println("          4���˳�                   ");
            System.out.println("---------------��ѡ��---------------");

            Scanner scanner = new Scanner(System.in);
            int sN = scanner.nextInt();
            if(sN==4) {
                System.out.println("          4���˳�                   ");
                break;
            }
            System.out.println("-----------��Ǯͨ��ϸ---------------");

            if (sN==1) {
                System.out.println("          1����Ǯͨ��ϸ             ");
                customer.show();
            } else if (sN==2) {
                System.out.println("          2����������               ");
                Scanner scanner1 = new Scanner(System.in);
                changeMon=scanner1.nextInt();
                customer.add(changeMon);
            } else if (sN==3) {
                System.out.println("          3������                   ");
                Scanner scanner1 = new Scanner(System.in);
                changeMon = scanner1.nextInt();
                customer.del(changeMon);
            }else {
                System.out.println("input wrong");
            }

        }
        System.out.println("���˳�");
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
            System.out.println("����ȷ");
        }else {
            deposit+=money;
            System.out.println("���� +"+money);
            show();
        }
    }
    public void del(int money){
        if (money < 0) {
            System.out.println("����ȷ");
        } else if (money>deposit) {
            System.out.println("ȡ������ô��Ǯ");
        }else {
            System.out.println("֧�� -"+money);
            deposit-=money;
            show();
        }
    }

}