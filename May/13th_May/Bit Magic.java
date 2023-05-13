class Solution {
    public static int bitMagic(int n, int[] arr) {
        // code here
        int i=0,j=n-1;
        int count=0;
        while(i<=j)
        {
            if(arr[i]!=arr[j])
            count++;
            i++;
            j--;
        }
        return (count+1)/2;
    }
}