import java.util.*;
class user_excep extends Exception{
	public user_excep(String str){
		super(str);
	}
}
class pass_excep extends Exception{
	public pass_excep(String str){
		super(str);
	}
}
public class UNPW {
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		String user, pass;
		System.out.print("Enter the Username: ");
		user = sc.next();
		System.out.print("Enter the Password: ");
		pass = sc.next();
		int ulen = user.length();
		try{
			if(ulen < 8){
				throw new user_excep("Username Should be more than 8  characters ");
			}
			else if(!pass.equals("user")){
				throw new pass_excep("Incorrect Password");
			}
			else{
				System.out.println(" SUCCESSFULLY LOGGED IN ");
			
}
		}
		catch (user_excep u){
			u.printStackTrace();
		}
		catch (pass_excep p){
			p.printStackTrace();
		}
		
	}
}
		
