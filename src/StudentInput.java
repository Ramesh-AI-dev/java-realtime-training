import java.util.Scanner;

public class StudentInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR NAME :");
        String Name = sc.nextLine();
        System.out.println("Enter student ID :");
        int id = sc.nextInt();

        System.out.println("Enter cource Fee :");
        double fee = sc.nextDouble();
        System.out.println("\n------Student Details------");
        System.out.println("Name :"+ Name);
        System.out.println("id :"+id);
        System.out.println("fee:$"+fee);

        sc.close();



    }

}
