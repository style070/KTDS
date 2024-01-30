package exception_handling;

import java.awt.image.RasterFormatException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import exception_handling.exceptions.ReadFailException;

public class TryCatchExam {

	// 예외처리를 내가 하지않고 다른코드에게 책임을 떠넘기는 코드 ( 예외 위임하기 )
	// 나를 호출하는 곳에 예외처리에 대한 책임을 위임하겠다.
	// 내가 하기 싫어서 호출하는사람에게 책임을 전가하는 ( Bad Code )
	public static List<String> readFile(File path) throws IOException {
		
		return Files.readAllLines(path.toPath());
		
	}
	
	public static List<String> readFile2(File path){
		
		try {
			return Files.readAllLines(path.toPath());		
		}
		catch(IOException ioe) {
			throw new ReadFailException("파일을 읽을 수 없습니다.",ioe);
		}
	}
	
	// 예외처리를 exception 포멧으로 감싸서 호출부에 던져주어 약속은 어느정도 지켜지는 코드
	public static int converToInt(String str) throws Exception {
		
		//예외가 발생하는코드
		//int number= Integer.parseInt("ABC");
		
		//예외를 발생시킬 가능성이 있는 코드
		try {
			int number= Integer.parseInt(str);			
			return number;
		}
		//Exception도 레퍼런스 타입 = 클래스임 = 인스턴스화 가능
		
		catch(NumberFormatException nfe) {
			Exception exception = new Exception(str+"숫자로 변환할 수 없습니다.");
			throw exception; // throw 예외를 발생 시킴 ( 예외가 던져진다. )
							 // 예외를 던지고 메소드를 종료한다.
		}
		finally {
			System.out.println("변환이 완료되었습니다.");
		}
		//return 0;
		
	}
	
	public static void main(String[] args) {
		File imageFile = new File("c:\\testtest");
				
		//readFile(imageFile); // Exception으로 Throw 하고 있으므로 Try-Catch가 필요함
		readFile2(imageFile);// RuntimeException으로 Throw하고 있으므로 Try-Catch가 필요 없음
		
		
		try {
			int num=converToInt("AAA");
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage()
					);
		}
		
		
		
		// 시스템 드라이브에서 특정 경로에 있는 파일을 읽어온다.
		try {
			Files.readAllLines(imageFile.toPath()); // 파일에 있는 문자를 다 읽어 온다.
		} catch (IOException ioe) {
			// TODO Auto-generated catch block
			String message = ioe.getMessage();
			System.out.println(message);
			
			ioe.printStackTrace();
		}
		finally {
			System.out.println("File을 읽고 finally가 실행되었습니다.");
		}
		
		
		
		// 다양한 예외가 한번에 이루어지는 경우
		try{
			Class.forName("exception_hadnling.ifArrayIndexOutOfBoundsException");
			Files.readAllLines(imageFile.toPath());
		}catch (ClassNotFoundException | IOException cnfe) {
			String message=cnfe.getMessage();
			System.out.println(message);
			
			// 아주 상세한 예외 목록 ( 호출 스택 )
			cnfe.printStackTrace();
		} 
//		catch (IOException ioe) {
//			String message=ioe.getMessage();
//			System.out.println(message);
//			
//			ioe.printStackTrace();
//		}
	}
}
