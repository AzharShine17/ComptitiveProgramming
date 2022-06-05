public class ParanthesesChecker {
    public static void main(String[] args) {
        String str = "{[()]}";
//sort using binary search
        System.out.println(ispar(str));

    }
    static boolean ispar(String x)
    {
        // add your code here
        char[] chars = x.toCharArray();
        int left = 0 ,right = chars.length-1;
        boolean isBalanced = true;
        while(left<right){
            if(chars[left]==chars[right]){
                isBalanced = true;
                left++;
                right--;
            }
            else{
                isBalanced = false;
                break;      }


        }
        return isBalanced;
    }

}
