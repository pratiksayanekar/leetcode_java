import java.util.Arrays;

public class DecodeNumbers_JP {

//	static int decodeNumbers(String line){
//	    if(line.charAt(0)=='0')
//	      return 0;
//	    int [] dp = new int[line.length()+1];
//	    dp[0] = 0;
//	    dp[1] = 1;
//	    for(int i=1; i < line.length(); i++){
//	      // taking first two characters of string to decode
//	      char c = line.charAt(i);
//	      char p = line.charAt(i-1);
//	      
//	      // for invalid characters
//	      if(c=='0' && (p == '0' || p > '2'))
//	        return 0;
//	      
//	      if(p == '0')
//	        dp[i+1] = dp[i];
//	      else if(p == '1'){
//	        if(c == '0')
//	          dp[i+1] = dp[i-1];
//	        else
//	          dp[i+1] = dp[i-1] + dp[i];
//	      }else if(p == '2'){
//	        if(c == '0')
//	          dp[i+1] = dp[i-1];
//	        else if(c<=6)
//	          dp[i+1] = dp[i]+dp[i-1];
//	        else
//	          dp[i+1] = dp[i];
//	      }else
//	        dp[i+1] = dp[i];
//	    }
//	    return dp[line.length()];
//	  }
	  
	
	public static int numDecodings(String s) {
        if (s==null||s.length()==0){
            return 0;
        }
        
        // declare ways array with two extra space, because ways[i] also affect by ways[i+2]
        int[] ways=new int[s.length()+2];
        
        
        Arrays.fill(ways, 1);
        int i=s.length()-1;
        
        ways[i]=s.charAt(i)=='0'?0:1;
        
        for (i=i-1; i>=0; i--){
            if (s.charAt(i)=='0'){
                // if current digit is '0', so no mater what right is, current ways should be 0;
                ways[i]=0;
            }
            else{
               // if current digit is not '0', current ways should be ways[i+1]
               // because, for example s="12", i=0, ways[1]=1, then because current digit is not zero, so for
               // each situation of when i=1, the current i=0 should  be a valid way, 
                ways[i]=ways[i+1];
            
            
            // check is current digit with right 1 digit can be a valid situation,so in this situation only s.charAt(i)=='1'||
            // s.charAt(i)=='2' and s.charAt(i+1)<='6' can be valid situation, the ways[i] should + ways[i+2];
            
                if (i+2<ways.length && s.charAt(i)=='1'||s.charAt(i)=='2' &&s.charAt(i+1)<='6'){
                    ways[i]+=ways[i+2];
               }
            }
        }
        
        return ways[0];
    }
	
	public static void main(String[] args) {
		System.out.println(numDecodings("12"));

	}

}
