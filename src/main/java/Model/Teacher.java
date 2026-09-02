package Model;

import Model.Subject;

public class Teacher {
  private int Tid;
  private String nameString;
  private int Sub_ID; 
  private int batchId;
  
  public Teacher(int tid, String nameString, int sub_ID, int batchId) {
	super();
	this.Tid = tid;
	this.nameString = nameString;
	this.Sub_ID = sub_ID;
	this.batchId = batchId;
  }

  public Teacher() {
	
  }
  
  public int getTeacherId() {
	  return this.Tid;
  }
  
  public String getTeacherName() {
	  return this.nameString;
  }
  
//  public int getSubjectIdofTeacher(Subject subject) {
//	  return subject.getSubjectId();
//  }
//  
//  public int getBatchIdofTeacher(Batch batch) {
//	  //return 
//  }
  
  
  
  
  
}
