package model;

/**
 *  convert words to numbers
 *
 */
public class EnglishStringToNumber {


	public int convert(String word) {
		int wordcount = 0;
		String[] arrinwords = word.split(" ");
		int arrinwordsLength = arrinwords.length;
		if ("zero".equals(word))
			return 0;
		if (word.contains("thousand")) {
			int thousandIndex = word.indexOf("thousand");
			String beforethousand = word.substring(0, thousandIndex);
			String[] arrbeforethousand = beforethousand.split(" ");
			int arraybeforethousandLength = arrbeforethousand.length;
			if (arraybeforethousandLength == 2) {
				wordcount = wordcount + 1000 * (wordToNumber(arrbeforethousand[0]) + wordToNumber(arrbeforethousand[1]));

			}
			if (arraybeforethousandLength == 1) {
				wordcount = wordcount + 1000 * (wordToNumber(arrbeforethousand[0]));
	
			}

		}
		if (word.contains("hundred")) {
			int hundredIndex = word.indexOf("hundred");
			String beforehundred = word.substring(0, hundredIndex);

		
			String[] arrbeforehundred = beforehundred.split(" ");
			int arraybeforehundredLength = arrbeforehundred.length;
			wordcount = wordcount + 100 * (wordToNumber(arrbeforehundred[arraybeforehundredLength - 1]));
			String afterhundred = word.substring(hundredIndex + 8);
			String[] arrayafterhundred = afterhundred.split(" ");
			int arrafterhundredLength = arrayafterhundred.length;
			if (arrafterhundredLength == 1) {
				wordcount = wordcount + (wordToNumber(arrayafterhundred[0]));
			}
			if (arrafterhundredLength == 2) {
				wordcount = wordcount + (wordToNumber(arrayafterhundred[1]) + wordToNumber(arrayafterhundred[0]));
			}
	

		}
		if (!word.contains("thousand") && !word.contains("hundred")) {
			if (arrinwordsLength == 1) {
				wordcount = wordcount + (wordToNumber(arrinwords[0]));
			}
			if (arrinwordsLength == 2) {
				wordcount = wordcount + (wordToNumber(arrinwords[1]) + wordToNumber(arrinwords[0]));
			}
			
		}

		return wordcount;
	}

	private int wordToNumber(String word) {
		int num = 0;
		switch (word) {
		case "one":
			num = 1;
			break;
		case "two":
			num = 2;
			break;
		case "three":
			num = 3;
			break;
		case "four":
			num = 4;
			break;
		case "five":
			num = 5;
			break;
		case "six":
			num = 6;
			break;
		case "seven":
			num = 7;
			break;
		case "eight":
			num = 8;
			break;
		case "nine":
			num = 9;
			break;
		case "ten":
			num = 10;
			break;
		case "eleven":
			num = 11;
			break;
		case "twelve":
			num = 12;
			break;
		case "thirteen":
			num = 13;
			break;
		case "fourteen":
			num = 14;
			break;
		case "fifteen":
			num = 15;
			break;
		case "sixteen":
			num = 16;
			break;
		case "seventeen":
			num = 17;
			break;
		case "eighteen":
			num = 18;
			break;
		case "nineteen":
			num = 19;
			break;
		case "twenty":
			num = 20;
			break;
		case "thirty":
			num = 30;
			break;
		case "forty":
			num = 40;
			break;
		case "fifty":
			num = 50;
			break;
		case "sixty":
			num = 60;
			break;
		case "seventy":
			num = 70;
			break;
		case "eighty":
			num = 80;
			break;
		case "ninety":
			num = 90;
			break;
		case "hundred":
			num = 100;
			break;
		case "thousand":
			num = 1000;
			break;
	
		}
		return num;
	}
}
