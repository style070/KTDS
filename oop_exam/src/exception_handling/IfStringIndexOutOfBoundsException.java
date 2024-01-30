package exception_handling;

import java.util.Scanner;

public class IfStringIndexOutOfBoundsException {

	public static void main(String[] args) {

		String logoFilePath = "C:\\images\\logo.png";
//		Scanner sc = new Scanner(System.in);
		/**
		 * logoFilePath 인스턴스에서 logo.png만 추출해 출력해보세요.
		 */
		// Case 1. subString + indexOf + lastIndexOf
		int lastIndexOfBackslash = logoFilePath.lastIndexOf("\\");
		String fileName = logoFilePath.substring(lastIndexOfBackslash + 1);
		System.out.println(fileName);

//		System.out.println("검색대상 문자열을 입력하세요");
//		String compareString = sc.nextLine();
//		String[] filePath = compareString.split("\\\\");
//		System.out.println("검색할 문자를 입력하세요");
//		String searchString = sc.nextLine();
//
//		for (int i = 0; i < filePath.length; i++) {
//			if (searchString.equals(filePath[i])) {
//				int lastIndex = filePath.length - 1;
//				System.out.println(filePath[lastIndex]);
//			}
//		}

		/**
		 * logoFilePath 인스턴스에서 "images"만 추출해 출력해보세요.
		 */
		int firstIndexOfBackslash = logoFilePath.indexOf("\\");
		fileName = logoFilePath.substring(firstIndexOfBackslash + 1, lastIndexOfBackslash);
		System.out.println(fileName);

		/**
		 * logoFilePath 인스턴스에서 "user_images"만 추출해 보세요.
		 */
		if (logoFilePath.contains("images")) {
			int indexOfUserImages = logoFilePath.indexOf("user_images");
			if (indexOfUserImages >= 0) {
				fileName = logoFilePath.substring(indexOfUserImages, lastIndexOfBackslash - 1);
				System.out.println(fileName);
			}

		}

//		String[] filePath = logoFilePath.split("\\\\");
//		boolean compareTrue = false;
//		for(int i=0; i<filePath.length;i++) {
//			if(filePath[i].equals("user_images")) {
//				System.out.println(filePath[i]);	
//				compareTrue = true;
//			}
//		}
//		if (compareTrue==false) {
//			System.out.println("user_images 문자열이 없습니다");
//		}

		/**
		 * logoFilePath 인스턴스에서 확장자("png")만 출력해 보세요.
		 */

		int lastIndexOfDot = logoFilePath.lastIndexOf(".")+1;
		String extensionName = logoFilePath.substring(lastIndexOfDot);
		System.out.println(extensionName);
		
		
		/**
		 * downloadFilePath 인스턴스에서 파일의 확장자를 추출해 출력해 보세요
		 */
		String downloadFilePath = "C:\\images\\logo.sh";
		if(downloadFilePath.contains(".")) {
			
			lastIndexOfDot = downloadFilePath.lastIndexOf(".")+1;
			extensionName = downloadFilePath.substring(lastIndexOfDot);
			System.out.println(extensionName);
			
		}

	}

}
