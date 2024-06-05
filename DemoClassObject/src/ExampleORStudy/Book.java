package ExampleORStudy;
public class Book {
  private String type;
  private int number;
  private boolean sold; // just for fun :P
  private String publishdate;
  private String aurthor;


  public void setType(String type){
  this.type = type;
  }

  public String getType(){
    return this.type;
  }

  public void setNumber(int number){
    this.number = number;

  }

  public int getNumber(){
    return this.number;
  }

  public void setSold(boolean r){
    this.sold = r;
  }

  public boolean getSold(){
    String name = this.type;
    if (name.contains("(Sold)")){
      return true;
    } else {
      return false;
    }
  }

    public String getAurthor(){
      return this.aurthor;
    }
    public void setAurthor(String aurthor){
      this.aurthor = aurthor;
    }
  }

