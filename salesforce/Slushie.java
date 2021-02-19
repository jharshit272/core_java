package salesforce;

import java.util.Arrays;

public class Slushie {
	
	
	public static void main(String[] args) {
		int a[] = new int[] {0,1,0,3,12};
		moveZeroes(a);
		System.out.println(Arrays.toString(a));
	}

	
	public static void moveZeroes(int[] nums) {
        for(int i=0,j=nums.length-1;i<nums.length&&i<j;i++){
            
            while(nums[j]==0){
                j--;
            }
            
            if(nums[i]==0){
                nums[i]=nums[i]^nums[j];
                nums[j]=nums[i]^nums[j];
                nums[i]=nums[i]^nums[j];
                j--;
            }
            
        }
    }
}
