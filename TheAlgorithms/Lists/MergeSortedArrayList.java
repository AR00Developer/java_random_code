package datastructures.Lists; 

import java.util.ArrayList; 
import java.util.List; 

public class MergeSortedArrayList
{
	public static void main(String[] args)
	{
		List<Integer> listA = new ArrayList<>(); 
		List<Integer> listB = new ArrayList<>(); 
		List<Integer> listC = new ArrayList<>(); 
 	

	 	for(int i = 1; i <= 10; i += 2)
	 	{
	 		listA.add(i);
	 		listB.add(i + 1);
 		}

 		merge(listA, listB, listC); 

 		System.out.println("listA: " + listA);
 		System.out.println("listB: " + listB);
 		System.out.println("listC: " + listC);
 	}

 	public static void merge(List<Integer> listA, List<Integer> listB, List<Integer> listC)
 	{
 		int indexA = 0; 
 		int indexB = 0; 

 		while( indexA < listA.size() && indexB < listB.size())
 		{
 			if(listA.get(indexA) <= listB.get(indexB))
 			{
 				listC.add(listA.get(indexA));
 			}
 			else 
 			{
 				listC.add(listB.get(indexB++));
 			}

 		}	
		while(indexA < listA.size())
		{
			listC.add(listA.get(indexA++));
		}

		while(indexB < listB.size())
		{
			listC.add(listB.get(pb++));
		}
 	}
	 /* Author @TheAlgorithms - https://github.com/TheAlgorithms */   
}