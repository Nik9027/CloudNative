package com.projectName.moduleName.starterKit.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "MyDocument")
public class MongoSampleModel {

	@Id
	private String uniqueID;
	
	private String myValue;
	
	public String getUniqueID() {
		return uniqueID;
	}
	public void setUniqueID(String uniqueID) {
		this.uniqueID = uniqueID;
	}
	public String getMyValue() {
		return myValue;
	}
	public void setMyValue(String myValue) {
		this.myValue = myValue;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((myValue == null) ? 0 : myValue.hashCode());
		result = prime * result + ((uniqueID == null) ? 0 : uniqueID.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MongoSampleModel other = (MongoSampleModel) obj;
		if (myValue == null) {
			if (other.myValue != null)
				return false;
		} else if (!myValue.equals(other.myValue))
			return false;
		if (uniqueID == null) {
			if (other.uniqueID != null)
				return false;
		} else if (!uniqueID.equals(other.uniqueID))
			return false;
		return true;
	}
	
	
}
