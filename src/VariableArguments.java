
public class VariableArguments {

	public static void getData(int ...data)
	{
		for(int a:data)
		{
			System.out.println(a);
		}
		
	}
	public static void main(String[] args) 
	{
		int [] data={1,2,3};
		getData(data);
	}

}
