package com.homework;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface UserDataDao {
	
	public boolean saveUserDataToFile(UserDataModel userDataModel) throws IOException, ClassNotFoundException;

	public String viewUserDataFromFile(UserDataDao userDataDao) throws FileNotFoundException, IOException, ClassNotFoundException;

}
