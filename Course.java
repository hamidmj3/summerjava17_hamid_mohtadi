package entities;

import java.util.*;

public class Course {
	private String name;
	
	private char minGrade; 
	
	private String professorName; 
	
	private int year; 
	
	private Vector<String> studentNames;

public Course(String newname){
	name=newname;
	minGrade='O';
	professorName="unknown";
	year=0;
	studentNames=new Vector<String>();
	
		}
public Course(String newname,char new_minGrade,String new_professorName,
		int new_year,Vector<String> new_studentNames ){
	name=newname;
	minGrade=new_minGrade;
	professorName=new_professorName;
	year=new_year;
	studentNames=new_studentNames;
		}
	public String get_name(){
	return name;
	}
	public void set_name(String new_name){
	name=new_name;
	}
public char get_minGrade(){
	return minGrade;
		}
public void set_minGrade(char new_minGrade){
	minGrade=new_minGrade;
		}
	public String professorName(){
		return professorName;
	}
	public void set_professorName(String new_professorName){
		professorName=new_professorName;
	}
public int get_year(){
	return year;
	}	
public void set_year(int new_year){
	year=new_year;
	}
	public Vector<String> get_studentNames(){
		return studentNames;
		}
	public void set_studentNames(Vector<String> new_studentNames){
		studentNames=new_studentNames;
		}
	
}







