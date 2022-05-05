
public class java_21 {

	public static void main(String[] args) {
		int Age = 25; //Age라는 이름의 변수를 선언 및 초기화
		System.out.println(Age); //Age의 값을 출력
		
		Age = Age + 2000; //Age에 2000을 더하여 다시 Age에 저장
		System.out.println(Age);//2025가 저장된 Age 출력
		
		//두 변수의 값을 바꾸기
		int x = 10, y = 20; //x,y값 선언 및 초기화
		int z; //x의 값을 임시 저장할 변수 선언
		System.out.println(x+","+y);
		z=x; //x의 값을 z에 임시 저장
		x=y; //y의 값을 x에 저장
		y=z; //임시 저장했던 x의 값을 y에 저장
		System.out.println(x+","+y);
	}

}