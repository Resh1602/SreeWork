package com.homework;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface UserDataManager {
	
	boolean saveUserDataToFile (UserDataModel userDataModel);

	String viewUserDataFromFile(UserDataModel userDataModel) throws FileNotFoundException, IOException, ClassNotFoundException;

}
