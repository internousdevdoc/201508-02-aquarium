import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 */

/**
 * @author miyagami
 *
 */
public class KisoKadai1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		try {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(" 九九の表");
		int num1 =0;
		int num2 =0;

while(true){
		System.out.println("xの値");
		String str = br.readLine();
		num1 = Integer.parseInt(str); // (str) からInt型に変換
		try {if (num1>=1 && num1<=10) {
			break;
			}else{
			System.out.println("有効な数字を入れてください");
		}

		} catch (NumberFormatException e) {
			System.out.println("数字入力:"+e);
		}
			// TODO: handle exception
		}



while(true){
		System.out.println("yの値");
		String str1 = br.readLine();
		num2 = Integer.parseInt(str1);
		try {if (num2>=1 && num2<=10) {
			break;
			}else{
			System.out.println("有効な数字を入れてください");
		}

		} catch (NumberFormatException e) {
			System.out.println("数字入力:"+e);
		}
			// TODO: handle exception
		}



		System.out.println(" 九九の表");
		System.out.println("----------------------------");
		for (int i = 1; i <= num1; i++) {
			for (int j = 1; j <= num2; j++) {
				System.out.print((i*j)  >= 10 ? " " + (i*j) : "  " + (i*j));
			}System.out.println();
		}
			}catch (IOException e){System.out.println(e);
			}catch(NumberFormatException e){
				System.out.println("数字を入力してください\n");
					}main(args);

				// 九九の答えが2桁ならば半角スペース1個、1桁ならば半角スペース2個
				// System.out.print(条件式 ? true : false); の形になっている
			}

		}



