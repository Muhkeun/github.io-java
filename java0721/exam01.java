class Exam01{
	public static void main(String[] args){
		String star = "*";
		
		
		//예제1
		//1행: ***
		//2행: ***
		//3행: ***
		//4행: ***
		//5행: ***	을 출력하시오.
		System.out.println("<예제1>\n");
		for (int a = 1; a < 6 ; a = a+1){
			System.out.println(a+"행: " + star+ star+ star);
		}
		
		//예제2
		//*
		//**
		//***
		//****
		//***** 을 출력하시오.
		System.out.println("\n<예제2>\n");
		for(int a = 0; a <5; a = a+1){
				for(int x =0; x < a+1; x = x+1){
					System.out.print(star);
			}
			System.out.println();
		}

		//예제3
		//*****
		//****
		//***
		//**
		//* 을 출력하시오.
		System.out.println("\n<예제3>\n");
		for (int a = 0; a < 5; a = a +1){
			for (int x = 0; x < 5 - a; x = x+1){
				System.out.print(star);
				}
			System.out.println();
		}

		//예제4
		//12345
		//23456
		//34567
		//45678
		//56789 를 출력하시오.
		System.out.println("\n<예제4>\n");
		for (int a =1; a <6; a = a+1){
			  for (int x = 0; x <5; x = x +1){
				System.out.print(a+x);
			  }
			  System.out.println();
			}
		
		//예제5
		//56789
		//45678
		//34567
		//23456
		//12345 를 출력하시오.
		System.out.println("\n<예제5>\n");
		for (int a = 0; a < 5; a = a+1){
			for (int x = 1; x< 6; x =x+1 ){
				int y = 4;
				y = y + x;
				System.out.print(y-a);
			}
			System.out.println();
		}
		
		//예제6
		//*
		//**
		//***
		//****
		//*****
		//****
		//***
		//**
		//* 을 출력하시오.
		System.out.println("\n<예제6>\n");
		int r =1;
		boolean status = true;
		
		for(int a = 0 ; a < 9 ; a++){
			for(int b = 0 ; b < r ; b++){
				System.out.print(star);
			}
			if(status){
				r++;
			}else{
				r--;
			}
			if(r == 5){
				status = false;
			}
			System.out.println();
		}
		//예제7
		//    *
		//   **
		//  ***
		// ****
		//***** 를 출력하시오.
		System.out.println("\n<예제7>\n");
		for (int a = 0; a < 5; a = a + 1){
			for(int x = 0; x < 4-a; x = x + 1){
				System.out.print(" ");
			}
			for (int y = 0; y < 1+a; y = y + 1){
				System.out.print(star);
			}
			System.out.println();
		}
		
		//예제8
		//*****
		// ****
		//  ***
		//   **
		//    * 을 출력하시오.
		System.out.println("\n<예제8>\n");
		for(int a = 0 ; a < 5 ; a++){
			for(int x = 0 ; x < 0+a; x++){
				System.out.print(" ");
			}
			for(int y = 0 ; y < 5-a ; y++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		//예제9
		//     *
		//    **
		//   ***
		//  ****
		// *****
		//  ****
		//   ***
		//    **
		//     * 을 출력하시오. 
		System.out.println("\n<예제9>\n");
		int r2=1;
		int space2=4;
		boolean status2 = true;
		for(int a = 0 ; a < 9 ; a++){
			for(int b = 0 ; b < space2 ; b++){
				System.out.print(" ");
			}
			for(int b = 0 ; b < r2 ; b++){
				System.out.print(star);
			}
			if(status2){
				space2--;
				r2++;
			}else{
				space2++;
				r2--;
			}
			if(r2 == 5){
				status2 = false;
			}
			System.out.println();
		}

		//예제10
		//    *    
		//   ***
		//  *****
		// *******
		//********* 를 출력하시오.
		System.out.println("\n<예제10>\n");
		int r3=1;
		int space3=4;
		for(int a = 0 ; a < 5 ; a++){
			for(int b = 0 ; b < space3 ; b++){
				System.out.print(" ");
			}
			for(int b = 0 ; b < r3 ; b++){
				System.out.print(star);
			}
			space3--;
			r3+=2;
			System.out.println();
		}
		
		//예제 11
		//*********
		// *******
		//  *****
		//   ***
		//    * 를 출력하시오.
		System.out.println("\n<예제11>\n");
		int r4=9;
		int space4=0;
		for(int a = 0 ; a < 5 ; a++){
			for(int b = 0 ; b < space4 ; b++){
				System.out.print(" ");
			}
			for(int b = 0 ; b < r4 ; b++){
				System.out.print(star);
			}
			space4++;
			r4-=2;
			System.out.println();
		}
		
		//예제12
		//*****
		//****
		//***
		//**
		//*
		//**
		//***
		//****
		//***** 을 출력하시오.
		System.out.println("\n<예제12>\n");
		
		int r5 =5;
		boolean status5 = true;

		for (int a = 0; a<9; a++){
			for(int b =0; b < r5 ; b++){
				System.out.print(star);
			}
			if(status5){
				r5--;
			}else{
				r5++;
			}
			if(r5 ==1){
				status5 = false;
			}
			System.out.println();
		}
		
		//예제13
		//*****
		// ****
		//  ***
		//   **
		//    *
		//   **
		//  ***
		// ****
		//***** 을 출력하시오.
		System.out.println("\n<예제13>\n");

		int r6 = 5;
		int space6 = 2;
		boolean status6 = true;

		for (int a =0; a < 9; a++){
			for (int b = 0; b < space6-1; b++){
				System.out.print(" ");
			}
			for (int b = 0; b < r6; b++){
				System.out.print(star);
			}
			if(status6){
				r6--;
				space6++;
			}else{
				r6++;
				space6--;
			}
			if (r6 ==1){
				status6 = false;
			}
			System.out.println();
		}
		
		//예제14
		//    *
		//   ***
		//  *****
		// *******
		//*********
		// *******
		//  *****
		//   ***
		//    *  을 출력하시오.
		System.out.println("\n<예제14>\n");

		int r7 = 1;
		int space7 = 4;
		boolean status7 = true;

		for (int a = 0; a < 9;  a++){
			for (int b = 0; b < space7; b++){
				System.out.print(" ");
			}
			for (int b = 0; b < r7; b++ ){
				System.out.print(star);
			}
			if(status7){
				r7 += 2;
				space7--;
			}else{
				r7 -= 2;
				space7++;
			}
			if(r7 == 9){
				status7= false;
			}
			System.out.println();
		}
		
		//예제15
		//**** ****
		//***   ***
		//**     **
		//*       *
		//
		//*       *
		//**     **
		//***   ***
		//**** **** 을 출력하시오.
		System.out.println("\n<예제15>\n");
		int r8 = 4;
		int space8 = 1;
		boolean status8 = true;

		for (int a = 0; a <9; a++){
		
			for (int b = 0; b < r8; b++){
				System.out.print(star);
			}
			for (int b = 0; b < space8; b++){
				System.out.print(" ");
			}
			for (int b = 0; b < r8; b++){
				System.out.print(star);
			}
			if(status8){
				r8--;
				space8 += 2;
			}else{
				r8++;
				space8 -= 2;
			}
			if(r8==0){
				status8 = false;
			}
			System.out.println();
		}
		
		//예제16
		//*       *
		//**     **
		//***   ***
		//**** ****
		//*********
		//**** ****
		//***   ***
		//**     **
		//*       * 을 출력하시오.
		System.out.println("\n<예제16>\n");
		
		int r10 = 1;
		int space10 = 7;
		boolean status10 = true;

		for (int a = 0; a < 9; a++){
			for (int b = 0; b < r10; b++){
				System.out.print(star);
			}
			for (int b = 0; b < space10; b++){
				System.out.print(" ");
			}
			for (int b = 0; b < r10; b++){
				System.out.print(star);
			}
			if(status10){
				r10++;
				space10 -= 2;
			}else{
				r10--;
				space10 += 2;
			}
			if(r10==5){
				
				System.out.print("\n*********");
				status10 = false;
				r10--;
				space10 += 2;
			}
			System.out.println();
		}
		
		//예제17
		//*********
		// *******
		//  *****
		//   ***
		//    *
		//    *
		//   ***
		//  *****
		// *******
		//*********
		System.out.println("\n<예제17>\n");

		int r11 = 9;
		int space11 = 0;
		boolean status11 = true;
		for (int a = 0; a < 10; a++){
			if(a == 5){
				r11 = 1;
				space11=4;
				status11 = false;
			}	
			for (int b = 0; b < space11; b++){
				System.out.print(" ");
			}
			for (int b = 0; b < r11; b++){
				System.out.print(star);
			}
			for (int b = 0; b < space11; b++){
				System.out.print(" ");
			}
			if(status11){
				r11 -= 2;
				space11++;
			}else{
				r11 += 2;
				space11--;
			}	
			System.out.println();
		}
	}
}
