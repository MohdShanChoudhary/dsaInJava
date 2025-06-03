public class Palandrom2 {
    public static void main(String[] args){
        String ab="afifashan";
int check=0;
        for(int i=0;i<ab.length()/2;i++){
            if(ab.charAt(i)!=ab.charAt(ab.length()-1-i)){
                check++;
                break;
            }
        }
        if(check==1){
            System.out.println("this  is not a palandrom");

        }
        else{
            System.out.println("this is a palandrom ");
        }
    }
}
