class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        var row = Array(9){BooleanArray(9)}
        var col  = Array(9){BooleanArray(9)}
        var boxes = Array(9){BooleanArray(9)}
        for(i in board.indices){
            for(j in board[0].indices){
                if(board[i][j] == '.') continue

                val digit = board[i][j] - '1'
                val box = (i/3) * 3 + (j/3)

                if(row[i][digit] || col[j][digit] || boxes[box][digit] ){
                    return false
                }

                row[i][digit] = true
                col[j][digit] = true
                boxes[box][digit] = true

            }
        }

        return true
    }
}
