package com.qa.InProject.DomainTest;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.qa.InProject.Business.service.UserService;
import com.qa.InProject.persistence.Domain.User;
import com.qa.InProject.persistence.Repository.UserRepository;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;


public class UserDomainTest {
	
	@Mock(name="userRepository")
    private UserRepository userRepo;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }
	
	@Test
	public void updateUser_WithValidInput_ShouldReturnUpdatedInput() {
	    Long userId = 1L;
	    String userName = "Name";
	    String userPassword = "Password";
	    
	 
	    User user = new User();
	    user.setUserName(userName);
	    user.setUserId(userId);
	    user.setUserPassword(userPassword);
	    
	    
	    assertEquals(userId, user.getUserId());
	    assertEquals(userName, user.getUserName());
	    assertEquals(userPassword, user.getUserPassword());
	    

	}
}
