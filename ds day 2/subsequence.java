class subsequence {
  public String[] subseq(String str){
    if(str.length()==0)
    {
      String w[]={" "};
      return w;
    }
    String substr="";
    int i,j;
    for(i=1;i<str.length();i++)
    {
      substr=substr+str.charAt(i);
    }
    String s[]=subseq(substr);
    String p[]=new String[s.length*2];
    for(i=0;i<s.length;i++)
    {
      p[i]=s[i];
    }
    for(j=0;j<s.length;j++)
    {
      p[i]=str.charAt(0)+s[j];
      i++;
    }
    return p;
  }
  public static void main(String[] args) {
    String str="abcde";
    subsequence m=new subsequence();
    String s[]=m.subseq(str);
    for(int i=0;i<s.length;i++)
    {
      System.out.println(s[i]);
    }
  }
}