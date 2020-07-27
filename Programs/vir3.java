import java.util.*;
public class vir3
{
  public static void main(String[] args) {
  int n = 5;
  ArrayList <ArrayList<Integer>> a = new ArrayList <ArrayList<Integer>>();
  int[] arr = new int[n];
  a.add(Arrays.asList(1,2,100));
  a.add(Arrays.asList(2,5,100));
  a.add(Arrays.asList(3,4,100));
  for(Integer i : a)
  {
    for(int j = a.get(i).get(0)-1;j<a.get(i).get(1);j++)
    {
      arr[i]=arr[i]+a.get(0).get(2);
    }
  }
  int max = 0;
  for(int i=0;i<arr.length;i++)
  {
    if (arr[i]>max)
    {
      max = arr[i];
    }
  }
    System.out.println(max);
}
}
