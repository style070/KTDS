package file_io_fileinfo;

import java.io.File;
import java.util.Date;

public class FileInfo {
	public static void main(String[] args) {
		File file = new File("C:\\JavaExam","JavaExam.txt");
//		File file = new File("C:\\JavaExam","JavaExam1.txt");
//		File file = new File("C:\\JavaExam");
//		File file = new File("C:\\");
		
		// 파일이 존재하면 true , 아니면 false
		boolean isFileExists = file.exists();
		System.out.println("isFileExists >"+isFileExists);
		
		// 읽어온 File 인스턴스가 파일이라면 true , 폴더라면 false
		boolean isFile = file.isFile();
		System.out.println("is File > "+isFile);
		
		// 읽어온 File 인스턴스가 폴더(디렉터리)라면 true , 파일이라면 false
		boolean isDirectory  = file.isDirectory();
		System.out.println("isDirectory >"+isDirectory);
		
		//File 인스턴스가 가리키고 있는 폴더 또는 파일의 전체 경로.
		String fileAbsolutPath = file.getAbsolutePath();
		System.out.println("fileAbsolutPath > "+fileAbsolutPath);
		
		//File 인스턴스가 가리키고 있는 것이 폴더라면 폴더의 이름
		// 파일이라면 확장자를 포함한 파일의 이름
		String fileName = file.getName();
		System.out.println("fileName >"+fileName );
		
		//File 인스턴스가 가리키고 있는 파일의 크기(Byte)
		// 1byte ==> 1
		// 1kb ==> 1024 ( Windows 기준 ) ( Windows가 아닐 경우 1000 )
		// 1mb ==> 1024 x 1024
		// 1gb ==> 1024 x 1024 x 1024
		// 1tb ==> 1024 x 1024 x 1024 x 1024
		// 1pb ==> 1024 x 1024 x 1024 x 1024 x 1024
		long length = file.length();
		System.out.println("length > "+length);
		
		// 파일이 마지막으로 수정된 날짜와 시간.
		// 컴퓨터의 시간 기준 ==> 1970-01-01 00:00:00 이떄 부터 흘러간 초 x 1000만큼 돌려준다.
		long lastModifiedTime = file.lastModified();
		System.out.println("lastModifiedTime >" + lastModifiedTime);
		// long 타입의 날짜와 시간을 문자로 된 날짜와 시간으로 변환.
		Date date = new Date();
		System.out.println(date);
		
		
		// 현재 파일이 존재하는 부모(상위) 폴더의 경로(문자열/String)
		String parentPath = file.getParent();
		System.out.println("parentPath >" + parentPath);
		
		// 현재 파일이 존재하는 부모(상위) 폴더의 새로운 File 인스턴스
		File parentFile = file.getParentFile();
		System.out.println("parentFile >"+parentPath);
		
		// File 인스턴스가 폴더일때 , 폴더 내부에 존재하는 모든 폴더와 파일 목록을 반환.
		File[] listFileArray = file.listFiles();
		for(File item : listFileArray) {
			System.out.println(item.getAbsolutePath());
		}
		
		
	}
}
