package file_io.writefile;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class NIOWriteExam {
	
	//가변 파라미터 예시
	public static int getSum(int age,int ... numbers) {
		//불가능한 선언
		//int ... args=0;
		
		int sum =0;
		for(int i:numbers) {
			System.out.println(i);
			sum +=1;
		}
		
		
		return sum;
	}

	public static void main(String[] args) {
		
		//int sum =getSum();
		//sum = getSum(1,2,3,4);
		//int sum = getSum(40,1,2,3,4,5,6);
		//System.out.println(sum);
		
		// 이어쓰기 여부 (T/F)
		boolean append = true; 
		
		File file = new File("C:\\outputs2","java_output2.txt");
		if(! file.getParentFile().exists()) {
			file.getParentFile().mkdirs();
		}
		
		// append가 false일때만 파일을 (2) -> (3) 순으로
		if(append == false) {
			int index=2;
			while(file.exists()) {
				file = new File(file.getParent(),"java_output2 ("+(index++)+").txt");
			}
		}
		
		//파일에 쓸 내용
		List<String> fileDesc = new ArrayList<>();
		fileDesc.add("파일을 씁니다1");
		fileDesc.add("파일을 씁니다2");
		fileDesc.add("파일을 씁니다3");
		
		//파일을 쓴다.
		try {
			if(! append) {
				Files.write(file.toPath(),fileDesc,Charset.forName("UTF-8"));
			}
			else{
				Files.write(file.toPath(),fileDesc,Charset.forName("UTF-8"),StandardOpenOption.APPEND);
			}
				
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(file.getAbsolutePath());
	}

}
