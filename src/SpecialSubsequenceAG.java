import java.util.Scanner;

public class SpecialSubsequenceAG {
    static int findSpecialSubSequenceAG(String A){
        int countA = 0, result = 0;
        for(int i = 0; i < A.length(); i++){
            if(A.charAt(i) == 'A'){
                countA++;
            } else if (A.charAt(i) == 'G') {
                result+=countA;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        System.out.println(findSpecialSubSequenceAG(A));
    }
}
