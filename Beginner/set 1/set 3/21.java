import java.io.*;
import java.util.*;
public class arithmetic
{
public ststic void main(String[] args)
{
int first,diff,term,value,sum=0,i;
Scanner in = new Scanner(System.in);
System.out.println("Enter the number of terms in AP series\n");
term = in.nextInt();
System.out.println("Enter first term and common difference of AP series\n");
first=in.nextInt();
diff=in.nextInt();
value=first;
System.out.println(""AP SERIES\n");
for(i = 0; i < terms; i++) {
        printf("%d ", value);
        sum += value;
        value = value + diff;
    }
    System.out.println("\nSum of the AP series till %d terms is %d\n", terms, sum");
    }
    }

