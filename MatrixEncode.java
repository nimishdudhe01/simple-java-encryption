import java.util.Scanner;

public class MatrixEncode{
	public static void main(String[] args) {
		String chars =",.<>?;':{}[]()!@#$ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		int i = 0,l,m = 0,j=0;
		while(i*i<chars.length()) {
			++i;
		}

		char characters[][] = new char[i][i];

		for(l = 0; l < i;++l) {
			for(m = 0; m < i;++m) {
				characters[l][m]= chars.charAt(j);
				++j;
			}
		}
		System.out.println();
		System.out.print("Enter The String You Want To Encrypt: ");
		Scanner scan = new Scanner(System.in);
		String message = scan.nextLine();
		System.out.print("The Encrypted Message Is: ");
		for(j = 0; j < message.length(); ++j) {

			for(l = 0; l < i;++l) {
				for(m = 0; m < i;++m) {
					if(characters[l][m] == message.charAt(j)) {
						System.out.print(chars.charAt(l));
						System.out.print(chars.charAt(m));
						break;
					}
				}
			}
		}
		System.out.println();
	}
}
