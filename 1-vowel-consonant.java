import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Vowel or Consonant\n\n");
        System.out.println("Enter a Character: ");
        char ch = sc.next().charAt(0);

        switch(ch)
        {
            case 'A':
            case 'a':
            case 'E':
            case 'e':
            case 'I':
            case 'i':
            case 'O':
            case 'o':
            case 'U':
            case 'u':
            System.out.println(ch + " is Vowel");
            break;
            
        default:
            if((ch >= 'a' && ch <='z') || (ch >= 'A' && ch <= 'Z'))
                System.out.println(ch + " is Consonant");
            else
		        System.out.println("Invalid input!");	
        }
    }
}