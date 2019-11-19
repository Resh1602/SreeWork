package com.homework;

import java.io.FileNotFoundException;
import java.io.IOException;

public class UserDataManagerImpl implements UserDataManager {

	public boolean saveUserDataToFile(UserDataModel userDataModel) {
		boolean result = false;
		if (userDataModel != null) {
			System.out.println("Inside UserDataManager and value is " + userDataModel.getTextFromUser());
			UserDataDao userDataDao = new UserDataDaoImpl();
			try {
				result = userDataDao.saveUserDataToFile(userDataModel);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}

	public String viewUserDataFromFile(UserDataModel userDataModel) throws IOException, ClassNotFoundException {
		String wText = null;
		if (userDataModel != null) {
			UserDataDao userDataDao = new UserDataDaoImpl();
			String text = userDataDao.viewUserDataFromFile(userDataDao);
			return text;
		} else
			return wText;
	}

}
