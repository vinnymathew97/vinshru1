package com.lti.daoimpl;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import com.lti.dao.ResultsDAO;
import com.lti.model.Results;
import com.lti.singletons.ConnectionManager;

public class ResultsDAOImpl implements ResultsDAO
{
	private Connection connection=ConnectionManager.getConnection();

	@Override
	public void addResults(Results r) 
	 {
		try 
		{
			CallableStatement call = connection.prepareCall("{?=call proctoreadid}");
			call.registerOutParameter(1, Types.INTEGER);
			call.execute();
			int idd =  call.getInt(1);
			System.out.println(idd);
			String sql = "insert into results values(?,?,?,?,?)";
			
			PreparedStatement ps =  connection.prepareStatement(sql);
			ps.setInt(1, idd);
			ps.setString(2, r.getFname());
			ps.setString(3, r.getLname());
			ps.setString(4, r.getCourse());
			ps.setString(5, r.getResult());
			
           int retval=ps.executeUpdate();
			
			if(retval==1)
			{
				
				System.out.println("Results added");
			}
		} 
		catch (SQLException e)
		{
			
			e.printStackTrace();
		}
		
			
	}

	@Override
	public void deleteResults(int rollno) 
	{
		String sql ="delete from Results where rollno=?";

		try{
			PreparedStatement statement  = connection.prepareStatement(sql);

		statement.setInt(1, rollno);
		int retval = statement.executeUpdate();
		if(retval == 1) {
			System.out.println("results deleted.");
		}
	}
		catch (SQLException e) {
		
			e.printStackTrace();
		}
		
	}

@Override
	public Results searchResults(int rollno) {
		
			Results r =null;
			String sql="select * from results where rollno=?";
			try {
				PreparedStatement ps =  connection.prepareStatement(sql);
				ps.setInt(1, rollno);
				
				ResultSet rs =  ps.executeQuery();
				while (rs.next())
				{
					 r = new Results(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
						
				}
			}
			 catch (SQLException e)
			 {
				e.printStackTrace();
		      }
			return r;
	}	
		
	@Override
	public List<Results> listByResult() {
		List <Results> resultlist =  new ArrayList<>();
		try{
			Statement statement  = connection.createStatement();
			String sql ="select * from results where result like 'fail'";
			ResultSet rs = statement.executeQuery(sql);
		while(rs.next()) {
			Results r = new Results(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
			resultlist.add(r);
			
		}
		
		}
		 catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return resultlist;
	}
	
}