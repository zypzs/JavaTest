package test;

import java.util.*;

 class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
public class Solution {
    public ArrayList<String> Permutation (String str){
    	ArrayList <String> list = new ArrayList<String>();
    	if(str == null || str.length() == 0){
    		return list;
    	}
    	HashSet<String> set = new HashSet<String>();
    	addString(set,str.toCharArray(),0);
    	list.addAll(set);
    	Collections.sort(list);
    	
    	return list;
    }
	private void addString(HashSet<String> set, char[] str, int k) {

		if(k == str.length){
			set.add(new String(str));
			return ;
		}
		for(int i = k;i<str.length;i++){
			swap(str,i,k);
			addString(set,str,k+1);
			swap(str,i,k);
		}
	}
	
	private static void swap(char[] arr, int k, int biggerIndex) {

		char temp = arr[k];
		arr[k] = arr[biggerIndex];
		arr[biggerIndex] = temp;
	}
	
	public String PrintMinNumber(int [] numbers) {
        if(numbers == null || numbers.length == 0) return "";
        int len = numbers.length;
        String[] str = new String[len];
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < len; i++){
            str[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(str,new Comparator<String>(){
            @Override
            public int compare(String s1, String s2) {
                String c1 = s1 + s2;
                String c2 = s2 + s1;
                return c1.compareTo(c2);
            }
        });
        for(int i = 0; i < len; i++){
            sb.append(str[i]);
        }
        return sb.toString();
    }
	
	
	  public boolean VerifySquenceOfBST(int [] sequence) {
	        if(sequence == null || sequence.length == 0)
	            return false;
	        return isPost(sequence,0,sequence.length-1);
	    }
	    private boolean isPost(int []arr,int start,int end){
	        if(start >= end)
	            return true;
	        int i = start;
	        for(;i<end;i++){
	            if(arr[i] > arr[end]){
	                break;
	            }
	        }
	        for(int j = i;j<end;j++){
	            if(arr[j] < arr[end])
	                return false;
	        }
	        return isPost(arr,start,i-1) && isPost(arr,i,end-1);
	    }
	    
	    public TreeNode Convert(TreeNode pRootOfTree) {
	        Queue<TreeNode> queue = new LinkedList<TreeNode>();
	        insertToQueue(pRootOfTree,queue);
	        if(queue.isEmpty()){
	        	return null;
	        }
	        TreeNode head = queue.poll();
	        TreeNode pre = head;
	        pre.left = null;
	        TreeNode cur = null;
	        while(!queue.isEmpty()){
	        	cur = queue.poll();
	        	pre.right = cur;
	        	cur.left = pre;
	        	pre = cur;
	        }
	        pre.right = null;
	        return head;
	    }
	private void insertToQueue(TreeNode root, Queue<TreeNode> queue) {

		if(root == null){
			return ;
		}
		insertToQueue(root.left,queue);
		queue.offer(root);
		insertToQueue(root.right,queue);
		}
	
	 public int GetUglyNumber_Solution(int index) {
		 int num = 0;
		 int i =1;
		 while(num < index){
			 if(isUglyNumber(i++)){
				 num ++;
			 }
		 }
	        return i-1;
	    }
	private boolean isUglyNumber(int i) {
		if(i == 1)
			return true;
		boolean flg = true;
		int temp ;;
		while(flg){
			temp = i;
			i = i%2 == 0 ? i/2 : i;
			i = i%3 == 0 ? i/3 : i;
			i = i%5 == 0 ? i/5 : i;
			if(temp == i){
				flg = false;
			}
		}
		if(i == 1)
			return true;
		else
		return false;
	}
	
    public int GetNumberOfK(int [] array , int k) {
       int res = 0;
       char c = (char) (k + '0');
       for(int a : array){
    	   char []chars = String.valueOf(a).toCharArray();
    	   for(int i =0;i<chars.length;i++){
    		   if(chars[i] == c){
    	    		  res ++;
    	    	  }
    	   }
    	 
       }
       return res;
    }
    
    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        if (array == null || array.length < 2)
            return;
        int temp = 0;
        for (int item : array)
            temp ^= item;
        int firstIndex = findFirstIndex(temp);
        num1[0]=0;
        num2[0]=0;
        for(int i:array){
            if(isBit1(i,firstIndex))
                num1[0]^=i;
            else
                num2[0]^=i;
        }
 
    }
 
    // 二进制数 从右往左 找到第一个 "1"
    public int findFirstIndex(int n) {
        int index = 0;
        while ((1 & n) == 0 && index < 32) {
            n = n >> 1;
            index++;
        }
        return index;
    }
    //判断这个数的二进制形式从左到右index位是否为"1"
    public boolean isBit1(int num, int index) {
        boolean check = false;
        num = num >> index;
        if ((num & 1) == 1)
            check = true;
        return check;
 
    }
    
    public int minNumberInRotateArray(int [] array) {
        if(array.length==0){
        		return 0;
        	}
        	int start = 0, end = array.length-1, mid = 0;
        	while(start < end){
        		mid = (start + end)/2;
            	if(array[mid] >= array[start]){
            		start = mid;
            	}
            	else if (array[mid] <= array[end]){
            		end = mid;
            	}
                if(end-start == 1){
                    break;
                }
        	}
        	
        	return array[end];
        }
    public boolean match(char[] str, char[] pattern)
    {
      return false;  
    }
	public static void main(String[] args) {
		Solution s = new Solution();
		int []arr = {3,4,5,6,7,8,9,10,11,2};
		System.out.println(s.minNumberInRotateArray(arr));
	}
}