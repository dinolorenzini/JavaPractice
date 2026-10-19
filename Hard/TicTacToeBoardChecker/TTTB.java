public class TTTB
{
    public static String checkBoard(char[][] board)
    {

    }

    public static void main(String[] args)
    {
        if(checkBoard(new char[][]{
            {'X','X','X'},
            {'O',' ','O'},
            {' ',' ',' '}
        }).equals("X wins"))
            System.out.println("correct");
        else
            System.out.println("incorrect");

        if(checkBoard(new char[][]{
            {'O','X',' '},
            {'O','X',' '},
            {'O',' ','X'}
        }).equals("O wins"))
            System.out.println("correct");
        else
            System.out.println("incorrect");

        if(checkBoard(new char[][]{
            {'X','O',' '},
            {'O','X',' '},
            {' ',' ','X'}
        }).equals("X wins"))
            System.out.println("correct");
        else
            System.out.println("incorrect");

        if(checkBoard(new char[][]{
            {'X','X','O'},
            {'X','O','X'},
            {'O',' ',' '}
        }).equals("O wins"))
            System.out.println("correct");
        else
            System.out.println("incorrect");

        if(checkBoard(new char[][]{
            {'X','O','X'},
            {'O','X','O'},
            {'O','X','O'}
        }).equals("No winner"))
            System.out.println("correct");
        else
            System.out.println("incorrect");
    }
}
