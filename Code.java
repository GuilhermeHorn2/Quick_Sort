package misc;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;



public class main_misc2 {
	
   
	
	
	public static void main(String[] args) {
	//(a+b)%k = ((a % k)+(b % k)) % k    || ||
	
		int[] v = {12,1,98,777,3,28};
		quick_sort(v,0,v.length-1);
		for(int i = 0;i < v.length;i++) {
			System.out.print(v[i] + " ");
		}
		
	}	
	
	Random r = new Random();
	int x = r.nextInt(4);
	
	private static void swap(int[]v,int i,int j){
		
		int d = v[i];
		v[i] = v[j];
		v[j] = d;
		
	}
	
	
	private static void quick_sort(int[] v,int strt,int end){
		
		int partition_point = partition(v,strt,end);
		if(strt < partition_point -1) {
			quick_sort(v,strt,partition_point-1);
		}
		if(partition_point < end) {
			quick_sort(v,partition_point,end);
		}
		
	}
	
	private static int partition(int[] v,int left,int right){
		
		
		int pivot = v[(left+right)/2];
		
		while(left <= right){
			
			while(v[left] < pivot) {
				left++;
			}
			while(v[right] > pivot) {
				right--;
			}
			if(left <= right) {
				swap(v,left,right);
				left++;
				right--;
			}
		}
		return left;
	}
	
	
	} 
	
