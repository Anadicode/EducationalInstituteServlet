package Model;

public class Subject {
  private int subId;
  private String subNameString;
  
  public Subject(int subId, String subNameString) {
	
	this.subId = subId;
	this.subNameString = subNameString;
  }

  public Subject() {
	
  }
  
  
  
  
  public int getSubjectId() {
	  return this.subId;
  }
  
  public String getSubjectName() {
	  return this.subNameString;
  }
  
  
}
