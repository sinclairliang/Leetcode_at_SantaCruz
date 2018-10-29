class Solution {
    public boolean exist(char[][] board, String word) 
    {
        if(board.length==0)
        {
            // da;
            return false;
        }

        for(int i=0; i<board[0].length; i++)
        {
            for(int j=0; j<board.length; j++)
            {
                if(search(board, word, 0, i, j))
                {
                    return true;
                }
            }
        }
        return false; 
    }
    
    
    private boolean search(char[][] board, String word, int index, int x, int y)
    {

        char[] word_char = word.toCharArray(); // convert word to char array;

        if(x<0 || x==board[0].length || y<0 || y==board.length || word_char[index] != board[y][x])
        {
            // return false when out of bounds;
            return false;
        }
        
        if(index == word.length() - 1)
        {
            // finished all the characters in the word;
            return true;
        }
        
        char cur = board[y][x];
        board[y][x] = 0;
        
        // recursively go to all directions;
        boolean found = search(board, word, index+1, x+1, y) 
            || search(board, word, index+1, x-1, y) 
            || search(board, word, index+1, x, y+1) 
            || search(board, word, index+1, x, y-1);
        
        board[y][x] = cur;
        return found;
        
    }
}