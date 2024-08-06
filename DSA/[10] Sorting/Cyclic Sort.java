int i = 0;
while (i < arr.length) 
{
	int correctIndex = arr[i] - 1;
	if (arr[i] != arr[correctIndex]) 
	{
		// Swap arr[i] with arr[correctIndex]
		int temp = arr[i];
		arr[i] = arr[correctIndex];
		arr[correctIndex] = temp;
	} 
	else i++;
}
