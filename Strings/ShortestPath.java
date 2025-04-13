package Strings;
/* 
  Q> Given a route containing 4 directions(E,W,N,S)
  Find the SHORTEST PATH to reach destination
  "WNEENESENNN"
*/
public class ShortestPath {

  public static float getShortestPath(String path){
    int x = 0, y = 0;

    for(int i = 0; i < path.length();i++){
      char dir = path.charAt(i);
      //South
      if(dir == 'S'){
        y--;
      }
      //North
      else if(dir == 'N'){
        y++;
      }
      //West
      else if(dir == 'W'){
        x--;
      }
      //East
      else{
        x++;
      }
    }
    int X2 = x*x;
    int Y2 = y*y;
    return (float)Math.sqrt(X2+Y2);
  }
    public static void main(String[] args) {
        // String path =  "WNEENESENNN";
        // System.out.println(getShortestPath(path));
        // String s1 = "Tony";
        // String s2 = "Tony";
        // String s3 = new String("Tony");

        // if(s1 == s2){
        //   System.out.println("Strings are equal");
        // }else{
        //   System.out.println("Strings are not equal");
        // }

        // if(s1 == s3){
        //   System.out.println("Strings are equal");
        // }else{
        //   System.out.println("Strings are not equal");
        // }

        // if(s1.equals(s3)){
        //   System.out.println("Strings are equal");
        // }else{
        //   System.out.println("Strings are not equal");

        // }
    }
}
