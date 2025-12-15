
/**
 * Write a description of class arrays6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class arrays6
{
    public static void main(String[]args){
      int height = 480, width = 640;
      int [][] image = new int[height][width];//image[y][x]
      // invert image
      for (int y =0; y < height; y++) {
          for (int x = 0; x < width; x++) {
              image[y][x] = 255 - image[y][x];
          }
      }
}
}