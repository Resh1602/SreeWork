package com.homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class UserDataDaoImpl implements UserDataDao {

	public boolean saveUserDataToFile(UserDataModel userDataModel){
		if(userDataModel !=null){
			FileOutputStream fop;
			try {
				fop = new FileOutputStream("Document.ser");
				ObjectOutputStream oos = new ObjectOutputStream(fop);
				oos.writeObject(userDataModel.getTextFromUser());
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return true;
		}
		else {
			return false;
		}		
	}

	public String viewUserDataFromFile(UserDataDao userDataDao) throws IOException, ClassNotFoundException {
		FileInputStream fip = new FileInputStream("Document.ser");
		ObjectInputStream ois = new ObjectInputStream(fip);
		String que = (String) ois.readObject();
		System.out.println(que);
		
		return que;
		
	}

}
