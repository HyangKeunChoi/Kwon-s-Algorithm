package chapter2_0_RecursionApplication;

public class Maze {
	
	private static int N=8;
	private static int[][] maze = {
			{0, 0, 0, 0, 0 ,0 ,0 ,1},
			{0, 1, 1, 0, 1, 1, 0, 1},
			{0, 0, 0, 1, 0, 0, 0, 1},
			{0, 1, 0, 0, 1, 1, 0, 0},
			{0, 1, 1, 1, 0, 0, 1, 1},
			{0, 1, 0, 0, 0, 1, 0, 1},
			{0, 0, 0, 1, 0, 0, 0, 1},
			{0, 1, 1, 1, 0, 1, 0, 0}
	};
	
	private static final int PATHWAY_COLOUR =0; // white // 지나다닐수있는 통로
	private static final int WALL_COLOUR =1; //blue // 벽
	private static final int BLOCKED_COLOUR =2; //red // 이미 방문한 통로(막혀서 갈필요없음)
	private static final int PATH_COLOUR =3; // green // 이미 방문한 통로(더가면 어케될지 모르는 통로)



	public static boolean findmazePath(int x, int y) {
		if(x<0 || y<0 || x>=N || y>=N)
			return false;
		else if(maze[x][y] != PATHWAY_COLOUR)
			return false;
		else if( x==N-1 && y==N-1) {
			maze[x][y] = PATH_COLOUR;
			return true;			
		} else {
			maze[x][y] = PATH_COLOUR;
			if(findmazePath(x-1,y) || findmazePath(x,y+1)
				|| findmazePath(x+1, y) || findmazePath(x,y-1)){
					return true;
				}
			maze[x][y] = BLOCKED_COLOUR; // dead end 이 자리는 꽝이다
			return false;
		}
				
	}

	
	public static void main(String[] args) {
		// printMaze();
		findmazePath(0, 0); // 00에서 시작
		// printMaze();
	}

}
