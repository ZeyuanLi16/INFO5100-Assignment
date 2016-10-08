package assignment.solution4;
	/**
	 * Finish assignments, try bonus. Deadline: Before the next class.
	 * 
	 * @author Jia
	 */
	public class Assignment3 {
		// assignments
		/**
		 * Write a method to find N numbers which are power of three. e.g. n=4,
		 * return {1,3,9,27}
		 */
		public int[] findPowerOfThree(int n) {
			if(n<=0){
				System.out.println("-----Please input an integer that is more than zero----");
				return null;
			}
			int[] arr=new int[n];
			for(int i=0;i<n;i++){
				arr[i]=(int) Math.pow(3,i);
			}
			return arr;
			
		}

		/**
		 * Given a integer 'n', return n%count, count is the number of digits of n
		 * For example, n = 100, return 1
		 */
		public int countDigits(int n) {
			int digit=0;
			int n2=n;
			while(Math.abs(n)%10>0||n/10!=0){
				digit++;
				n=n/10;
			}
			return n2%digit;
		}

		/**
		 * Given a integer 'n', if n is odd, print n odd numbers, if n is even,
		 * print n even numbers. For example, n = 3, print 1 3 5 n = 4, print 0 2 4
		 * 6
		 */
		public void printNumbers(int n) {
			if(n<=0){
				System.out.println("-----Please input an integer that is more than zero----");
				return ;
			}else if(n%2==0){
				for(int i=0;i<n;i++){
				    System.out.print(2*i+" ");
				}
			}else{
				for(int i=0;i<n;i++){
				    System.out.print((2*i+1)+" ");
				}
			}

		}

		/**
		 * Given numRows, generate the first numRows of Pascal's triangle. For
		 * example, given numRows = 5, return: [1] [1,1] [1,2,1] [1,3,3,1]
		 * [1,4,6,4,1]
		 */
		public int[][] generatePascalsTriangle(int n) {
			if(n<=0){
				System.out.println("-----Please input an integer that is more than zero----");
				return null;
			}else{
				int[][] tri=new int[n][n];
				for(int i=0;i<n;i++){
					for(int j=0;j<=i;j++){
						if(i==0||j==0||j==i)
							tri[i][j]=1;
						else
							tri[i][j]=tri[i-1][j]+tri[i-1][j-1];
					}
				}
				return tri;
			}
		}

		/**
		 * Write a function that takes a string as input and reverse only the vowels
		 * of a string. For example: Given s = "hello", return "holle".
		 */
		public String reverseVowels(String s) {
			char[] arr=s.toCharArray();  
			int l=0,r=s.length()-1;
			while(l<r){
				if(arr[l]=='a'||arr[l]=='e'||arr[l]=='i'||arr[l]=='o'||arr[l]=='u'||
						arr[l]=='A'||arr[l]=='E'||arr[l]=='I'||arr[l]=='O'||arr[l]=='U'){
					if(arr[r]=='a'||arr[r]=='e'||arr[r]=='i'||arr[r]=='o'||arr[r]=='u'||
							arr[r]=='A'||arr[r]=='E'||arr[r]=='I'||arr[r]=='O'||arr[r]=='U'){
						char a=arr[l];
						arr[l]=arr[r];
						arr[r]=a;
						l++;r--;continue;
					}else{
						r--;continue;
					}
				}else if(arr[r]=='a'||arr[r]=='e'||arr[r]=='i'||arr[r]=='o'||arr[r]=='u'||
						arr[r]=='A'||arr[r]=='E'||arr[r]=='I'||arr[r]=='O'||arr[r]=='U'){
					l++;continue;
				}else{
					l++;r--;
				}
			}
			return new String(arr);
		}

		/**
		 * Given a string s consists of upper/lower-case alphabets and empty space
		 * characters ' ', return the length of last word in the string. If the last
		 * word does not exist, return 0. Note: A word is defined as a character
		 * sequence consists of non-space characters only.
		 */
		public int lengthOfLastWord(String str) {
			int length=0;
			char[] arr=str.toCharArray();
			for(int i=arr.length-1 ; i>=0;i--){
				if(arr[i]==' ')
					break;
				length++;
			}
			return length;
		}

		/**
		 * Reverse a string by words. Do not use 'split' function. e.g. "I like
		 * soccer" --> "soccer like I"
		 */
		public String reverseString2(String str) {
			if(str.charAt(str.length()-1)!=' ')
				str=str+" ";

			int count=0;
			String rev = "";
			int lastLetter=str.length()-1;
		
			for(int i=str.length()-1;i>=0;i--){
				count++;
				if(str.charAt(i)==' '){
					rev=rev+str.substring(i+1,lastLetter+1);
					lastLetter=i;
					count=0;
				}else if(i==0){
					rev=rev+str.substring(i,lastLetter);
				}
			}
			return rev;
		}

		// Bonus
		/**
		 * A robot from Mars send a long message to Earth which only contains many
		 * "SOS", like "SOSSOS", "SOSSOSSOSSOSSOS" But the radiation from universe
		 * changed some characters of the massage. Write a method to count how many
		 * characters were changed. For example, "SOSSOSSOS" might be changed to
		 * "SOSSUSSOP", then your method should return 2. The message was consisted
		 * by "SOS" so its length will be multiple of 3. You could assume the
		 * message only contains upper letter.
		 */
		public int checkMessage(String message) {
			int error=0;
			for(int i=0;i<message.length();i=i+3){
				if(message.charAt(i)!='S')
					error++;
				if(message.charAt(i+1)!='O')
					error++;
				if(message.charAt(i+2)!='S')
					error++;
			}
			return error;
		}
	}
	
	
