import java.io.*;
import java.util.*;
public class maximum
{
public static void main(String[] args)
{
int max;
Scanner s = new Scanner(System.in);
System.out.print("Enter a Value: ");
int val = s.nextInt();
max  = val;
while (val != 0) {
  System.out.print("Enter a Value: ");
  val = s.nextInt();
  if (val > max) {
      max = val;
 }
 };
System.out.println("Max: " + max);
}
}
