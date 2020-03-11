package com.pixogram.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pixogram.Dao.UserDaoImpl;
import com.pixogram.Services.UserService;
import com.pixogram.model.Content;
import com.pixogram.model.FeedBack;
import com.pixogram.model.User;


public class PixogramRestController {
	
	
	
    public ResponseEntity<?> register(@RequestBody User user) {
		return null;
	   }
	  
		@PostMapping(value="{userName}/login/{password}")
		public ResponseEntity<?>  login(@PathVariable ("userName") int userName,@PathVariable("password") int password) {
			return null;
			
	   }
		
		
		public ResponseEntity<?>  resetPassword(@PathVariable ("password") String password) {
			return null;
			
	   }	
		 @GetMapping("/getProfile/{userId}")
	     public  ResponseEntity<User>  getProfile(@PathVariable  ("userId")int userId) {
			 //User user = new User();
			// user.setUserId(userId);
			 
		      return null;
			// TODO Auto-generated method stub
			
		}
		 
	
		public ResponseEntity<?> updateProfile(@RequestBody User user) {
				// TODO Auto-generated method stub
			return null;
		}
		 

		
			public ResponseEntity<?>deleteProfile(@PathVariable ("userId") int userId) {
				// TODO Auto-generated method stub
				return null;
				
			}
			//	boolean addContent(List<Content> content,int userId);

			public ResponseEntity<?>  addContent(@RequestBody List<Content>  content,@PathVariable("userId") int userId) {
				return null;
				
		}
				
		     public ResponseEntity<?> organizeImage(@RequestBody List<Content>  content,@PathVariable("userId") int userId){
				// TODO Auto-generated method stub
				return null;
			}	
				
				
			     public ResponseEntity<?> organizeVideo(@RequestBody List<Content>  content,@PathVariable("userId") int userId){
					// TODO Auto-generated method stub
					return null;
				}	
			//
			
		     public ResponseEntity<?> getContent(@PathVariable ("contentId") int contentId) {
				// TODO Auto-generated method stub
				return null;
			}	
			
				public ResponseEntity<?> updateContent(@RequestBody Content content,@PathVariable("userId") int userId) {
					// TODO Auto-generated method stub
					return null;
				}

				
				public ResponseEntity<?>  addComment(@RequestBody FeedBack feedback) {
					return null;
					}
				
				public ResponseEntity<?> followUser(@PathVariable ("userId") int userId,@PathVariable ("senderId") int senderId) {
					// TODO Auto-generated method stub
					return null;
				}
				
			     public ResponseEntity<?> followList(@PathVariable ("userId") int userId) {
					// TODO Auto-generated method stub
					return null;
				}
				 
				
					public ResponseEntity<?> hideMedia(@PathVariable ("imagePath") String imagePath,@PathVariable ("visibility") boolean visibility,@PathVariable ("videoPath")String videoPath) {
						// TODO Auto-generated method stub
						return null;
					}	
				
			     public ResponseEntity<?> getUserById(@PathVariable ("userId") int userId) {
					// TODO Auto-generated method stub
					return null;
				}
				 
			     public ResponseEntity<?> getContentByUser(@PathVariable ("userId") int userId) {
					// TODO Auto-generated method stub
					return null;
				}
				 
				
				
}

