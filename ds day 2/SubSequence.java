import java.util.*;
class s{
  void substr(String p,int n)
  {
    for(int i=0;i<n;i++)
    {
      for(int j=i+1;j<=n;j++)
      {
       System.out.println(p.substring(i,j)); 
      }
    }
  }
}
class SubSequence {
  public static void main(String[] args) {
    Scanner o=new Scanner(System.in);
    s u=new s();
    String str="xyz";
    System.out.println("Substring of xyz:");
    u.substr(str,str.length());
  }
}