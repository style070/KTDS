package file_io_readfile.copy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Collection;

public class ReadAndPrintExam {
	public static void main(String[] args) {
		File file = new File("C:\\JavaExam","JavaExam.txt");
		if(file.exists() && file.isFile()) {
			//C:\\JavaExam\JavaExam.txt이 존재하면
			//C:\\JavaExam\JavaExam.txt이 파일이라면
			
			FileReader reader = null;
			BufferedReader bufferedReader = null;
			
			try {
				// 파일을 바이트 단위로 읽어오는 FileReader를 선언
				reader = new FileReader(file,Charset.forName("UTF-8"));
				// 파일을 라인단위로 읽어오는 BufferedReader를 선언
				bufferedReader = new BufferedReader(reader);
				// 파일을 라인단위로 읽어와 할당하기 위한 String 변수 선언
				String line = null;
				//파일이 끝날때까지 (EOF , End Of File) 반복하며 line 변수에 한 줄 씩 읽어오기
				while((line = bufferedReader.readLine()) != null) {
					System.out.println(line);
				}
			}
			catch(IOException ioe){
				//파일을 읽다가 예외 발생하면 예외 메시지만 출력
				System.out.println(ioe.getMessage());
			}
			finally {
				// 파일을 끝까지 읽었거나 예외가 발생했을경우
				// BufferedReader를 닫아준다.
				if(bufferedReader != null) {
					try {
						bufferedReader.close();
					}
					catch(IOException ioe) {}
				}
				//파일을 끝까지 읽었거나 예외가 발생했을 경우
				//FileReader를 닫아준다
				if(reader != null) {
					try {
						reader.close();
					}
					catch(IOException ioe) {}
				}
				
			}
			
			 

			
		}
		
		
	}

	
}
