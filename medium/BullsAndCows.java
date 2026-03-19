import java.util.*;

public class BullsAndCows {

    public static String getHint(String secret, String guess) {

        int bulls = 0;
        int cows = 0;

        int[] count = new int[10];

        for(int i = 0; i < secret.length(); i++){

            char s = secret.charAt(i);
            char g = guess.charAt(i);

            if(s == g){
                bulls++;
            }
            else{
                if(count[s - '0'] < 0){
                    cows++;
                }
                if(count[g - '0'] > 0){
                    cows++;
                }

                count[s - '0']++;
                count[g - '0']--;
            }
        }

        return bulls + "A" + cows + "B";
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter secret:");
        String secret = sc.nextLine();

        System.out.println("Enter guess:");
        String guess = sc.nextLine();

        String result = getHint(secret, guess);

        System.out.println("Output: " + result);
    }
}