import java.util.*;
public class WordCounter {  
   
      static int wordcounter(String string)  
        {  
          int data=0;  
      
            char ch[]= new char[string.length()];     
            for(int i=0;i<string.length();i++)  
            {  
                ch[i]= string.charAt(i);  
                if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                    data++;  
            }  
            return data;  
        }  
      public static void main(String[] args) {  
          Scanner sc=new Scanner(System.in);
          String str=sc.nextLine();
          
         System.out.println(wordcounter(str) + " words.");   
    }  
}  
