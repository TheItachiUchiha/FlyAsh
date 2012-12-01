package com.fnz.main;

import com.fnz.dao.DBInteraction;


public class Call
{
	public static void main(String args[])
	{
		DBInteraction createDB = new DBInteraction();
		try
		{
			createDB.createDB();
			createDB.insertRawMaterials("Sand");
			System.out.println(createDB.fetchRawMaterials());
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
