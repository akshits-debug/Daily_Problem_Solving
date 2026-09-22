class Solution {
    public int[] kWeakestRows(int[][] mat,int k) {
        int n=mat.length;
        int[] a=new int[n],r=new int[n];
        for(int i=0;i<n;i++){
            r[i]=i;
            for(int x:mat[i]) a[i]+=x;
        }
        for(int i=0;i<n-1;i++){
            int p=i;
            for(int j=i+1;j<n;j++)
                if(a[j]<a[p]||(a[j]==a[p]&&r[j]<r[p])) p=j;
            int t=a[i];a[i]=a[p];a[p]=t;
            t=r[i];r[i]=r[p];r[p]=t;
        }
        return java.util.Arrays.copyOf(r,k);
    }
}