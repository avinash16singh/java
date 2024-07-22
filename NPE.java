    /* NullpointerException */
class NPE 
{
	public static void main(String[] args){
		String str =null;
		try{
		System.out.println(str.toUpperCase());


		}
		catch(NullPointerException n){
	System.out.println("null cant be casted");
		}
	}
}