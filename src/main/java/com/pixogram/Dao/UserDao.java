package com.pixogram.Dao;

import java.util.List;

import com.pixogram.model.Content;
import com.pixogram.model.FeedBack;
import com.pixogram.model.Followers;
import com.pixogram.model.User;



public interface UserDao {
	boolean register(User user);
	boolean login(String userName,String password);
	boolean resetPassword(String password);
	User getProfile(int userId);
	boolean updateProfile(User user);
	boolean deleteProfile(int userId);
	boolean addContent(List<Content> content,int userId);
	List<Content> organizeImage(int userId,List<Content>content);
	List<Content> organizeVideo(int userId,List<Content>content);
	Content getContent(int contentId);
	boolean updateContent(int userId,Content content);
	boolean addComment(FeedBack feedback);
	boolean followUser(int userId,int senderId);
	List<Followers>followList(int userId);
	boolean  hideMedia(String imagePath,boolean visibility,String videoPath);
    User getUserById(int userId);
    List<Content> getContentByUser(int userId);
}
