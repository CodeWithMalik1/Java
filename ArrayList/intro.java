import java.util.*;
class intro
{
    public static void printArrList(ArrayList<Integer> arr)
    {
        for(int i=0;i<arr.size();i++)
        {
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3); 
        arr.add(4);
        arr.add(5);
        printArrList(arr);
    }
}