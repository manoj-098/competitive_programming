//Find whether the given number is a perfect square or not

//Method 1
static void checkperfectsquare(int n)
{
	
	if (Math.ceil((double)Math.sqrt(n)) == Math.floor((double)Math.sqrt(n)))
		System.out.print("True");
	else
		System.out.print("False");
}

//Method 2
static boolean isPerfectSquare(int x)
	{
		if (x >= 0) {
			int sr = (int)Math.sqrt(x);
			return ((sr * sr) == x);
		}
		return false;
	}
