
// Order Agnostic : Dont Know if Array is Sorted in Increasing Or Decreasing Order

public class OrderAgnosticBinarySearch
{
    public static void main(String[] args)
    {
        int[] arr={-10,-4,-1,0,2,3,4,15,22,45};
//        int[]arr={100,50,20,10,3,1,-10,-40,60};
        int target=3;
        int ans=OrderAgnosticBS(arr,target);
        System.out.println(ans);
    }
    static int OrderAgnosticBS(int[] ar,int target)
    {
        int start=0;
        int end=ar.length - 1;

        boolean isAsc=ar[start]<ar[end];

        while (start<=end)
        {
            int mid=start+(end-start)/2;
            if(ar[mid]==target)
            {
                return mid;
            }
            if(isAsc)
            {
                if(target<ar[mid])
                {
                    end=mid-1;
                }
                else
                {
                    start = mid + 1;
                }
            }
            else
            {
                if(target>ar[mid])
                {
                    end=mid-1;
                }
                else
                {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
