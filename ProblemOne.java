//for  aaaabbcccd
// the output is:
 
// a4b2c3d1

class ProblemOne{
 {
    
	public static String encode(String str)
	{
          //Your code here
          StringBuilder sb= new StringBuilder("");
    
          for(int i=0;i<str.length();i++){
              int count = 1;
              char ch= str.charAt(i);
               while (i + 1 < str.length() && str.charAt(i + 1) == ch) {
                count++;
                i++;
                }
            sb.append(ch);
            sb.append(count);
        }
        return sb.toString();
	}
    
	
 }
}