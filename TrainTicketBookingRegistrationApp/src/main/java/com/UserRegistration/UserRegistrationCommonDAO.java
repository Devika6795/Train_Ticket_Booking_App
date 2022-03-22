package com.UserRegistration;
		import java.sql.Connection;
		import java.sql.DriverManager;
		import java.sql.Statement;
		public class UserRegistrationCommonDAO{
			public void userRegistrationCommonDAO() throws Exception {
				//Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection =DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
				System.out.println(connection);
				String query="INSERT INTO train_ticket_booking_app_registration(full_name,email_id,PASSWORD,phone_number)VALUES('Anbazhagan','a02@gmail.com','2393458726','8888902346')";
				Statement statement=connection.createStatement();
				int rows=statement.executeUpdate(query);
				System.out.println("no of rows inserted:"+rows);
			}
					}
		


