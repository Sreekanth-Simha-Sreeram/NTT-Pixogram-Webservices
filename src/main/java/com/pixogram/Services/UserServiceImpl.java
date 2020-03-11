package com.pixogram.Services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pixogram.Dao.UserDao;
import com.pixogram.model.Content;
import com.pixogram.model.FeedBack;
import com.pixogram.model.Followers;
import com.pixogram.model.User;

public class UserServiceImpl implements UserService {


	
	  @Transactional
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
		// TODO Auto-generated method stub
		return null;
	}
	  
	  @Transactional
	public boolean updateProfile(User user) {
		// TODO Auto-generated method stub
		return false;
	}
	  
	  @Transactional
	public boolean deleteProfile(int userId) {
		// TODO Auto-generated method stub
		return false;
	}

	  @Transactional
	public boolean addContent(List<Content> content, int userId) {
		// TODO Auto-generated method stub
		return false;
	}

	  @Transactional
	public List<Content> organizeImage(int userId, List<Content> content) {
		// TODO Auto-generated method stub
		return null;
	}

	  @Transactional
	public List<Content> organizeVideo(int userId, List<Content> content) {
		// TODO Auto-generated method stub
		return null;
	}

	  @Transactional
	public Content getContent(int contentId) {
		// TODO Auto-generated method stub
		return null;
	}

	  @Transactional
	public boolean updateContent(int userId, Content content) {
		// TODO Auto-generated method stub
		return false;
	}

	  @Transactional
	public boolean addComment(FeedBack feedback) {
		// TODO Auto-generated method stub
		return false;
	}

	  @Transactional
	public boolean followUser(int userId, int senderId) {
		// TODO Auto-generated method stub
		return false;
	}

	  @Transactional
	public List<Followers> followList(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	  @Transactional
	public boolean hideMedia(String imagePath, boolean visibility, String videoPath) {
		// TODO Auto-generated method stub
		return false;
	}

	  @Transactional
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	  @Transactional
	public List<Content> getContentByUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
