public class CellingOfNumber
{
        public static void main(String[] args)
        {
            int[] arr={1,3,5,7,10,14};
            int target=0;
            int ans= Celling(arr,target);
            System.out.println(ans);
        }
        static  int Celling(int[] ar, int target)
        {
            if(target>ar[ar.length-1])
                return  -1;
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
            return start;
        }
}

