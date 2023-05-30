package Day_1;/*
 L
 Dimension of photo -- W * H
  IF W || H < L -- You Need to Upload Another One
  IF W and H > L
         are Same -- Image is Accepted
         else crop it
 */

public class PyramidClasses {
    public static void main(String[] args){

        int L = 180;
        int W = 480;
        int H = 640;

        if (W <= L || H <= L){
            System.out.println("You Need to Upload Another One");
        }
        if (W >= L & H >= L){
            if (W == L){
                System.out.println("Image Accepted");
            }
            else System.out.println("Oops! Crop It");

        }
    }
}



