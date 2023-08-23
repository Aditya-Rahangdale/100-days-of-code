class Solution {
    public boolean isValidSudoku(char[][] board) {
         HashSet<Character>[] r = new HashSet[9];
        HashSet<Character>[] c= new HashSet[9];
        HashSet<Character>[] sub = new HashSet[9];
        
        for (int i = 0; i < 9; i++) {
            r[i] = new HashSet<>();
            c[i] = new HashSet<>();
            sub[i] = new HashSet<>();
        }
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char num = board[i][j];
                if (num != '.') {
                    if (r[i].contains(num) || c[j].contains(num) || sub[(i / 3) * 3 + j / 3].contains(num)) {
                        return false;
                    }
                    r[i].add(num);
                    c[j].add(num);
                    sub[(i / 3) * 3 + j / 3].add(num);
                }
            }
        }
        
        return true;
        
    }
}