package com.kjain.recollect;

class Recursion {

	 int fact(int a)
	{
		if(a==1)
			return 1;
		else
			return a* fact(a-1);
	}

}
