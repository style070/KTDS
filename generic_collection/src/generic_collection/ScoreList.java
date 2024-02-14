package generic_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ScoreList<T> {

	/**
	 * scoreList가 관리할 배열
	 */
	private Object[] scoreArray;

	/**
	 * 배열내에 들어있는 아이템들의 수 <br/>
	 * 배열의 길이와는 관계가 없다.
	 */
	private int size;

	/**
	 * 생성자에는 Object를 사용해야함
	 */
	public ScoreList() {
		this.scoreArray = new Object[2];

	}

	/**
	 * scoreArray 배열에 값을 추가한다.
	 * 
	 * @param score 제네릭에 할당된 타입의 인스턴스 혹은 값
	 */
	public void add(T score) {
		// 현재의 배열은 Object[2]인데 2개이상 넣으면 배열의 공간이 부족하므로
		// tempScoreArry[] 배열을 형성에 기존 ScoreArray[2]보다 2공간큰 배열을 만들어
		// 공간확보를위해 수행하는 코드
		if (size >= scoreArray.length) {
			Object[] tempScoreArray = new Object[scoreArray.length + 2];
			System.arraycopy(scoreArray, 0, tempScoreArray, 0, scoreArray.length);
			scoreArray = tempScoreArray;
		}
		scoreArray[size] = score;
		size += 1;

//		if(size>=scoreArray.length) {
//			int[] tempScoreArray = new int[scoreArray.length+2];
//			System.arraycopy(scoreArray, 0, tempScoreArray, 0, scoreArray.length);
//			scoreArray = tempScoreArray;
//		}
//		scoreArray[size] = score;
//		size +=1;
	}

	/**
	 * scoreArray 배열에서 index에 할당된 값을 반환
	 * 
	 * @param index 반환시킬 배열의 인덱스
	 * @return 인덱스에 들어있는 인스턴스 혹은 값
	 */
	// Reference Type의 가장 기본값 Null return
	public T get(int index) {

		if (index >= size) {
			throw new IndexOutOfBoundsException(index);
		}
		return (T) scoreArray[index];

//		if(index >= size) {
//			throw new IndexOutOfBoundsException(index); // 접근하고자 하는 배열의 인덱스가 OOB 가 발생
//		}
//		return scoreArray[index];

	}

	/**
	 * scoreArray 배열에 인스턴스 혹은 값이 들어있는 개수
	 * 
	 * <pre>
	 * int[] scoreArray = new int[100];
	 * scoreArray[0] = 100;
	 * scoreArray[1] = 100;
	 * </pre>
	 * 
	 * size()의 결과는 2가 반환된다.
	 * 
	 * @return scoreArray 배열에 인스턴스 혹은 값이 들어있는 개수.
	 */
	public int size() {
		return this.size;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("ScoreList[");
		
		//인덱스는 필요없지만 마지막에 존재하는 null값은 출력하지 않기 위해서 for-each가 아닌 for(index)문을 사용함
		// Stream으로 변경 시작
		
		String items = Arrays.stream(this.scoreArray)
								.filter(object -> object != null)
								.map(object -> object +"")
								.collect(Collectors.joining(","));
		
//		for (int i = 0; i < size; i++) {
//			sb.append(scoreArray[i] + ",");
//		}
		
		
		sb.append(items+"]");

		return sb.toString();
		
		 
	}
	

}
