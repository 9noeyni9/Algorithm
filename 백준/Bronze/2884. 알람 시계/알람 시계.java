import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int H,M =0;
        H=scan.nextInt();
        M=scan.nextInt();
        if(H >= 0 && H <= 23 && M >= 0 && M <= 59){
            if(M < 45){
                if(H == 0)
                    System.out.println(23 + " " + (60-(45-M)));
                else
                    System.out.println((H-1) + " " + (60-(45-M)));
            }
            else if(M >= 45)
                System.out.println(H + " " + (M-45));
        }
    }

}