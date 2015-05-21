public class AIProject {
	public static String[][] board = new String[9][9];
		public static void addSpace (int x, int y, String r){
			board [x][y] = r;
		}

	public static void showBoard(){
		for (int row = 0; row < board.length; row++){
			System.out.println(" ");
			System.out.println("------------------");
			for(int col = 0; col < board[row].length; col++){
				System.out.print("|");
				if(board[col][row] == null){
					System.out.print(" ");
				}else{
					System.out.print(board[col][row]);
				}
			}
		}
		System.out.println(" ");
		System.out.println("------------------");
	}


	// public static void movePlayer(){

	// }

//	public static void checkAvailableSpaces(){

//	}

	public static void main(String[] args){
		System.out.println(board.length);
		addSpace(0,0," ");
		addSpace(0,1,"1");
		addSpace(0,2,"2");
		addSpace(0,3,"3");
		addSpace(0,4,"4");
		addSpace(0,5,"5");
		addSpace(0,6,"6");
		addSpace(0,7,"7");
		addSpace(0,8,"8");
		addSpace(1,0,"1");
		addSpace(2,0,"2");
		addSpace(3,0,"3");
		addSpace(4,0,"4");
		addSpace(5,0,"5");
		addSpace(6,0,"6");
		addSpace(7,0,"7");
		addSpace(8,0,"8");
		addSpace(1,1,"X");
		addSpace(8,8,"Y");
		showBoard();

	}
}