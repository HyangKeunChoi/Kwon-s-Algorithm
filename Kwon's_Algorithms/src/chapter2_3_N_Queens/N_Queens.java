package chapter2_3_N_Queens;

public class N_Queens {
	
	int N;
	
	int[] cols = new int[N+1];
	
	boolean queens(int level) {
		if(!promising(level))
			return false;
		else if(level==N) {
			for(int i=1; i<=N; i++)
				System.out.println(i +" , " + cols[i] + " ");
			return true;
		}
		for(int i=1; i<=N; i++) {
			cols[level+1] = i;
			if(queens(level+1))
				return true;
		}
		
		
		return false;
	}
	
	
	boolean promising(int level) {
		for(int i=1; i<level; i++) {
			if(cols[i]==cols[level])
				return false;
			else if(level-i==Math.abs(cols[level]-cols[i]))
				return false;
		}
		return true;
	}
	
	
}	
