class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s=new Stack<>();
        for(String x:operations){
            if(x.equals("C")) s.pop();
            else if(x.equals("D")) s.push(s.peek()*2);
            else if(x.equals("+")) {
                int a=s.pop(),b=s.peek();
                s.push(a);s.push(a+b);
            } else s.push(Integer.parseInt(x));
        }
        int sum=0;
        for(int x:s) sum+=x;
        return sum;
    }
}