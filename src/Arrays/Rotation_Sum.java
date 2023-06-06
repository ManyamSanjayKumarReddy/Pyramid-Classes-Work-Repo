package Arrays;
/*

#include <iostream>
using namespace std;

int main() {
    int r, c;
    cin>>r>>c; // input
    int A[r][c];
    for(int i =0; i<r; i++){
        for(int j =0; j<c;j++){
            cin>>A[i][j];
        }
    }

    int top=0, left=0, bottom= r-1, right = c-1;
    int prev, curr;
    while(top<bottom && left<right){
        if(top == bottom || left == right)break;
        prev = A[top + 1][left];
        // 1. basing on top
        for(int i = left; i <=right; i++){
            curr = A[top][i];
            A[top][i] = prev;
            prev = curr;
        }

        top++;
        // 2. basing on right
        for(int i = top; i <=bottom; i++){
            curr = A[i][right];
            A[i][right] = prev;
            prev = curr;
        }

        right--;
        // 3. basing on bottom
        for(int i = right; i >=left; i--){
            curr = A[bottom][i];
            A[bottom][i] = prev;
            prev = curr;
        }

        bottom--;
        // 4. basing on left
        for(int i = bottom; i >= top; i--){
            curr = A[i][left];
            A[i][left] = prev;
            prev = curr;
        }

        left++;
    }

    for(int i=0; i<r;i++){
        for(int j =0; j<c; j++){
            cout<<A[i][j]<<" ";
        }
         cout<<"\n";
    }


}
 */
public class Rotation_Sum {
}
