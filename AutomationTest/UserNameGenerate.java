/**
 * @author: Della Li  Email: lyfyxy66@gmail.com
 * @date: April 30, 2021
 * @methodsName: UserNameGenerate
 * @description: generate a random user name
 * @param: 
 * @return: return a random user name 
 * @throws: 
 **/

package basicweb;

public class UserNameGenerate {

	public static String getUserName() {
		String userFirstName = getRandomString(8);
		//System.out.println("userFirstName is :" + userFirstName);
		String userLastName = getRandomString(8);
		//System.out.println("userLastName is :" + userLastName);
		String userMiddleName = getRandomString(8);
		//System.out.println("userMiddleName is :" + userMiddleName);

		String astUserName = userFirstName + " " + userMiddleName + " " + userLastName;
		//System.out.println("astUserName is :" + astUserName);
		return astUserName;
	}

	public static String getRandomString(int length) {
		StringBuilder sb = new StringBuilder();

		String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()+_|{}:?><~";
		for (int i = 0; i < length; i++) {
			int index = (int)(Math.random() * characters.length());
			sb.append(characters.charAt(index));
		}
		return sb.toString();
	}
	
	/*
	public static void main(String[] args) {
		String userName = UserNameGenerate.getUserName();
		System.out.println("Generated User Name is : " + userName);
	}
	*/	

}
