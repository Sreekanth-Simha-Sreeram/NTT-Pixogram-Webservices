package com.pixogram.Dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pixogram.model.Content;
import com.pixogram.model.FeedBack;
import com.pixogram.model.Followers;
import com.pixogram.model.User;

public class UserDaoImpl implements UserDao {

	 
	public boolean register(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean login(String userName, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean resetPassword(String password) {
		// TODO Auto-generated method stub
		return false;
	}

	public User getProfile(int userId) {
		return null;
		// TODO Auto-generated method stub
		//User user = new User();
		//user.setUserEmail("dedhjw@gmail.com");
		//return user;
	}

	public boolean updateProfile(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteProfile(int userId) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean addContent(List<Content> content, int userId) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Content> organizeImage(int userId, List<Content> content) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Content> organizeVideo(int userId, List<Content> content) {
		// TODO Auto-generated method stub
		return null;
	}

	public Content getContent(int contentId) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updateContent(int userId, Content content) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean addComment(FeedBack feedback) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean followUser(int userId, int senderId) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Followers> followList(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean hideMedia(String imagePath, boolean visibility, String videoPath) {
		// TODO Auto-generated method stub
		return false;
	}

	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Content> getContentByUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
