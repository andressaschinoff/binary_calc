import java.io.BufferedReader;
import java.io.InputStreamReader;

//========================================
//========================================
//Student: Andressa Martins Schinoff Alves
//Student number: 2017280
//Group A
//========================================
//========================================
	
public class BinaryCalc {
	
	//Global Variable
	String VARIABLE_1_global = "";
	String VARIABLE_2_global = "";
	String Keep2_global = "";
	String KeepLn = "";
	String keepNeg = "";
	String decNum = "";
	int neg = 0;
	int sum_global = 0;
	int col = 0;
	

	public BinaryCalc() {
		
		//Calling Methods
		welcome();
		menuSelect();
	}
	
	
	//--------------------------
	//--------- WELCOME --------
	//--------------------------
	public void welcome() {
		System.out.println("Welcome to binary calculator");
		menu();
	}
		

	//----------------------------
	//--------- MENU -------------
	//----------------------------

	public void menu() {
		
		System.out.println("A) Binary to decimal");
		System.out.println("B) Decimal to binary");
		System.out.println("C) Addition");
		System.out.println("D) Subtraction");
		System.out.println("E) Multiplication");
		System.out.println("F) Division");
		System.out.println("G) Quit");

		menuSelect();
		
	}
	

	//------------------------------
	//------- MENU SELECT ----------
	//------------------------------
	
	public void menuSelect() {
		//User input selection
		String input = "";
		try {
		
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    input = br.readLine();
		    
		}catch(Exception e) {System.out.println("Error reading option");}
		
		//options for which input
		if(input.equals("a")) {
		  	BinToDec();
		}
		else if(input.equals("b")) {
			DecToBin();
		}
		else if(input.equals("c")) {
			Add();
		}
		else if(input.equals("d")) {
			Sub();
		}
		else if(input.equals("e")) {
			Mul();
		}
		else if(input.equals("f")) {
			Div();
		}
		else if(input.equals("g")) {
			Quit();
		}
		else if (input.equals("h")) {
			//test
			twoScomp();
		}
		else {
			
			System.out.println("Error reading option, try again");
			menu();
		}
	
	}
	
	//-----------------------------------
	//-----------------------------------
	//------ BIN TO DEC CONVERTER -------
	//-----------------------------------
	//-----------------------------------
	
	public void BinToDec() {
		
		
		System.out.println("Please enter a binary number in 16 bits");
		//reading the user input
		String input = "";
		try {
		
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    input = br.readLine();
		    
		}catch(Exception e) {System.out.print("Error");}
		
		
		
		//int sum = 0;
		//put the input to char
		char pos15 = input.charAt(15);
		//condition to modify the position
		if(pos15 == '1') {
			sum_global = sum_global + 1;	
		}
		
		char pos14 = input.charAt(14);
		if(pos14 == '1') {
			sum_global = sum_global + 2;	
		}
		
		char pos13 = input.charAt(13);
		if(pos13 == '1') {
			sum_global = sum_global + 4;	
		}
		
		char pos12 = input.charAt(12);
		if(pos12 == '1') {
			sum_global = sum_global + 8;	
		}
		
		char pos11 = input.charAt(11);
		if(pos11 == '1') {
			sum_global = sum_global + 16;	
		}
		
		char pos10 = input.charAt(10);
		if(pos10 == '1') {
			sum_global = sum_global + 32;	
		}
		
		char pos9 = input.charAt(9);
		if(pos9 == '1') {
			sum_global = sum_global + 64;	
		}
		
		char pos8 = input.charAt(8);
		if(pos8 == '1') {
			sum_global = sum_global + 128;	
		}
		
		char pos7 = input.charAt(7);
		if(pos7 == '1') {
			sum_global = sum_global + 256;	
		}
		char pos6 = input.charAt(6);
		if(pos6 == '1') {
			sum_global = sum_global + 512;	
		}
		char pos5 = input.charAt(5);
		if(pos5 == '1') {
			sum_global = sum_global + 1024;	
		}
		
		char pos4 = input.charAt(4);
		if(pos4 == '1') {
			sum_global = sum_global + 2048;	
		}
		char pos3 = input.charAt(3);
		if(pos3 == '1') {
			sum_global = sum_global + 4096;	
		}
		char pos2 = input.charAt(2);
		if(pos2 == '1') {
			sum_global = sum_global + 8192;	
		}
		char pos1 = input.charAt(1);
		if(pos1 == '1') {
			sum_global = sum_global + 16384;	
		}
		char pos0 = input.charAt(0);
		if(pos0 == '1') {
			sum_global = sum_global + 32768;	
		}
		
		//print the answer
		System.out.println("Decimal value is: " + sum_global);
		
		//Keep1_global = input;
		saveVariable();
		menu();
	}
	
	//----------------------------------
	//----------------------------------
	//------ DEC TO BIN CONVERTER ------
	//----------------------------------
	//----------------------------------
	
	public void DecToBin() {
		
		
		System.out.println("Please enter a decimal number");
		//reading input
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    decNum = br.readLine();
		    
		}catch(Exception e) {System.out.println("Error reading option");}
		
		//=================================================================
		//I was trying first to split where has the dote to convert doubles
		//=================================================================
		//Double num = Double.parseDouble(decNum);
		// return array of String which contains two elements numbers[0] and numbers[1]
		//String numbers[] = decNum.split(".");
		
		//Here I was trying make a condition to call the two's complement method
		//if(num<=-1){
			
		//	twoScomp();

	   // }
	    
	    //int[] numInt = new int[1];
	    
	    //numInt[0] = Integer.parseInt(numbers[0]);
	    
	    //I use a global variable to try use in the two's complement method 
		//int dec = 0;
		int dec = Integer.parseInt(decNum);
	    
	    //dec = numInt[0]; 
	    
	   		//2D array
		int[][] a = new int[1][16];
		
		//condition to fill the position with a 1
		if (dec >= 32768) {
			a[0][0] = a[0][0] + 1;
			dec = dec - 32768;
		}
		if (dec >= 16384) {
			a[0][1] = a[0][1] + 1;
			dec = dec - 16384;
		}
		if (dec >= 8192) {
			a[0][2] = a[0][2] + 1;
			dec = dec - 8192;
		}
		if (dec >= 4096) {
			a[0][3] = a[0][3] + 1;
			dec = dec - 4096;
		}
		if (dec >= 2048) {
			a[0][4] = a[0][4] + 1;
			dec = dec - 2048;
		}
		if (dec >= 1024) {
			a[0][5] = a[0][5] + 1;
			dec = dec - 1024;
		}
		if (dec >= 512) {
			a[0][6] = a[0][6] + 1;
			dec = dec - 512;
		}
		if (dec >= 256) {
			a[0][7] = a[0][7] + 1;
			dec = dec - 256;
		}
		if (dec >= 128) {
			a[0][8] = a[0][8] + 1;
			dec = dec - 128;
		}
		if (dec >= 64) {
			a[0][9] = a[0][9] + 1;
			dec = dec - 64;
		}
		if (dec >= 32) {
			a[0][10] = a[0][10] + 1;
			dec = dec - 32;
		}
		if (dec >= 16) {
			a[0][11] = a[0][11] + 1;
			dec = dec - 16;
		}
		if (dec >= 8) {
			a[0][12] = a[0][12] + 1;
			dec = dec - 8;
		}
		if (dec >= 4) {
			a[0][13] = a[0][13] + 1;
			dec = dec - 4;
		}
		if (dec >= 2) {
			a[0][14] = a[0][14] + 1;
			dec = dec - 2;
		}
		if (dec >= 1) {
			a[0][15] = a[0][15] + 1;
			dec = dec - 1;
		}
		
		System.out.println("It's the binary number: ");
		//print the binary number
		for(col=0; col < 16; col++){
			//trying save the binary number as a variable
			this.Keep2_global = String.valueOf(a[0][col]);
			System.out.print(a[0][col]);
			//try to save the binary number to use in the two's complement method 
			/*if (neg < 0) {
				keepNeg = String.valueOf(a[0][col]);
				System.out.print(keepNeg);
			}*/
			}
		
		
		System.out.println(" ");

		saveVariable();
		menu();
		
	}
	
	//============================
	//========= ADDITION =========
	//============================
	
	public void Add() {
		
		
		
		char[] carryLine = new char[16];
		
			
		
		// Fill up the carry line with 0
		for(int i=0; i < carryLine.length; i++) {
			carryLine[i] = '0';
		}
		
		
		// this is where the answer goes
		char[] finalOutput = new char[16];
		
		System.out.println("Please enter a binary 16 bits");
		//reading the first user input
		String input = "";
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    input = br.readLine();
		    
		}catch(Exception e) {System.out.println("Error reading option");}
		
		System.out.println("Please enter a binary 16 bits again");
		
		//reading the second one
		String input2 = "";
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    input2 = br.readLine();
		    
		}catch(Exception e) {System.out.println("Error reading option");}
		

		//putting the first input to char
		char[] line1arr = input.toCharArray();
		 
		//putting the second input to char
		char[] line2arr = input2.toCharArray();
		
		
		for(int i=15; i >= 0; i--) {
			
			//condition to add both inputs
			if(line1arr[i] == '0' && line2arr[i] == '0'  && carryLine[i] == '0') {
				finalOutput[i] = '0';
			}
			else if(line1arr[i] == '0' && line2arr[i] == '0'  && carryLine[i] == '1') {
				finalOutput[i] = '1';	
			}
			else if(line1arr[i] == '0' && line2arr[i] == '1'  && carryLine[i] == '0') {
				finalOutput[i] = '1';
			}
			else if(line1arr[i] == '0' && line2arr[i] == '1'  && carryLine[i] == '1') {
				finalOutput[i] = '0';
				// Carry the 1
				carryLine[i-1] = '1';
			}
			else if(line1arr[i] == '1' && line2arr[i] == '0'  && carryLine[i] == '0'){
				finalOutput[i] = '1';
			}
			else if(line1arr[i] == '1' && line2arr[i] == '0'  && carryLine[i] == '1') {
				finalOutput[i] = '0';
				// Carry the 1
				carryLine[i-1] = '1';
			}
			else if(line1arr[i] == '1' && line2arr[i] == '1' && carryLine[i] == '0') {
				finalOutput[i] = '0';
				// Carry the 1
				carryLine[i-1] = '1';
			}
			else if(line1arr[i] == '1' && line2arr[i] == '1' && carryLine[i] == '1') {
				finalOutput[i] = '1';
				// Carry the 1
				carryLine[i-1] = '1';
			}
				
		}
		
		
		//print the answer
		for(int i=0; i < finalOutput.length; i++) {
			System.out.print(finalOutput[i]);
		}
		
		menu();
	}
	
	
	//==============================
	//======= SUBTRACTION ==========
	//==============================
	
	public void Sub() {
		
		
		
		char[] carryLine = new char[16];
		
			
		
		// Fill up the carry line with 0
		for(int i=0; i < carryLine.length; i++) {
			carryLine[i] = '0';
		}
		
		
		// this is where the answer goes
		char[] finalOutput = new char[17];
		
		//ask the user the first binary number
		System.out.println("Please enter a binary 16 bits");
		String input = "";
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    input = br.readLine();
		    
		}catch(Exception e) {System.out.println("Error reading option");}
		
		//ask the use the second binary number
		System.out.println("Please enter a binary 16 bits again");
		
		String input2 = "";
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    input2 = br.readLine();
		    
		}catch(Exception e) {System.out.println("Error reading option");}
		

		//put the first input in array
		char[] line1arr = input.toCharArray();
		 
		//put the second input in array
		char[] line2arr = input2.toCharArray();
		
		
		//for loop to do the subtraction
		for(int i=15; i >= 0; i--) {
			
			//checked
			//if both first line and second line is 0
			// the answer is 0
			if(line1arr[i] == '0' && line2arr[i] == '0') {
				finalOutput[i] = '0';
			}
			
			//if the first line is 0 and second line is 1
			//first line needs borrow 1
			//if the next number is 1 it becomes 0 and the answer is 1 as well
			//if the next number is 0, it needs borrow as well, so the next, next number becomes 0
			//and the next becomes 1, also the answer is 1
			//checked
			else if(line1arr[i] == '0' && line2arr[i] == '1') {
				if (line1arr[i-1] == '1') {
					line1arr[i-1] = '0';
				}else if (line1arr[i-1] == '0') {
					line1arr[i-1] = '1';
					line1arr[i-2] = '0';
					}
				finalOutput[i] = '1';
			}
			//if the first line is 1 and second is 0
			//the answer is 1
			else if(line1arr[i] == '1' && line2arr[i] == '0'){
				finalOutput[i] = '1';
			}
			//if the first line is 1 and second is 1
			//the answer is 0
			else if(line1arr[i] == '1' && line2arr[i] == '1') {
				finalOutput[i] = '0';
			}	
		}
		
		
		//print the answer
		for(int i=0; i < finalOutput.length; i++) {
			System.out.print(finalOutput[i]);
		}
		
		menu();
	}
	 //==============================
	//======= MULTIPLICATION =======
	//==============================


	public void Mul() {
		
		char[] carryLine = new char[16];
		
		// Fill up the carry line with 0
		for(int i=0; i < carryLine.length; i++) {
			carryLine[i] = '0';
		}
		char[] carryLine1 = new char[16];
		
		// Fill up the carry line with 0
		for(int i=0; i < carryLine1.length; i++) {
			carryLine1[i] = '0';
		}
		
		char[] carryLine2 = new char[16];
		
		// Fill up the carry line with 0
		for(int i=0; i < carryLine2.length; i++) {
			carryLine2[i] = '0';
		}
		
		char[] carryLine3 = new char[16];
		
		// Fill up the carry line with 0
		for(int i=0; i < carryLine3.length; i++) {
			carryLine3[i] = '0';
		}
		
		// this is where the final answer goes
		char[] finalOutput = new char[16];
		
		System.out.println("Please enter a binary 16 bits");
		
		//reading input
		String input = "";
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    input = br.readLine();
		    
		}catch(Exception e) {System.out.println("Error reading option");}
		
		System.out.println("Please enter a binary 16 bits again");
		
		//reading input
		String input2 = "";
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    input2 = br.readLine();
		    
		}catch(Exception e) {System.out.println("Error reading option");}
		
		
		//putting first input to char
		char[] line1Mul = input.toCharArray();
		//putting second input to char
		char[] line2Mul = input2.toCharArray();
		//line to add
		char[] line1add = new char [6];
		for(int i=0; i < line1add.length; i++) {
			line1add[i] = '0';
		}
		//line to add
		char[] line2add = new char [7];
		for(int i=0; i < line2add.length; i++) {
			line2add[i] = '0';
		}
		//line to add
		char[] line3add = new char [8];
		for(int i=0; i < line3add.length; i++) {
			line3add[i] = '0';
		}
		//line to add
		char[] line4add = new char [9];
		for(int i=0; i < line4add.length; i++) {
			line4add[i] = '0';
		}
		//line to add
		char[] line5add = new char [10];
		for(int i=0; i < line5add.length; i++) {
			line5add[i] = '0';
		}
		
		//temp answer
		char[] tempResult1 = new char [7];
		for(int i=0; i < tempResult1.length; i++) {
			tempResult1[i] = '0';
		}
		//temp answer
		char[] tempResult2 = new char [8];
		for(int i=0; i < tempResult2.length; i++) {
			tempResult2[i] = '0';
		}
		//temp answer
		char[] tempResult3 = new char [9];
		for(int i=0; i < tempResult3.length; i++) {
			tempResult3[i] = '0';
		}
		
		
		//for loop to multiply first right number to the first input
		for(int i=15; i>=0; i--) {
			if(line1Mul[i] == '0' && line2Mul[0] == '0') {
				line1add[i] = '0'; 
			}
			else if(line1Mul[i] == '0' && line2Mul[0] == '1') {
				line1add[i] = '0';
			}
			else if(line1Mul[i] == '1' && line2Mul[0] == '0') {
				line1add[i] = '0';
			}
			else if(line1Mul[i] == '1' && line2Mul[0] == '1') {
				line1add[i] = '1';
				}
			}
		//for loop to multiply second right number to the first input
		for(int i=15; i>=0; i--) {
			if(line1Mul[i] == '0' && line2Mul[1] == '0') {
				line2add[i] = '0'; 
			}
			else if(line1Mul[i] == '0' && line2Mul[1] == '1') {
				line2add[i] = '0';
			}
			else if(line1Mul[i] == '1' && line2Mul[1] == '0') {
				line2add[i] = '0';
			}
			else if(line1Mul[i] == '1' && line2Mul[1] == '1') {
				line2add[i] = '1';
				}
			}
		//for loop to multiply third right number to the first input
		for(int i=15; i>=0; i--) {
			if(line1Mul[i] == '0' && line2Mul[2] == '0') {
				line3add[i] = '0'; 
			}
			else if(line1Mul[i] == '0' && line2Mul[2] == '1') {
				line3add[i] = '0';
			}
			else if(line1Mul[i] == '1' && line2Mul[2] == '0') {
				line3add[i] = '0';
			}
			else if(line1Mul[i] == '1' && line2Mul[2] == '1') {
				line3add[i] = '1';
				}
			}
		//for loop to multiply forth number to the first input
		for(int i=15; i>=0; i--) {
			if(line1Mul[i] == '0' && line2Mul[3] == '0') {
				line4add[i] = '0'; 
			}
			else if(line1Mul[i] == '0' && line2Mul[3] == '1') {
				line4add[i] = '0';
			}
			else if(line1Mul[i] == '1' && line2Mul[3] == '0') {
				line4add[i] = '0';
			}
			else if(line1Mul[i] == '1' && line2Mul[3] == '1') {
				line4add[i] = '1';
				}
			}
		
		//for loop to multiply fifth number to the first input
		for(int i=15; i>=0; i--) {
			if(line1Mul[i] == '0' && line2Mul[4] == '0') {
				line5add[i] = '0'; 
			}
			else if(line1Mul[i] == '0' && line2Mul[4] == '1') {
				line5add[i] = '0';
			}
			else if(line1Mul[i] == '1' && line2Mul[4] == '0') {
				line5add[i] = '0';
			}
			else if(line1Mul[i] == '1' && line2Mul[4] == '1') {
				line5add[i] = '1';
				}
			}
		
		//loop to add the first to add lines
		for(int i=15; i >= 0; i--) {
			
			
			if(line1add[i] == '0' && line2add[i] == '0'  && carryLine[i] == '0') {
				tempResult1[i] = '0';
			}
			else if(line1add[i] == '0' && line2add[i] == '0'  && carryLine[i] == '1') {
				tempResult1[i] = '1';	
			}
			else if(line1add[i] == '0' && line2add[i] == '1'  && carryLine[i] == '0') {
				tempResult1[i] = '1';
			}
			else if(line1add[i] == '0' && line2add[i] == '1'  && carryLine[i] == '1') {
				tempResult1[i] = '0';
				// Carry the 1
				carryLine[i-1] = '1';
			}
			else if(line1add[i] == '1' && line2add[i] == '0'  && carryLine[i] == '0'){
				tempResult1[i] = '1';
			}
			else if(line1add[i] == '1' && line2add[i] == '0'  && carryLine[i] == '1') {
				tempResult1[i] = '0';
				// Carry the 1
				carryLine[i-1] = '1';
			}
			else if(line1add[i] == '1' && line2add[i] == '1' && carryLine[i] == '0') {
				tempResult1[i] = '0';
				// Carry the 1
				carryLine[i-1] = '1';
			}
			else if(line1add[i] == '1' && line2add[i] == '1' && carryLine[i] == '1') {
				tempResult1[i] = '1';
				// Carry the 1
				carryLine[i-1] = '1';
			}
		}
		
		//loop to add temp answer if third add line
		for(int i=15; i >= 0; i--) {
			
			
			if(tempResult1[i] == '0' && line3add[i] == '0'  && carryLine1[i] == '0') {
				tempResult2[i] = '0';
			}
			else if(tempResult1[i] == '0' && line3add[i] == '0'  && carryLine1[i] == '1') {
				tempResult2[i] = '1';	
			}
			else if(tempResult1[i] == '0' && line3add[i] == '1'  && carryLine1[i] == '0') {
				tempResult2[i] = '1';
			}
			else if(tempResult1[i] == '0' && line3add[i] == '1'  && carryLine1[i] == '1') {
				tempResult2[i] = '0';
				// Carry the 1
				carryLine1[i-1] = '1';
			}
			else if(tempResult1[i] == '1' && line3add[i] == '0'  && carryLine1[i] == '0'){
				tempResult2[i] = '1';
			}
			else if(tempResult1[i] == '1' && line3add[i] == '0'  && carryLine1[i] == '1') {
				tempResult2[i] = '0';
				// Carry the 1
				carryLine1[i-1] = '1';
			}
			else if(tempResult1[i] == '1' && line3add[i] == '1' && carryLine1[i] == '0') {
				tempResult2[i] = '0';
				// Carry the 1
				carryLine1[i-1] = '1';
			}
			else if(tempResult1[i] == '1' && line3add[i] == '1' && carryLine1[i] == '1') {
				tempResult2[i] = '1';
				// Carry the 1
				carryLine1[i-1] = '1';
			}
		}
		
		//loop to add temp answer if forth add line
		for(int i=15; i >= 0; i--) {
			
			if(tempResult2[i] == '0' && line4add[i] == '0'  && carryLine2[i] == '0') {
				tempResult3[i] = '0';
			}
			else if(tempResult2[i] == '0' && line4add[i] == '0'  && carryLine2[i] == '1') {
				tempResult3[i] = '1';	
			}
			else if(tempResult2[i] == '0' && line4add[i] == '1'  && carryLine2[i] == '0') {
				tempResult3[i] = '1';
			}
			else if(tempResult2[i] == '0' && line4add[i] == '1'  && carryLine2[i] == '1') {
				tempResult3[i] = '0';
				// Carry the 1
				carryLine2[i-1] = '1';
			}
			else if(tempResult2[i] == '1' && line4add[i] == '0'  && carryLine2[i] == '0'){
				tempResult3[i] = '1';
			}
			else if(tempResult2[i] == '1' && line4add[i] == '0'  && carryLine2[i] == '1') {
				tempResult3[i] = '0';
				// Carry the 1
				carryLine2[i-1] = '1';
			}
			else if(tempResult2[i] == '1' && line4add[i] == '1' && carryLine2[i] == '0') {
				tempResult3[i] = '0';
				// Carry the 1
				carryLine2[i-1] = '1';
			}
			else if(tempResult2[i] == '1' && line4add[i] == '1' && carryLine2[i] == '1') {
				tempResult3[i] = '1';
				// Carry the 1
				carryLine2[i-1] = '1';
			}
		}
		
		//loop to add temp answer if fifth add line
		for(int i=15; i >= 0; i--) {
			
			
			if(tempResult3[i] == '0' && line5add[i] == '0'  && carryLine3[i] == '0') {
				finalOutput[i] = '0';
			}
			else if(tempResult3[i] == '0' && line5add[i] == '0'  && carryLine3[i] == '1') {
				finalOutput[i] = '1';	
			}
			else if(tempResult3[i] == '0' && line5add[i] == '1'  && carryLine3[i] == '0') {
				finalOutput[i] = '1';
			}
			else if(tempResult3[i] == '0' && line5add[i] == '1'  && carryLine3[i] == '1') {
				finalOutput[i] = '0';
				// Carry the 1
				carryLine3[i-1] = '1';
			}
			else if(tempResult3[i] == '1' && line5add[i] == '0'  && carryLine3[i] == '0'){
				finalOutput[i] = '1';
			}
			else if(tempResult3[i] == '1' && line5add[i] == '0'  && carryLine3[i] == '1') {
				finalOutput[i] = '0';
				// Carry the 1
				carryLine3[i-1] = '1';
			}
			else if(tempResult3[i] == '1' && line5add[i] == '1' && carryLine3[i] == '0') {
				finalOutput[i] = '0';
				// Carry the 1
				carryLine3[i-1] = '1';
			}
			else if(tempResult3[i] == '1' && line5add[i] == '1' && carryLine3[i] == '1') {
				finalOutput[i] = '1';
				// Carry the 1
				carryLine3[i-1] = '1';
			}
		}
		
		//print answer
		for(int i=0; i < finalOutput.length; i++) {
			System.out.print(finalOutput[i]);
		}
		
		menu();
	}
		
		/*int[] carryLine = new int[16];
		
		// Fill up the carry line with 0
		for(int i=0; i < carryLine.length; i++) {
			carryLine[i] = '0';
		}
		
		
		// this is where the answer goes
		int[] finalOutput = new int[16];
		
		// keep the multiplication 
		int[] sum = new int[16];
		for(int i=0; i < sum.length; i++) {
			sum[i] = '0';
		}
		
		int[] carryLineAdd = new int[16];
		
		//This is the first input
		System.out.println("Please enter a binary 16 bits");
		String input = "";
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    input = br.readLine();
		    
		}catch(Exception e) {System.out.println("Error reading option");}
		
		//first input to a char
		//int firstInput = Integer.parseInt(input);
		int firstInput = Integer.parseInt(input);
		
		
		//This is the second input
		System.out.println("Please enter a binary 16 bits");
		String input2 = "";
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    input2 = br.readLine();
		    
		}catch(Exception e) {System.out.println("Error reading option");}
		
		//second input to a char
		//int secondInput = Integer.parseInt(input2);
		int secondInput = Integer.parseInt(input2);
		
		
	}
		

		/*int anwserMult = secondInput*firstInput;
		
		//int mult = Integer.parseInt(input) * Integer.parseInt(input2);
		
		int a[][] = new int [16][16];
		
		
		for(int i=15; i >= 0; i--) {
			
			for (int z=15; z >= 0; z--) {
			//a[i][z] = anwserMult;
			//System.out.println(" " + a[i][z]);
			}
		}
		
		System.out.println(" ");
		
		/*for(int i=15; i >= 0; i--) {
			for (int z=15; z >= 0; z--) {
				
			
			if (a[i][z] = 1*1)
			}
		}*/
		
		
		
		/*for(int i=15; i >= 0; i--) {
			
			
			if(firstInput[i] == '0' && secondInput[i] == '0'  && carryLine[i] == '0') {
				finalOutput[i] = '0';
			}
			else if(firstInput[i] == '0' && secondInput[i] == '0'  && carryLine[i] == '1') {
				finalOutput[i] = '1';
			}
			else if(firstInput[i] == '0' && secondInput[i] == '1'  && carryLine[i] == '0') {
				finalOutput[i] = '1';
			}
			else if(firstInput[i] == '0' && secondInput[i] == '1'  && carryLine[i] == '1') {
				finalOutput[i] = '0';
				// Carry the 1
				carryLine[i-1] = '1';
			}
			else if(firstInput[i] == '1' && secondInput[i] == '0'  && carryLine[i] == '0'){
				finalOutput[i] = '1';
			}
			else if(firstInput[i] == '1' && secondInput[i] == '0'  && carryLine[i] == '1') {
				finalOutput[i] = '0';
				// Carry the 1
				carryLine[i-1] = '1';
			}
			else if(firstInput[i] == '1' && secondInput[i] == '1' && carryLine[i] == '0') {
				finalOutput[i] = '0';
				// Carry the 1
				carryLine[i-1] = '1';
			}
			else if(firstInput[i] == '1' && secondInput[i] == '1' && carryLine[i] == '1') {
				finalOutput[i] = '1';
				// Carry the 1
				carryLine[i-1] = '1';
			}
		*/
	
	
	//==============================
	//========== DIVISION ==========
	//==============================
	public void Div() {
		
		System.out.println("Please enter a binary 16 bits");
		String input = "";
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    input = br.readLine();
		    
		}catch(Exception e) {System.out.println("Error reading option");}
		
		System.out.println("Please enter a binary 16 bits again");
		
		
		String input2 = "";
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    input2 = br.readLine();
		    
		}catch(Exception e) {System.out.println("Error reading option");}
		int firtInput = Integer.parseInt(input);
		int secondInput = Integer.parseInt(input2);
		int[] problem = new int[16];
		int[] working = new int[16];
		
		int[] carryLine = new int[16];
		for(int i=0; i < carryLine.length; i++) {
			carryLine[i] = '0';
		}
		
		int[] finalOutput = new int[16];
		
		
		
	    // turning the array numbers into a string
	    String workStr = "";
	    for(int i=0; i < working.length; i++) {
	    	working[i] = secondInput;
	    	workStr += String.valueOf(working[i]);
	    }
	    
	    
	    //Check to see, if our working number fits into the problem.
	    
	    // fill up temp with the loop to see if it fits.
	    int[] temp = new int [16];
	    
	    int[] firstNumber = new int[16];
	    
	    for(int i=0; i < problem.length; i++) {
	    	
	    	problem[i] = firtInput;
	    	  // temp is baby array, with the data
	    	  // we are currently working with
	    	  temp[i] = problem[i];
	    	 
	    	 // temp is the baby array, that has the amount
	    	  // of data to the current point.
	    	  // workStr is the string that contains 11
	    	 boolean result = checkIfFits(temp, workStr, i);
	    	  

	    	  if(result == true) {
		    	  firstNumber = temp;
	    		  break;
	    	  }
	    	
	    }
	    
	    
		String currentValues = "";
		
		for(int x = 0; x < firstNumber.length; x++) {
			
			currentValues += String.valueOf(firstNumber[x]);
		}
	    // do the subtraction

    	int d1=Integer.parseInt(workStr, 2);
    	int d2=Integer.parseInt(currentValues, 2);

    	// answer
    	int answer = d2 - d1;
	    
    	// answer // + problem[3] 
	  
	}
	public void printArray(int[] temp, int x) {
		for(int i=0; i< x+1; i++) {
		//System.out.print(temp[i]);
		}
		
		System.out.println(" ");
	}
	
	// temp - Is the array with values so far
	// working - is the array of numbers we are working with
	// i is how far to check
	public boolean checkIfFits(int[] temp, String working, int i) {
		
		
		boolean res = false;
		

		
		
		
		// only hold the current values in the string
		String currentValues = "";
		for(int x = 0; x < i; x++) {
			
			currentValues += String.valueOf(temp[x]);
		}
	
		
		
		
		System.out.print("Checking if " + working + " fits into");
    	System.out.println("Current Values " + currentValues);
    	try {
			    	int d1=Integer.parseInt(working, 2);
			    	int d2=Integer.parseInt(currentValues, 2);
		
			    	int answer = d2 - d1;
    	
			    	if(answer >= 0) {
			    		res = true;
			    	}
    	
			    	System.out.println(answer);
    	}catch(Exception e) {}

    	
    	
    	
		
		
		return res;
		
		//menu();
		
	}
	
	//==============================
	//======= 2'S COMPLEMENT =======
	//==============================


	public void twoScomp() {
		
		//Split the number in two so we can do the same like it was a positive number
		
		/*String numbers[] = decNum.split("-");
		
		int[] numInt = new int[1];
	    
	    numInt[0] = Integer.parseInt(numbers[1]);
	    
	    int dec = 0;
	    
	    dec = numInt[0]; 
	    
	    char origLn = '0';
	   		
	    //2D array
		int[][] a = new int[1][16];
		
		//trying to convert dec to binary 
		if (dec >= 32768) {
			a[0][0] = a[0][0] + 1;
			dec = dec - 32768;
		}
		if (dec >= 16384) {
			a[0][1] = a[0][1] + 1;
			dec = dec - 16384;
		}
		if (dec >= 8192) {
			a[0][2] = a[0][2] + 1;
			dec = dec - 8192;
		}
		if (dec >= 4096) {
			a[0][3] = a[0][3] + 1;
			dec = dec - 4096;
		}
		if (dec >= 2048) {
			a[0][4] = a[0][4] + 1;
			dec = dec - 2048;
		}
		if (dec >= 1024) {
			a[0][5] = a[0][5] + 1;
			dec = dec - 1024;
		}
		if (dec >= 512) {
			a[0][6] = a[0][6] + 1;
			dec = dec - 512;
		}
		if (dec >= 256) {
			a[0][7] = a[0][7] + 1;
			dec = dec - 256;
		}
		if (dec >= 128) {
			a[0][8] = a[0][8] + 1;
			dec = dec - 128;
		}
		if (dec >= 64) {
			a[0][9] = a[0][9] + 1;
			dec = dec - 64;
		}
		if (dec >= 32) {
			a[0][10] = a[0][10] + 1;
			dec = dec - 32;
		}
		if (dec >= 16) {
			a[0][11] = a[0][11] + 1;
			dec = dec - 16;
		}
		if (dec >= 8) {
			a[0][12] = a[0][12] + 1;
			dec = dec - 8;
		}
		if (dec >= 4) {
			a[0][13] = a[0][13] + 1;
			dec = dec - 4;
		}
		if (dec >= 2) {
			a[0][14] = a[0][14] + 1;
			dec = dec - 2;
		}
		if (dec >= 1) {
			a[0][15] = a[0][15] + 1;
			dec = dec - 1;
		}
		
		//System.out.println("It's the binary number equivalent to the decimal: ");
		for(col=0; col < 16; col++){
			this.Keep2_global = String.valueOf(a[0][col]);
			System.out.print(a[0][col]);
			origLn = (char)a[0][col];
		}*/
		
		//char[] originLn = new char[16];
		
		char[] carryLine = new char[16];
		
		char[] finalLn = new char[16];
		
		
		// Fill up the carry line with 0
		for(int i=0; i < carryLine.length; i++) {
			carryLine[i] = '0';
		}
		String input = "";
		try {
			System.out.println("Enter a binary number: ");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			input = br.readLine();
		}catch(Exception e) {System.out.println("Something goes wrong!");}
		
		char[] originLn = input.toCharArray();
		
		//a static line to add to the inverted line 
		String StaticLn = "0000000000000001"; 
		char[] SLarr = StaticLn.toCharArray();
		
		//invert all bits
		for(int i=15; i >= 0; i--) {
			
			//originLn[i] = origLn;
			if(originLn[i] == '0') {
				originLn[i] = '1';
			}
			else if(originLn[i] == '1') {
				originLn[i] = '0';
				}
		}
		
		//add static line to inverted line to make de two's complement
		for(int i=15; i >= 0; i--) {
			
			
			if(originLn[i] == '0' && SLarr[i] == '0'  && carryLine[i] == '0') {
				finalLn[i] = '0';
			}
			else if(originLn[i] == '0' && SLarr[i] == '0'  && carryLine[i] == '1') {
				finalLn[i] = '1';
			}
			else if(originLn[i] == '0' && SLarr[i] == '1'  && carryLine[i] == '0') {
				finalLn[i] = '1';
			}
			else if(originLn[i] == '0' && SLarr[i] == '1'  && carryLine[i] == '1') {
				finalLn[i] = '0';
				// Carry the 1
				carryLine[i-1] = '1';
			}
			else if(originLn[i] == '1' && SLarr[i] == '0'  && carryLine[i] == '0'){
				finalLn[i] = '1';
			}
			else if(originLn[i] == '1' && SLarr[i] == '0'  && carryLine[i] == '1') {
				finalLn[i] = '0';
				// Carry the 1
				carryLine[i-1] = '1';
			}
			else if(originLn[i] == '1' && SLarr[i] == '1' && carryLine[i] == '0') {
				finalLn[i] = '0';
				// Carry the 1
				carryLine[i-1] = '1';
			}
			else if(originLn[i] == '1' && SLarr[i] == '1' && carryLine[i] == '1') {
				finalLn[i] = '1';
				// Carry the 1
				carryLine[i-1] = '1';
			}
				
		}
		
		//print the two's complement
		System.out.println("Signed representations: ");
		
		for(int i=0; i < finalLn.length; i++) {
			System.out.print(finalLn[i]);
		}
		
		System.out.println(" ");
		menu();
				
	}	
	
	
	//==============================
	//======= STORE VARIABLE =======
	//==============================
		
	public void saveVariable() {
		
		System.out.println("Do you want to save this number as a variable? Press 1 to fill the variable 1 and 2 to fill the variable 2.");
	
		
		String input = "";
		try {
		
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    input = br.readLine();
		    
		}catch(Exception e) {System.out.println("Error reading option");}
		
		// If the input is equal to 1 so the global variable sum_global is equal to VARIABLE_1_global 
		if(input.equals("1")) {
			VARIABLE_1_global = String.valueOf(sum_global);
			System.out.println("It is the variable 1: " + VARIABLE_1_global);
		}
		// If the input is equal to 2 so the global variable keep2_global is equal to VARIABLE_2_global
		if(input.equals("2")) {
			VARIABLE_2_global = Keep2_global;
			System.out.println("It is the variable 2: " + VARIABLE_2_global);
		}
		
		menu();
	}
		
	//==============================
	//======== LOGOUT ==============
	//==============================

	public void Quit() {
		System.out.println("Thank you to use the calculator!" );
		System.exit(0);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new BinaryCalc();
	}

}
