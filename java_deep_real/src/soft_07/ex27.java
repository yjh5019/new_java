package soft_07;

import java.util.ArrayList;

public class ex27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList iAL = new ArrayList();
		
		iAL.add("abc");
		iAL.add("abcd");
		iAL.add("efga");
		iAL.add("가나다0");
		iAL.add("1234");
		iAL.add("12rk34");
		
		
		System.out.printf("*****************************\n");
		System.out.printf(" 시작 ArraySize %d \n", iAL.size());
		for(int i=0; i<iAL.size(); i++) {
			System.out.printf("ArrayLisf %d = %s\n", i, iAL.get(i));
		iAL.set(3,"가라라라");	
		}
		System.out.printf("*****************************\n");
		System.out.printf("내용변경 ArraySize %d \n",iAL.size());
		for(int i=0; i<iAL.size(); i++) {
			System.out.printf("ArrayLisf %d = %s\n", i, iAL.get(i));
		}
		iAL.remove(4);	
		System.out.printf("*****************************\n");
		System.out.printf("내용변경 ArraySize %d \n",iAL.size());
		for(int i=0; i<iAL.size(); i++) {
			System.out.printf("ArrayLisf %d = %s\n", i, iAL.get(i));
		}
		iAL.sort(null);
		System.out.printf("*****************************\n");
		System.out.printf("리스트 Sort ArraySize %d \n",iAL.size());
		for(int i=0; i<iAL.size(); i++) {
				System.out.printf("ArrayLisf %d = %s\n", i, iAL.get(i));
		}
		iAL.clear();				
		System.out.printf("*****************************\n");
		System.out.printf("전부 삭제 ArraySize %d \n",iAL.size());
		for(int i=0; i<iAL.size(); i++) {
			System.out.printf("ArrayLisf %d = %s\n", i, iAL.get(i));
		}
							
		}
	}
		
		
		


