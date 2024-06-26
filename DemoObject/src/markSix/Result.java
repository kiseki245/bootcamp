package markSix;

import java.time.LocalDate;
import java.util.Objects;

public class Result {

  private Ball[] balls;
  private LocalDate date;

  public Result(LocalDate date){
    balls = new Ball[6];
    this.date = date;
  }
  public LocalDate getDate(){
    return date;
  }

  //add Ball ball()
  @Override
  public boolean equals(Object obj){
    if (this == obj){
      return true;
    }
    if (!(obj  instanceof Result)){
      return false;
    }
    Result result = (Result) obj;

    return Objects.equals(this.date, result.getDate());
  }

  public static void main(String[] args) {
    Result r1 = new Result (LocalDate.of(2024, 6, 24));
    Result r2 = new Result (LocalDate.of(2024, 6, 24));
    System.out.println(r1.equals(r2));
  
  } 
  
}
