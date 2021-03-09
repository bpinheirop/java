import org.w3c.dom.Node;

public class aula1 {

	public static boolean bubbleSort ( int vetor []) {
		if( vetor == null ) return false ;
		for( int i = 0; i < vetor . length -1; i ++) {
			for( int j = 0; j < vetor . length -1 - i ; j ++) {
				if( vetor [ j ] > vetor [ j +1]) {
					int temp = vetor [ j ];
					vetor [ j ] = vetor [ j +1];
					vetor [ j +1] = temp ;
				}
			}
		}
		return true;
	}
	
	


	public static void main(String[] args) { 	
		// TODO Auto-generated method stub
		
		int vetor []={9 ,8 ,7 ,6 ,5 ,4 ,3 ,2 ,1};
		bubbleSort ( vetor ) ;
		for( int i =0; i < vetor . length ; i ++) {
			System . out . print (" "+ vetor [ i ]) ;
		}


	}

}
