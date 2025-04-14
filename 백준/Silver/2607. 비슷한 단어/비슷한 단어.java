import java.io.*;
import java.util.*;
public class Main {
    
	/*
	 * 
4
DOG
GOD
GOOD
DOLL
DG
	 */
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    	int N= Integer.parseInt(br.readLine());
    	String input = br.readLine();
    	char[] Arr=input.toCharArray();
    	Arrays.sort(Arr);
    	int Alg=input.length();
    	//조건
    	//1.한 문자를 빼거나
    	//2.한 문자를 더하거나
    	//3.하나의 문자를 다른문자로 바꾸거나
    	int cnt=0;
    	
    	for(int i=0;i<N-1;i++) {
    		String Scomp=br.readLine();
    		char [] Sarr=Scomp.toCharArray();
    		Arrays.sort(Sarr);
    		int Slg=Scomp.length();
    		
    		//문자가 같으면서 3번이면 cnt++

			 if(Alg==Slg) {
				 
				 if(Arrays.equals(Arr,Sarr)) cnt++;
				 //한글자 교체
				 else {
					 if(isOneCharDiffSimple(Arr,Sarr)) cnt++;
				 }
				 
			 } 
    		
    		//원 문자열보다 1만큼 크면 2번 
    		if(Alg+1==Slg) {
    			if(isOneCharInserted(Arr,Sarr)) cnt++;
    		}
    		//원 문자열보다 1만큼 작으면 1번 
    		if(Alg==Slg+1) {
    			if(isOneCharInserted(Sarr,Arr)) cnt++;
    		}
    		
    	}
    	
    	System.out.println(cnt);
        
        	
      }
    
    private static boolean isOneCharInserted(char[]shortArr, char[]longArr) {
    	int shotI = 0, longI =0, misMatch=0;
    	
    	while(shotI<shortArr.length&& longI<longArr.length) {
    		
    		if(shortArr[shotI]==longArr[longI]) {
    			shotI++;
    			longI++;
    		}
    		else {
    			longI++;
    			misMatch++;
    			if(misMatch>1) return false;
    			
    		}
    		
    	}
    	
    	
    	return true;
    }
    private static boolean isOneCharDiffSimple(char[] a, char[] b) {
        int match = 0;
        int i = 0, j = 0;

        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                match++;
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }

        return match == a.length - 1;
    }


    
}




