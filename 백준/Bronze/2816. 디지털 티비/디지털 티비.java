import java.util.*;
import java.io.*;



public class Main {

    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int N=Integer.parseInt(br.readLine());
    	String [] channels = new String[N]; 
    	int KBS1Index=0;
    	int KBS2Index=0;


    	for(int i=0;i<N;i++) {
    		channels[i]=br.readLine();
    		if(channels[i].equals("KBS1")) {
    			KBS1Index=i; 
    		}
    		
    		if(channels[i].equals("KBS2")) {
    			KBS2Index=i;
    		}
    	}
    	

    	int KBS1pointer=KBS1Index;
    	int KBS2pointer=KBS2Index;
    	while(true) {
    		if(channels[0].equals("KBS1") && channels[1].equals("KBS2")) break;
    		
    		if(KBS1pointer!=0) {
    			KBS1pointer--;
    			bw.write("1");
    			continue;
    		}
    		else if(!channels[0].equals("KBS1")&&KBS1pointer==0) {
    			if(KBS1Index>1&&channels[KBS1Index-1].equals("KBS2")) {
    				KBS2Index+=1;
    				KBS2pointer+=1;
    				channels[KBS2Index]="KBS2";
    			}
    			KBS1Index=KBS1Index-1;
    			channels[KBS1Index]="KBS1";
    			bw.write("4");
    			continue;

    		}
    		if(KBS2pointer!=0 &&KBS1pointer==0) {
    			KBS2pointer--;
    			bw.write("1");
    			continue;

    		}
    		else if(!channels[1].equals("KBS2") &&KBS1pointer==0) {
    			KBS2Index=KBS2Index-1;
				channels[KBS2Index]="KBS2";
    			bw.write("4");
    		}
    	
    	}
    	bw.flush();
    	
    }
    
    
}
