package com.display_train;

import java.util.List;

import com.search_train.dao.SearchTrainDAO;

public class DisplayTrainTest {
	public static void main(String[] args)throws Exception {
		
		
		SearchTrainDAO searchTrainDAO=new SearchTrainDAO();
		List<DisplayTrain> displayTrainList=searchTrainDAO.selectAll();
		System.out.println(displayTrainList.size());
		for(DisplayTrain displayTrainLists:displayTrainList) {
			System.out.println(displayTrainLists);
		}
	}

}

