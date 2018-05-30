import java.util.Scanner;
class NQueens{
		static int board[][];
	public static void main(String ar[]){
		System.out.println("Enter the Size of Board");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		board = new int[n][n];	
		for(int i=0; i< board.length; i++){
			for(int j=0; j<board[i].length; j++){
				board[i][j]=0;
			}
		}
		if(placeQueen(0)){
			System.out.println("Found");
			for(int i=0; i< board.length; i++){
			for(int j=0; j<board[i].length; j++){
				if(board[i][j]==2)
					System.out.print("( "+i+","+j+" )");
			}
			System.out.println();
		}
	}
	}
	
	
	public static boolean placeQueen(int row ){
		Boolean next;
		if(row == board.length){
					return true;
				}
		for(int col=0; col < board.length ; col++){
			if(free(row,col)){
				add(row,col);
				next=placeQueen(row+1);
				if(next){
					return true;
				}
				remove(row,col);
			}
		}
		return false;
	}
	
	
	public static void add(int row,int col){
		board[row][col]=2;
		for(int cols=0;cols<board.length;cols++){
			if(board[row][cols]==2 || board[cols][row]==2){
				continue;
			}
			else{
			board[row][cols]=1;
			board[cols][row]=1;
			}
		}
		for(int i=0;i<board.length;i++){
			for(int j=0;j<board[i].length;j++){
				if((i+j) == row+col && (board[i][j]!=2)){
					board[i][j]=1;
				}
				if((j-i) == (col-row) && (board[i][j]!=2)){
					board[i][j]=1;
			}
		}
	
	}
	}
	
	
	public static void remove(int row,int col){
		board[row][col]=0;
		for(int cols=0;cols<board.length;cols++){
			board[row][cols]=0;
			board[cols][row]=0;
		}
		for(int i=0;i<board.length;i++){
			for(int j=0;j<board[i].length;j++){
				if((i+j) == row+col){
					board[i][j]=0;
				}
				if((j-i) == (col-row)){
					board[i][j]=0;
				}
			}
	
		}
	}
	
	
	
	public static boolean free(int row,int col){
		return (board[row][col]==0);			
	}
	
	
}	