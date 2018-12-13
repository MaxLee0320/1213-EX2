package com.pccu.student;

import java.util.*;

public class IStudent {
	private String stuName;
	private int stuId;
	private int stuChscore;
	private int stuEnscore;
	private int stuMascore;
	
	public IStudent() {
		System.out.println("請輸入三筆資料:");
		Scanner scan=new Scanner(System.in);
		System.out.println("請輸入學號");
		setId(scan.nextInt());
		System.out.println("請輸入名字");
		setName(scan.next());
		System.out.println("請輸入國文成績");
		setChscore(scan.nextInt());
		System.out.println("請輸入英文成績");
		setEnscore(scan.nextInt());
		System.out.println("請輸入數學成績");
		setMascore(scan.nextInt());
	}
	public void setName(String name)
	{
	 stuName=name;
	}
	String getName() {
		return stuName;
	}	
	public void setId(int id) {
		stuId=id;
	}
	public int getId() {
		return stuId;
	}	
	public void setChscore(int ch) {
		stuChscore=ch;
	}
	public int getChscore() {
		return stuChscore;
	}
	public void setEnscore(int en) {
		stuEnscore=en;
	}
	public int getEnscore() {
		return stuEnscore;
	}
	public void setMascore(int ma) {
		stuMascore=ma;
	}
	public int getMascore() {
		return stuMascore;
	}
	public int getAverge() {
		return (getChscore()+getEnscore()+getMascore())/3;
	}
	public void print() {

		System.out.println("學號是:"+getId()+"名字是:"+getName()+"國文:"+getChscore()+"英文"+getEnscore()+"數學"+getMascore()+"平均是:"+(getChscore()+getEnscore()+getMascore())/3);
	}
}
