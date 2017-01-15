package helpers;
import java.util.Random;
public class RandomPass {
    public static String randomString(int size) 
    {
        String str01 = "abcdefghijklmnopqrstuvwxyz";
        String str02 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String str03 = "0123456789";
        
        // These are the valid charecters use to random.
        // Đây là các ký tự được dùng để chuỗi ký tự ngẫu nhiên.
        String strValid = str01 + str02 + str03;
        Random random = new Random();
        
        String mystring = "";
        for( int i=0; i<size; i++ ) {
             int randnum = random.nextInt(strValid.length()); 
             mystring = mystring + strValid.charAt(randnum);
        } 
        
        return mystring;
    }   
    public static void main(String[] args) 
    {
        System.out.println("Random Pas: " + randomString(6));
    }
    
}
