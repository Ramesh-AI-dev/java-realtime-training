import java.util.Scanner;
public class StudentLoop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many students ?");
        int count = sc.nextInt();
        sc.nextLine();

        for(int i=1 ;i <= count ; i++) {
            System.out.println("Enter Student name :");
            String name = sc.nextLine();
            System.out.println("Enter Student ID");
            int id = sc.nextInt();
            System.out.println("Enter Student Fee :");
            double fee = sc.nextDouble();
            sc.nextLine();
            System.out.println("-----Student Details-----");
            System.out.println("name"+name);
            System.out.println("id"+id);
            System.out.println("fee $"+fee);

        }
        sc.close();



    }
}
