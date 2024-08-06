import java.sql.Array;
import java.util.*;

public class Ball implements Comparable<Ball>{
    private int number;
    private Size size;

    public Ball(int number, Size size){
        this.number = number;
        this.size = size;
    }
    @Override
    public int compareTo(Ball ball){
        if (this.size == Size.S && this.number < ball.number)
            return -1;
        if (this.size == Size.M && ball.size == Size.L)
            return -1;
        if (this.size == ball.size && this.number < ball.number)
            return -1;
        return 1;
    }
    @Override
    public String toString(){
        return "Ball " + this.number + " " + this.size;
    }
    public static void main(String[] args) {
        Ball ballsA = new Ball(122, Size.L);
        Ball ballsB = new Ball(136, Size.M);
        Ball ballsC = new Ball(14, Size.S);
        Ball ballsD = new Ball(121, Size.L);
        Ball ballsE = new Ball(135, Size.M);
        Ball ballsF = new Ball(17, Size.S);
        List<Ball> balllist = new ArrayList<>();
        balllist.add(ballsA);
        balllist.add(ballsB);
        balllist.add(ballsC);
        balllist.add(ballsD);
        balllist.add(ballsE);
        balllist.add(ballsF);
        Collections.sort(balllist);
        System.out.println(balllist);

        PriorityQueue<Ball> ballQueue = new PriorityQueue<>();
        ballQueue.add(ballsA);
        ballQueue.add(ballsB);
        ballQueue.add(ballsC);
        ballQueue.add(ballsD);
        ballQueue.add(ballsE);
        ballQueue.add(ballsF);
        System.out.println("Ball Queue" + ballQueue);

    }
}
