import java.util.Scanner;
class toggle {
  public String tog(String p)
  {
    int i,j,c=0;
    String s="";
    for(i=0;i<p.length();i++)
    {
      if(p.charAt(i)>=97)
        {
          s=s+(char)(p.charAt(i)-32);
        }
      else
        s=s+(char)(p.charAt(i)+32);
    }
    return s;
}
  public static void main(String[] args) {
    Scanner o=new Scanner(System.in);
    toggle q=new toggle();
    System.out.println("enter the string:");
    String a=o.nextLine();
    String p=q.tog(a);
    System.out.println(p);
  }
}