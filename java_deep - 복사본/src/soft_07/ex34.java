package soft_07;

import java.util.Collections;

public class ex34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		dataSet();
		dataSort();
		HeaderPrint();
		for(int i=0; i <ArrayOneRec.size( i++)) {
			ItemPrint(i);
			
		}
		TailPrint();
		
	public static void dataSort() {
		
		Comparator<OneRec> bikyeokijun = new Comparator<OneRec>() {
			public int compare(OneRec a1, OneRec a2) {
				
				return (a2.sum()-a1.sum());
			}
			
		};
		
		Collections.sort(ArrayOneRec, bikyeokijun);
	}

	}

}
