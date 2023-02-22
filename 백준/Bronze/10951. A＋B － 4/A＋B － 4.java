import java.util.*;

public class Main {

	 public static void main(String[] args) {

	 	Scanner in = new Scanner(System.in);

	 	int a;
		int b;
		
        // EOF 사용. 입력에서 더 이상 읽을 수 없는 데이터가 존재할 때 반복문 종료하는 것 (end of file; ,파일의 끝)
        // hasNextInt를 사용해 정수가 아닌 다른 데이터가 들어오면 예외를 던지며 입력 받지 않고 종료. 
        // 입력이 더 이상 주어지지 않을 때 어떻게 처리해야 하는가를 알 수 있다.
		while(in.hasNextInt()) {
			a = in.nextInt();
			b = in.nextInt();
			
			System.out.println(a + b);
		}
			
		
	 }
}