package entities;



import java.util.*;

public class Person {
	private String name;
	
	private String houseName; 
	
	private String bloodStatus;
	
	private String school;
	
	private Date birthday;


public Person(String new_name){
	name=new_name;
	houseName="unknown";
	bloodStatus="unknown";
	school="unknown";
	birthday= new Date(0-0-0);
	}
public Person(String new_name,String new_houseName,
		String new_bloodStutus,String new_School,Date new_birthday){
	name=new_name;
	houseName=new_houseName;
	bloodStatus=new_bloodStutus;
	school=new_School;
	birthday=new_birthday;
	}
	public String get_name(){
		return name;
		}
	public void set_name(String new_name){
		name=new_name;
		}
public String get_houseName(){
	return houseName;
	}
public void set_houseName(String new_houseName){
	houseName=new_houseName;
	}
	public String get_bloodStatus(){
		return bloodStatus;
		}
	public void set_bloodStatus(String new_bloodStatus){
		bloodStatus=new_bloodStatus;
		}
public String get_school(){
	return school;
	}
public void set_school(String new_school){
	school=new_school;
	}
	public Date get_birthday(){
		return birthday;
		}
	public void set_birthday(Date new_birthday){
		birthday=new_birthday;
		}
}









