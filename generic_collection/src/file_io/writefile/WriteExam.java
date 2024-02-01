package file_io.writefile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import file_io_readfile.copy.ReadAndPrintExam;

public class WriteExam {

	public static List<String> getAllLines(File file) {

		if (file.exists() && file.isFile()) {
			// C:\\JavaExam\JavaExam.txt이 존재하면
			// C:\\JavaExam\JavaExam.txt이 파일이라면

			FileReader reader = null;
			BufferedReader bufferedReader = null;

			List<String> lineList = new ArrayList<>();

			try {
				// 파일을 바이트 단위로 읽어오는 FileReader를 선언
				reader = new FileReader(file, Charset.forName("UTF-8"));
				// 파일을 라인단위로 읽어오는 BufferedReader를 선언
				bufferedReader = new BufferedReader(reader);
				// 파일을 라인단위로 읽어와 할당하기 위한 String 변수 선언
				String line = null;
				// 파일이 끝날때까지 (EOF , End Of File) 반복하며 line 변수에 한 줄 씩 읽어오기
				while ((line = bufferedReader.readLine()) != null) {
					lineList.add(line + "\n");
				}

				return lineList;

			} catch (IOException ioe) {
				// 파일을 읽다가 예외 발생하면 예외 메시지만 출력
				System.out.println(ioe.getMessage());
			} finally {
				// 파일을 끝까지 읽었거나 예외가 발생했을경우
				// BufferedReader를 닫아준다.
				if (bufferedReader != null) {
					try {
						bufferedReader.close();
					} catch (IOException ioe) {
					}
				}
				// 파일을 끝까지 읽었거나 예외가 발생했을 경우
				// FileReader를 닫아준다
				if (reader != null) {
					try {
						reader.close();
					} catch (IOException ioe) {
					}
				}

			}

		}
		return null;

	}

	/**
	 * 파일을 쓴다.
	 * 
	 * @param parent   파일을 쓸 경로
	 * @param filename 쓸 파일의 이름
	 * @param append   이어서 쓸 것인지 여부
	 */

	public static void writeFile(String parent, String filename, boolean append) {
		File file = new File(parent, filename);
		if (!file.getParentFile().exists()) {
			file.getParentFile().mkdirs();
		}

		List<String> originalFileDescription = new ArrayList<>();
		if (!append) {
			// 이어서 쓰지 않을 것이라면 .. 영역
			int index = 2;
			while (file.exists()) {
				file = new File(file.getParent(), "java_output (" + (index++) + ").txt");
			}
		} else {
			// 이어서 쓸 것이라면.. 영역.
			// 기존의 파일 내용을 읽어와서 List<String>으로 반환 받는다.
			// 반환 받은 내용을 originalFileDescription에 addAll 한다.
			originalFileDescription.addAll(ReadAndPrintExam.getAllLines(file));
		}

	}
}
