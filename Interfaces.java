// Interface is a blue print of class
// All method are public,abstrat wihout implementation
//Used to achieve total abstration
//variables int the interface are final publiuc static
class Interfaces{
	public static void main(String[]args){
	Queen q=new Queen();
	q.moves();

	}
}
interface chessplayer{
	void moves();
}
class Queen implements chessplayer{
	public void moves(){
	System.out.println("up,down,left,right,diagonal( in all four directions)");
	}
}
class rook implements chessplayer{
	public void moves(){
	System.out.println("up,down,left,right,diagonal");
	}
}
class pawns implements chessplayer{
	public void moves(){
	System.out.println("up,down,left,right");
	}
}