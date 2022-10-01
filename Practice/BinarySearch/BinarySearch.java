public class Binary_search
{
    public static void main(String[] args)
    {
        int[] arr={-1,0,2,3,4,15,22,45};
        int target=22;
        int ans=binarySearch(arr,target);
        System.out.println(ans);
    }
    static  int binarySearch(int[] ar,int target)
    {
        int start=0;
        int end=ar.length - 1;
        while (start<=end)
        {
            int mid=start+(end-start)/2;
            if(ar[mid]==target)
            {
                return mid;
            }
            else if(target<ar[mid])
            {
                end=mid-1;
            }
            else if (target>ar[mid])
            {
                start = mid + 1;
            }
        }
        return -1;
    }
}
