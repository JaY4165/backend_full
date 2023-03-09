package com.example.demo.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dto.RegistrationDto;
import com.example.demo.entity.UsersEntity;
import com.example.demo.exception.CommonException;
import com.example.demo.repository.RegistrationRepository;
import com.example.demo.response.ResponseClass;

@Service
public class RegistrationServiceImpl implements RegistrationServiceInterface {

	@Autowired
	RegistrationRepository Repo;

	@Override
	public ResponseClass register(RegistrationDto registerDto) {

		validate(registerDto);
		format(registerDto);
		UsersEntity entity = new UsersEntity();
		entity.setFirstname(registerDto.getFirstname());
		entity.setLastname(registerDto.getLastname());
		entity.setEmail(registerDto.getEmail());
		entity.setPassword(registerDto.getPassword());
		entity.setAddress(registerDto.getAddress());
		Repo.save(entity);

		ResponseClass ResponseClass = new ResponseClass();
		ResponseClass.setStatus(200);
		ResponseClass.setMessage("data saved successfully to DB");

		return ResponseClass;

	}

	public void validate(RegistrationDto registerDto) {
		if (registerDto.getEmail() == null || registerDto.getEmail().isEmpty()) {
			throw new CommonException(200, "Email is Empty");
		}
		if (registerDto.getPassword() == null || registerDto.getPassword().isEmpty()
				|| registerDto.getPassword().isBlank()) {
			throw new CommonException(200, "password is Empty");
		}
		if (registerDto.getFirstname().isEmpty() || registerDto.getFirstname() == null) {
			throw new CommonException(200, "Firstname is Empty");
		}
		if (registerDto.getLastname() == null || registerDto.getLastname().isEmpty()) {
			throw new CommonException(200, "lastname is Empty");
		}
		if (registerDto.getAddress() == null || registerDto.getAddress().isEmpty()) {
			throw new CommonException(200, "Address is Empty");
		}

	}

	public void format(RegistrationDto registerDto) {
		String emailPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
				+ "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";

		String passwordPattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";

		String namepattern = "^[A-Za-z]\\w{2,30}$";

		Pattern epattern = Pattern.compile(emailPattern);

		Matcher emailmatcher = epattern.matcher(registerDto.getEmail());
		if (!emailmatcher.matches()) {
			throw new CommonException(1400, "Email is not valid format");

		}

		Pattern ppattern = Pattern.compile(passwordPattern);

		Matcher passwordmatcher = ppattern.matcher(registerDto.getPassword());
		if (!passwordmatcher.matches()) {
			throw new CommonException(1400, "password is not valid format");

		}

		Pattern npattern = Pattern.compile(namepattern);

		Matcher firstnamematcher = npattern.matcher(registerDto.getFirstname());
		if (!firstnamematcher.matches()) {
			throw new CommonException(1400, "firstname is not valid format");

		}

		Matcher lastnamematcher = npattern.matcher(registerDto.getLastname());
		if (!lastnamematcher.matches()) {
			throw new CommonException(1400, "lastname is not valid format");

		}

	}

}