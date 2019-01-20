package com.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int[] arr = new int[]{2,7,11,15};
		int target = 9;
		int[] output = twoSum(arr,target);
		System.out.println( output[0]+" "+output[1]);
	}
	
	public static int[] twoSum(int[] arr, int target) {
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for( int i = 0;i < arr.length; i++ )
		{
			if( map.containsKey( target-arr[i]) )
			{
				return new int[]{i, map.get(target-arr[i]) };
			}
			map.put(arr[i], i);
		}
		
		return new int[]{};
		
	}

}
