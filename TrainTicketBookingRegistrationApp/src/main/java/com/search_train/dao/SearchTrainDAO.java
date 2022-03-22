package com.search_train.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.display_train.DisplayTrain;


public class SearchTrainDAO {
	public List<DisplayTrain> selectAll()throws Exception
	{
		List<DisplayTrain> displayTrainList=new ArrayList<DisplayTrain>();
		Connection connection=DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
		System.out.println(connection);
		String query="SELECT*FROM  Train_ticket_booking_app_display";
		System.out.println(query);
		Statement statement=connection.createStatement();
		ResultSet rs=statement.executeQuery(query);
		while(rs.next())
		{
			Integer id=rs.getInt("train_id");
			String trainName=rs.getString("train_name");
			String trainFrom=rs.getString("train_from");
			String trainTo=rs.getString("train_to");
			String trainDate=rs.getString("train_date");
			String trainTiming=rs.getString("train_timing");
			
			DisplayTrain trainObj=new DisplayTrain(id,trainName,trainFrom,trainTo,trainTiming);
			 displayTrainList.add(trainObj);			
			
		}

		
		//System.out.println("no of rows selected"+rows);
		connection.close();
		return displayTrainList;
		
	}
}
