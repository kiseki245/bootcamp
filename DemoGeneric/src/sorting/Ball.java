package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ball implements Comparable<Ball>{
    private int number;
    private Color color;

    public Ball(int number, Color color){
      this.number = number;
      this.color = color;
    }
    public int getNumber(){
      return this.number;
    }
    public Color getColor(){
      return this.color;
    }

    @Override
    public int compareTo(Ball ball){
      //Objectives: provide your own formula to sort the List<Ball>
      // Return Value: 1 or -1

      // Example 1: sort by number (Descending)
      // You have 2 ball object reference here: ball and this
      // -1 means "move to left" (from left to right)
      // return this.number > ball.getNumber() ? -1 : 1; 
      
      // return this.color.getValue() < ball.color.getValue() ? -1 : 1; // Q1 

      if (this.color.getValue() < ball.color.getValue())
        return -1;
      if (this.color.equals(ball.color) && this.number < ball.getNumber())
        return -1;
        return 1;

    }
    public String toString(){
      return "Ball " + this.number + " - " + this.color;
    }
    
    public static void main(String[] args) {
      List<Ball> balls = new ArrayList<>();
      balls.add(new Ball(10, Color.BLACK));
      balls.add(new Ball(14, Color.WHITE));
      balls.add(new Ball(8, Color.RED));
    System.out.println(balls);
      //[Ball 10 - BLACK, Ball 14 - WHITE, Ball 8 - RED]

    //Sort
    //Collection.sort(balls) -> call loop List<Ball> -> ball.compare()
    Collections.sort(balls);
    System.out.println(balls);
    //[Ball 14 - WHITE, Ball 10 - BLACK, Ball 8 - RED]
    System.out.println(new Ball(10, Color.BLACK).compareTo(new Ball(14, Color.RED)));
    ;

    // List<Bird> birds = new ArrayList<>();
    // Collections.sort(birds); // error, Bird.class not implements the Comparable
    List<Ball> ballsex = new ArrayList<>();
    ballsex.add(new Ball(10, Color.BLACK)); //2
    ballsex.add(new Ball(10, Color.RED)); //1
    ballsex.add(new Ball(10, Color.WHITE)); //3
    Collections.sort(ballsex);
    System.out.println("Q1: " + ballsex);
      // Sort by color ? RED -> White -> Black
      // Sort by color, and then number ? RED -> WHITE -> BLACK, if same color larger number is left
      ballsex.add(new Ball(11, Color.RED)); //2
      ballsex.add(new Ball(12, Color.RED)); //1
      ballsex.add(new Ball(13, Color.RED)); //3
      ballsex.add(new Ball(11, Color.BLACK)); //2
      ballsex.add(new Ball(12, Color.BLACK)); //1
      ballsex.add(new Ball(13, Color.BLACK)); //3
      ballsex.add(new Ball(11, Color.WHITE)); //2
      ballsex.add(new Ball(12, Color.WHITE)); //1
      ballsex.add(new Ball(13, Color.WHITE)); //3
      Collections.sort(ballsex);
      System.out.println("Q2: " + ballsex);

      
      Collections.sort(balls, new BallSortByColor()); //Overloading, that is performing the method differs to line 67
      System.out.println("Comparator: "+ ballsex);
    }
  }
