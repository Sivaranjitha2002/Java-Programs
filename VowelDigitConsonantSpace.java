import java.util.*;
public class VowelDigitConsonantSpace{
    public static void main(String a[]) throws Exception{
        int i,consonant=0,vowel=0,digits=0,spaces=0;
        char k;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Sentence:");
        String str=s.nextLine();
        for(i=0;i<str.length();i++){
            k=str.charAt(i);
            if(k=='a' || k=='e' || k=='i' || k=='o' || k=='u')
               vowel++;
            else if(k>='a' && k<='z')
                consonant++;
            else if(k>='0' && k<='9')
                digits++;
            else if(k==' ')
                spaces++;
        }
        System.out.println("Vowels: "+vowel+"\nConsonants: "+consonant+"\nDigits: "+digits+"\nSpaces: "+spaces);
    }
}
