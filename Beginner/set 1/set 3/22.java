import java.io.*;
import java.util.*;
public class minimum
{
public static void main(String[] args)
{
int min, max;
Scanner s = new Scanner(System.in);
System.out.print("Enter a Value: ");
int val = s.nextInt();
min  = val;
while (val != 0) {
  System.out.print("Enter a Value: ");
  val = s.nextInt();
  if (val < min) {
      min = val;
 }
 };
System.out.println("Min: " + min);
}
}
