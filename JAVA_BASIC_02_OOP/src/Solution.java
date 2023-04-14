
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int[] solution(int[] numlist, int n) {
        int[] answer = {};
        int[] distance = new int[numlist.length];
        for (int i = 0; i<distance.length; i+) {
        	distance[i] = numlist[i]-n;
        }        
        int index = 0;
        for (int i =0; i<10000; i++) {
        	for (int j=0; j<distance.length; j++) {
        		if(distance[j]==i) {
        			answer[index]=numlist[j];
        		}
        	}        	
        }
        return answer;
    }

}
