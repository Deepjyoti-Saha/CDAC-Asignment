import java.io.*;

class SpecialString2 {
static boolean isLower(char c)
{

	return c >= 'a' && c <= 'z';
}

static boolean isUpper(char c)
{

	return c >= 'A' && c <= 'Z';
}


static boolean detectUppercaseUseUtil(String S)
{

	int N = S.length();

	int i;


	if (isLower(S.charAt(0))) {
	i = 1;
	while (i<N && isLower(S.charAt(i)))
		++i;
	return i == N ? true : false;
	}

	
	else {
	i = 1;

	
	while (i<N && isUpper(S.charAt(i)))
		++i;

	
	if (i == N)
		return true;
	else if (i > 1)
		return false;

	
	while (i<N && isLower(S.charAt(i)))
		++i;
	return i == N ? true : false;
	}
}


static void detectUppercaseUse(String S)
{
	
	
	boolean check = detectUppercaseUseUtil(S);

	
	if (check)
	System.out.println("Yes");

	
	else
	System.out.println("No");
}

public static void main (String[] args)
{

	String S = "Apple";



	detectUppercaseUse(S);
}
}


