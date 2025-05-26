import java.util.Scanner;
public class StringComparizan4 {
    public static void main(String[] args ){
        String S1="mohamad";
        String s2="mohamad";
        if(S1==s2){
            System.out.println("Both are equal");
        }
        String S3=new String("mohammad");      // it allocate new memory to mohammad 
        if(S1==S3){                                       // it is also use to compare memory 
            System.out.println("Both are  equal");
        }else{
                        System.out.println("Both are not equal");

        }

        // for comapare the text inside the memory 
        if(S1.equals(S3)){
            System.out.println("now it give true value for compare ");
        }





        // substring - continues part of substing
        String name="riha yawer";
        String fnamee="";
        int si,li;
        Scanner cin=new Scanner(System.in);
        System.out.println("enter starting point");
        si=cin.nextInt();

                System.out.println("enter ending point");
        li=cin.nextInt();
        for(int i=si;i<li;i++){
            System.out.println(name.charAt(i));
            fnamee+=name.charAt(i);
        }
        
        System.out.println(fnamee);




    }
}
