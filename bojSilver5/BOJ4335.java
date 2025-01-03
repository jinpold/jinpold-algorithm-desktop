package bojSilver5;

import java.io.*;
import java.util.*;
public class BOJ4335{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> low=new ArrayList<>();
        ArrayList<Integer> high=new ArrayList<>();
        while(true){
            int n=Integer.parseInt(br.readLine());
            if(n==0){
                break;
            }
            String w=br.readLine();
            if(w.equals("too high")){
                high.add(n);
            }
            else if(w.equals("too low")){
                low.add(n);
            }
            else{
                boolean a=true;
                for(int i=0; i<low.size(); i++){
                    a= n <= low.get(i) ? false : a;
                }
                for(int i=0; i<high.size(); i++){
                    a= n >= high.get(i) ? false : a;
                }
                bw.write(a ? "Stan may be honest\n" : "Stan is dishonest\n");
                low.clear();
                high.clear();
            }
        }
        bw.flush();

    }

}