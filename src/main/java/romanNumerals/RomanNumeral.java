package romanNumerals;

public class RomanNumeral {

	private static final String I = "I";
	private static final String V = "V";
	private static final String X = "X";
	private static final String L = "L";
	private static final String C = "C";
	private static final String D = "D";
	private static final String M = "M"; 

	public String romanOfNum(int number) {
		
		int position = RomanNumbers.getSymbolPosition(number);
		if(position >= 0 ) return RomanNumbers.symbols[position];
		
		int prevPosition = RomanNumbers.getPreviousExactSymbolPosition(number);
		
		int distancePrev = number - RomanNumbers.values[prevPosition];
		//TODO numbers > 1000
		int distanceNext = RomanNumbers.values[prevPosition+1] - number;
		
		int symbolsSequence [] = new int[500];
		if(distanceNext > 1 ) {
			symbolsSequence[0] = prevPosition;
			for(int i = 1; i <= distancePrev ; i++ ){
				symbolsSequence[i] = 0;
			}
			return transformToSymbols(symbolsSequence, distancePrev+1);
		} else {
			symbolsSequence[0] = 0;
			symbolsSequence[1] = prevPosition + 1;
			return transformToSymbols(symbolsSequence, 2);
		}
	}
	
	private String transformToSymbols(int[] symbolsSequence, int length) {
		String result = "";
		for (int i = 0; i < length; i++){
			result+=RomanNumbers.symbols[symbolsSequence[i]];
		}
		return result;
	}

	private static class RomanNumbers {
		public static final int[] values = {1,5,10,50,100,500,1000};
		public static final String[] symbols = {I,V,X,L,C,D,M};
		
		public static int getSymbolPosition(int number){
			for(int i = 0; i < values.length; i++) {
				if(number == values[i]) return i;
			}
			return -1;
		}
		
		public static int getPreviousExactSymbolPosition(int number){
			int previous = 0;
			for(int i = 1; i < values.length; i++) {
				if(number < values[i]) return previous;
				previous = i;
			}
			return previous;
		}
		
	}

}
