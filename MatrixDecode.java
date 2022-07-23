package matrix;
import java.util.Scanner;

public class MatrixDecode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String chars = ",.<>?;':{}[]()!@#$ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
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
		System.out.print("Enter The Message You Want To Decrypt: ");
		String encryptedMessage = sc.nextLine();
		i = 0;
		int x,y;
		
		System.out.print("The Decrypted String Is: ");
			for(int a = 0; a < (encryptedMessage.length()/2); ++a) {
			x = chars.indexOf(encryptedMessage.charAt(2*a));
                        y = chars.indexOf(encryptedMessage.charAt(2*a+1));
			System.out.print(characters[x][y]);
		}
		
	}
}