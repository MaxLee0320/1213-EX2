package com.pccu.student;

import java.util.*;

public class IStudent {
	private String stuName;
	private int stuId;
	private int stuChscore;
	private int stuEnscore;
	private int stuMascore;
	
	public IStudent() {
		System.out.println("�п�J�T�����:");
		Scanner scan=new Scanner(System.in);
		System.out.println("�п�J�Ǹ�");
		setId(scan.nextInt());
		System.out.println("�п�J�W�r");
		setName(scan.next());
		System.out.println("�п�J��妨�Z");
		setChscore(scan.nextInt());
		System.out.println("�п�J�^�妨�Z");
		setEnscore(scan.nextInt());
		System.out.println("�п�J�ƾǦ��Z");
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

		System.out.println("�Ǹ��O:"+getId()+"�W�r�O:"+getName()+"���:"+getChscore()+"�^��"+getEnscore()+"�ƾ�"+getMascore()+"�����O:"+(getChscore()+getEnscore()+getMascore())/3);
	}
}
