import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Yandex1 {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String lines;
        char[] strs = null;
        int digit = 0;
        int result = 0;
        ArrayList<Integer> num = new ArrayList();
        ArrayList<Character> ch = new ArrayList();
        String numbers = "";

        try {
                lines = br.readLine();
                strs = lines.toCharArray();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for(char c : strs) {
            ch.add(c);
        }

        for (int i = 0; i < ch.size() + 1; i++) {
            if(Character.isLetter(ch.get(i)) && i==ch.size()-1){
                digit++;
                break;
            }
            if(Character.isDigit(ch.get(i)) && i==ch.size()-1){
                num.add(Character.getNumericValue(ch.get(i)));
                break;
            }
            if(Character.isLetter(ch.get(i)) && Character.isLetter(ch.get(i+1))) {
                digit++;
            }
            if(Character.isDigit(ch.get(i)) && Character.isDigit(ch.get(i+1))) {
                numbers += ch.get(i);
            }
            if(Character.isDigit(ch.get(i)) && Character.isDigit(ch.get(i-1)) && Character.isLetter(ch.get(i+1))) {
                numbers += ch.get(i);
                num.add(Integer.parseInt(numbers));
                numbers = "";
            }
        }

        for (int x : num) {
            result = result + x;
        }
        System.out.println(result + digit);
    }
}
