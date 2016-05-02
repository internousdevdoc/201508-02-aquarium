
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KisoKadai1 {

	public static void main(String[] args) throws IOException{

		boolean kuku =true;
while(kuku==true){

	 System.out.println("この九九表は自由に縦横の計算範囲を変更できます。");
     System.out.println("縦軸(X)の数字を入力してください:");


     BufferedReader d =new BufferedReader(new InputStreamReader(System.in));

  int x = Integer.parseInt(d.readLine());
  System.out.println("横軸(Y)を入力してください： ");
  int y = Integer.parseInt(d.readLine());


		System.out.println("九九の表");
		System.out.print("  ");
		for( int i=1; i<=x; i++ ) {
			System.out.print("  ");
			System.out.print(i);

		}

		System.out.println();
		System.out.println("------------------------------");



        for( int i=1; i<=y; i++ ) {
        	System.out.print(i+"|");
       for( int j=1; j<=x; j++ ) {
    	   System.out.print((i*j)>=10 ? " "+(i*j) : "  "+(i*j));
        }
       System.out.println();
        }

       
}


	}

}
