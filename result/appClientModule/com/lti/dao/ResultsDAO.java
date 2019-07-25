package com.lti.dao;


import java.util.List;

import com.lti.model.Results;

	
public interface ResultsDAO
{
  public void addResults(Results r);
  public void deleteResults(int rollno);
  public List<Results> listByResult();
public Results searchResults(int rollno);
  
}

