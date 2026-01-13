int* spiralOrder(int** matrix, int matrixSize, int* matrixColSize, int* returnSize) {

        int* ans = (int*)malloc( sizeof(int) * ( (*matrixColSize) * matrixSize) );

        int k = 0;

        int m = matrixSize;
        int n = *matrixColSize;
        int UP = 0, RIGHT = 1, DOWN = 2, LEFT = 3;
        int direction = RIGHT;
 
        int UP_WALL = 0;
        int RIGHT_WALL = n;
        int DOWN_WALL = m;
        int LEFT_WALL = -1;
        *returnSize = m * n;

        int i = 0, j = 0;

        while (k < m * n) {
            if (direction == RIGHT) {
                while (j < RIGHT_WALL) {
                    ans[k++]= matrix[i][j];
                    j++;
                }
                i++;
                j--;
                RIGHT_WALL--;
                direction = DOWN;
            } else if (direction == DOWN) {
                while (i < DOWN_WALL) {
                    ans[k++]= matrix[i][j];
                    i++;
                }
                i--;
                j--;
                DOWN_WALL--;
                direction = LEFT;
            } else if (direction == LEFT) {
                while (j > LEFT_WALL) {
                    ans[k++]= matrix[i][j];
                    j--;
                }
                i--;
                j++;
                LEFT_WALL++;
                direction = UP;
            } else {
                while (i > UP_WALL) {
                    ans[k++]= matrix[i][j];
                    i--;
                }
                i++;
                j++;
                UP_WALL++;
                direction = RIGHT;
            }
        }

        return ans;
    
}