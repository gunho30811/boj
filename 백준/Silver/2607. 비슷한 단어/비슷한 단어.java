import java.io.*;
import java.util.*;
public class Main {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    	int N= Integer.parseInt(br.readLine());
    	String Fword=br.readLine();
    	char[] Fw =Fword.toCharArray();
    	Arrays.sort(Fw);
    	
    	int cnt=0;
    	for(int i=0;i<N-1;i++) {
    		String Nword=br.readLine();
    		char [] Nw = Nword.toCharArray();
    		Arrays.sort(Nw);
    		
    		if(Fw.length==Nw.length) {
    			//아예 같은 문자열
    			if(Arrays.equals(Fw,Nw)) cnt ++;
    			
    			//문자열 길이는 같지만, 변환으로 해결 가능한지 확인
    			else {
    				if (sameWord(Fw,Nw)) cnt++;
    			}
    		}
    		//문자열의 크기는 1개 이상 차이나면 안된다.
    		
    		//FW 보다 Nw 문자열 길이가 1 작은 경우
    		if(Fw.length==Nw.length+1) {
    			if(difLng(Fw,Nw)) cnt++;
    		}
    		
    		//Fw 보다 Nw 문자열 길이가 1 큰 경우 
    		if(Fw.length==Nw.length-1) {
    			if(difLng(Nw,Fw)) cnt++;
    		}
    		
    		
    	}

        System.out.println(cnt);
        	
      }
    
    private static boolean difLng(char L[], char S[]) {
    	int mismatch=0,i=0,j=0;
    	
    	while(i<L.length && j<S.length) {
    		
    		if(L[i]!=S[j]) {
    			i++;
    			mismatch++;
    			if(mismatch>1) return false;
    		}
    		else {i++; j++;}

    	
    		
    	}
    	
    	
    	return true;
    }
    
    private static boolean sameWord(char Fw[], char Nw[]) {
    	int match=0;
    	int j=0; int k=0;
    	while(j<Fw.length && k<Nw.length){
    		
    		if(Fw[j]>Nw[k]) {
    			k++;
    		}
    		else if(Fw[j]<Nw[k]) {
    			j++;
    		}
    		else{
    			match++; j++; k++;
    		}
    		
    	}
    	
    	return match== Fw.length -1;
    }
   

    
}




