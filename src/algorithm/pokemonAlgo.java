package algorithm;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class pokemonAlgo {
	public static void main(String args[] ) throws Exception
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] a = new int [n];
        HashSet<Integer> hs = new HashSet<Integer>();
        int lastnondup = 0;
        for(int i=0;i<n;i++)
        {
        	a[i] = s.nextInt();
        	if(hs.add(a[i]))
        	{
        		lastnondup = i;
        	}
        }
        long count =1 +(n - lastnondup - 1);
        int subStart = 0;
        int subEnd = lastnondup;
        while(subStart < n && subEnd < n)
        {
        	int temp = a[subStart];
        	int i = subStart + 1;
        	for(;i < n;i++)
        	{
        		if(a[i] == temp)
        		{
        			break;
        		}
        	}	
        	if(i >= n)
        	break;
        	if(i > subEnd)
        	{
        		subEnd = i;
        	}
        	subStart++;
        	count  = count + 1 + (n - subEnd - 1);
        		
        	
        }
        System.out.println(count);
	
        
    }
}

