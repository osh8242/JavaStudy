import java.util.Arrays;

public class pb {
	public int solution(int[] ingredient) {
        int answer = 0;
        for (int i = 0 ; i < ingredient.length-3 ; i++){
            if ( ingredient[i] == 1) {
                int[] arr = Arrays.copyOfRange(ingredient, i+1, i+4);
                if ( Arrays.toString(arr)=="[2, 3, 1]") {
                	answer++;
                }
            }
            
        }
        return answer;
    }
}
