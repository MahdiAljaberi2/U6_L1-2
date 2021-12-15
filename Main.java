import java.util.*;
class Main {
  public static void main(String[] args) {
int[] nums=new int[6];
nums[0]=5;
nums[1]=10;
nums[2]=15;
nums[3]=20;
nums[4]=25;
nums[5]=30;

for (int i=0;i<nums.length;i++)
{
  System.out.println("nums["+i+"]="+nums[i]);
}
System.out.println();
for (int i=nums.length-1;i>-1;i--)
{
  System.out.println("nums["+i+"]="+nums[i]);
}
System.out.println();
//Use array elements in a calculation
int sum=nums[0]+nums[1];
System.out.println("sum="+sum);
nums[5]=nums[5]*2;
System.out.println("nums[5]="+nums[5]);

for (int i=0;i<nums.length;i++)
{
  nums[i]/=5;
  System.out.println("nums["+i+"]="+nums[i]);
}

int[] nums2={5,10,15,20,25,30};

for (int i=0;i<nums2.length;i++)
{
  nums2[i]+=100;
  System.out.println("nums2["+i+"]="+nums2[i]);
}

String[] candy = new String[5];
Scanner scan = new Scanner(System.in);
for (int i=0;i<candy.length;i++)
{
  System.out.println("Enter a candy name:");
  candy[i]=scan.nextLine();
  System.out.println("candy{"+i+"}="+candy[i]);
}


  }
}