package entities;

import java.util.*;

public class School {
	private String name;
	
	private int numOfStudents;
			
	private boolean housed;
	
	private  ArrayList<String> houseNames ;
	
	private  Vector<String>  studentNames; 
	
	private  Vector<String> professorNames;
	
	private  ArrayList<String> courseNames;


public School(String newname){
	name=newname;
	houseNames = new ArrayList<String>();
	
	studentNames=new Vector<String>();
			
	professorNames=new Vector<String>();
	
	courseNames=new ArrayList<String>();
	numOfStudents=0;
	housed=false;
	
	}
String get_name(){
	return name;
	}

void set_name(String newname){
	name = newname;
	
	}

	int get_numOfStudents(){
		return numOfStudents;
	}
	
	void set_numOfStudents(int new_numOfStudents){
		numOfStudents = new_numOfStudents;
		
		}
	boolean get_housed(){
		return housed;
		}
	void set_housed(boolean newStatOf_housed){
		housed = newStatOf_housed;
		
	}
	
	ArrayList<String> get_houseNames(){
		return houseNames;
		}
	void set_houseNames(ArrayList<String> new_houseNames){
		houseNames = new_houseNames;
	}
	Vector<String> get_studentNames(){
		return studentNames;
	}
	void set_studentNames(Vector<String> new_studentNames){
		studentNames=new_studentNames;
		
	}
	Vector<String> get_professorNames(){
		return professorNames;
	}
	void set_professorNames(Vector<String> new_professorNames){
		professorNames=new_professorNames;
	}
	ArrayList<String> get_courseNames(){
		return courseNames;
	}
	void set_courseNames(ArrayList<String> new_courseNames){
		courseNames=new_courseNames;
	}
}




















