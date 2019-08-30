package com.bridgelabz.functional;

import java.io.*;
public class StringIO1 {

	

	public static void main(String[] args)
	{

	String[] arr1={"chicks","duck","turtle","dog"};
	String[] arr2={"chick","quack","nerp-nerp","bow wow"};
	String s3="";
	try
	{
	FileInputStream file=new FileInputStream("/home/admin1/Desktop/JavaProgram/JavaProgram/src/com/bridgelabz/functional/animnal");
	byte b[]=new byte [file.available()];
	file.read(b);
	String s=new String(b);


	for(int i=0;i<arr1.length;i++)
	{
	String s1=s.replace("%ANIMAL%",arr1[i]);
	String s2=s1.replace("%SOUND%",arr2[i]);
	s3=s3+s2;

	}


	for(int i=0;i<arr1.length;i++)
	{
	try
	{

	FileOutputStream f=new FileOutputStream("/home/admin1/Desktop/JavaProgram/JavaProgram/src/com/bridgelabz/functional/animnaloutput");
	byte b1[]=s3.getBytes();
	f.write(b1);
	f.close();

	}
	catch (Exception e)
	{
	e.printStackTrace();
	}

	}
	}
	catch (Exception e)
	{
	e.printStackTrace();
	}


	}
	}
