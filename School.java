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


public School(String new_name){
	name=new_name;
	houseNames = new ArrayList<String>();
	
	studentNames=new Vector<String>();
			
	professorNames=new Vector<String>();
	
	courseNames=new ArrayList<String>();
	numOfStudents=0;
	housed=false;
	
	}
public School(String new_name,int new_numOfStudents,boolean new_housed,ArrayList<String> new_houseNames, 
		Vector<String>  new_studentNames,Vector<String> new_professorNames,ArrayList<String> new_courseNames){
	name=new_name;
	
	numOfStudents=new_numOfStudents;
	
	housed=new_housed;
	
	houseNames=new_houseNames;
	
	studentNames=new_studentNames;
	
	professorNames=new_professorNames;
	
	courseNames=new_courseNames;
}
	public String get_name(){
	return name;
	}

	public void set_name(String newname){
	name = newname;
	
	}

public	int get_numOfStudents(){
		return numOfStudents;
	}
	
public	void set_numOfStudents(int new_numOfStudents){
		numOfStudents = new_numOfStudents;
		
		}
	public	boolean get_housed(){
		return housed;
		}
	public	void set_housed(boolean newStatOf_housed){
		housed = newStatOf_housed;
		
	}
	
public ArrayList<String> get_houseNames(){
		return houseNames;
		}
public void set_houseNames(ArrayList<String> new_houseNames){
		houseNames = new_houseNames;
	}
	public Vector<String> get_studentNames(){
		return studentNames;
	}
	public void set_studentNames(Vector<String> new_studentNames){
		studentNames=new_studentNames;
		
	}
public	Vector<String> get_professorNames(){
		return professorNames;
	}
public	void set_professorNames(Vector<String> new_professorNames){
		professorNames=new_professorNames;
	}
	public	ArrayList<String> get_courseNames(){
		return courseNames;
	}
	public	void set_courseNames(ArrayList<String> new_courseNames){
		courseNames=new_courseNames;
	}
public void Add_houseNames(String houseName ){
	houseNames.add(houseName);
	}
public void Add_studentNames(String studentName){
	studentNames.add(studentName);
	numOfStudents=numOfStudents+1;
	}
	public void Add_professorNames(String professorName){
	professorNames.add(professorName);
	}
	public void Add_courseNames(String courseName){
	courseNames.add(courseName);
	}
}




















