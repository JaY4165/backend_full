package com.example.demo.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.LoginDto;
import com.example.demo.entity.UsersEntity;
import com.example.demo.exception.CommonException;
import com.example.demo.repository.LoginRepository;
import com.example.demo.response.ResponseClass;

@Service
public class LoginServiceImpl implements LoginServiceInterface {
	
	@Autowired
	LoginRepository loginRepo;
	
	@Override
	public ResponseClass login(LoginDto loginDto) {
		
		  
		validate(loginDto);
		
		format(loginDto);

		UsersEntity entity = loginRepo.findByEmail(loginDto.getEmail());
		
		ResponseClass loginResponse= new ResponseClass();

		if(entity.getPassword().equals(loginDto.getPassword())) {
			loginResponse.setMessage("login successful");
			loginResponse.setStatus(200);
			loginResponse.setUserId(entity.getId());
		}
		else {
			loginResponse.setMessage("password doesn't match");
			loginResponse.setStatus(202);
		}
		return loginResponse;
	}
	
	
	public void validate(LoginDto loginDto) {
		if(loginDto.getEmail() == null || loginDto.getEmail().isEmpty()) {
			throw new CommonException(201, "Email is empty");
		}
		
		if(loginDto.getPassword() == null || loginDto.getPassword().isEmpty()) {
			throw new CommonException(201, "password is empty");
		}
		
		}
	 public void format(LoginDto loginDto) {
		 String emailPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"+ "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
		 String passwordPattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";

		

			Pattern epattern = Pattern.compile(emailPattern);

			Matcher emailmatcher = epattern.matcher(loginDto.getEmail());
			if (!emailmatcher.matches()) {
				throw new CommonException(400, "Email is not valid format");

			}

			Pattern ppattern = Pattern.compile(passwordPattern);

			Matcher passwordmatcher = ppattern.matcher(loginDto.getPassword());
			if (!passwordmatcher.matches()) {
				throw new CommonException(400, "password is not valid format");
			}
	 }
}
