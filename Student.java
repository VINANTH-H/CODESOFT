package pack2;

import java.util.Scanner;

//Student grade calculator
public class Student {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the name of the student :");
        String name=sc.nextLine();

        System.out.println("Enter the marks scored in 1.MATH 2.PHYSICS 3.CHEMISTRY 4.COMPUTER SCIENCE 5.ENGLISH");
        int arr[]=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        float sum=0;
        System.out.println("The total marks of all 5 subjects are:");
        for(int j=0;j<5;j++) {
            sum = sum + arr[j];
        }
        System.out.println("The total marks of all 5 subjects are:"+sum);
        float per=((sum/5)*100);
        System.out.println("The average % of all 5 subjects are:"+per+"%");

        System.out.println("Marks scored by " +name+  "In" + "1.MATH 2.PHYSICS 3.CHEMISTRY 4.COMPUTER SCIENCE 5.ENGLISH");
        for(int k=0;k<5;k++){
            System.out.println(arr[k]);
            System.out.println();
        }

        if(per>80){
            System.out.println("Grade A , Excellent");
        }
        else if(per<80 && per>=60){
            System.out.println("Grade B , Good");

        }
        else if(per<60 && per>=50){
            System.out.println("Gade C , Not Bad ");
        }
        else if(per<50 && per>=30){
            System.out.println(" JUST PASS , Can do better ");
        }
        else{
            System.out.println("Failed");
        }

    }
}
