package com.canecaria.service;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import com.canecaria.dao.UserDaoImpl;
import com.canecaria.model.Address;
import com.canecaria.model.Login;
import com.canecaria.model.User;

public class UserService {

	private UserDaoImpl userDao;
	private List<String> messages;

	public UserService() {
		userDao = new UserDaoImpl();
		messages = new LinkedList<String>();
	}

	public User save(User user) throws Exception {
		if (!validateFields(user)) {
			throw new Exception();
		}
		
		user.getAddress().setOwner(user);
		user.getLogin().setOwner(user);
		user = userDao.save(user);
		if (user.getId() == null || user.getId() <= 0) {
			String message = "Desculpe, não foi possível realizar seu cadastro. Tente novamente mais tarde";
			throw new Exception(message);
		}
		
		return user;
	}
	
	private boolean validateFields(User user) {
		if (formatUsername(user) & isUsernameAvailable(user) & isValidPassword(user)
				& isValidConfirmPassword(user) & matchPassword(user) & isValidName(user) 
				& isValidBirthday(user) & isValidRG(user) & isValidCPF(user) 
				& isValidCEP(user) & isValidNumber(user) & isValidComplement(user)) {
			
			return true;
		}
		
		return false;
	}
	
	private boolean formatUsername(User user) {
		Login login = user.getLogin();
		String username = login.getUserName();
		username = username.trim();
		username = username.toLowerCase();
		login.setUserName(username);
		
		if (username == null || username.equals("")) {
			String message = "Campo login está vazio.";
			messages.add(message);
			return false;
		}
		
		return true;
	}

	private boolean matchPassword(User user) {
		Login login = user.getLogin();
		String password = login.getPassword();
		String confirmPassword = login.getConfirmPassword();
		
		if (!password.equals(confirmPassword)) {
			String message = "As senhas não conferem. Digite novamente";
			messages.add(message);
			return false;
		}
			
		return true;
	}
	
	private boolean isUsernameAvailable(User user) {
		Login login = user.getLogin();
		String username = login.getUserName();
		List<User> result = userDao.searchByUsername(username);
		
		if (result != null && result.size() >= 1) {
			String message = "O login \"" + username + "\" já sendo usado por outra pessoa.";
			messages.add(message);
			return false;
		}
		
		return true;
	}
	
	private boolean isValidPassword(User user) {
		Login login = user.getLogin();
		String password = login.getPassword();
		if (password == null || password.equals("")) {
			String message = "O campo \"Senha\" é obrigatório.";
			messages.add(message);
			return false;
		} else if (password.length() < 6) {
			String message = "Sua senha deve conter no mínimo 6 caracteres";
			messages.add(message);
			return false;
		}
		
		return true;
	}
	
	private boolean isValidConfirmPassword(User user) {
		Login login = user.getLogin();
		String confirmPassword = login.getConfirmPassword();
		if (confirmPassword == null || confirmPassword.equals("")) {
			String message = "O campo \"Confirmar senha\" é obrigatório.";
			messages.add(message);
			return false;
		}
		
		return true;
	}
	
	private boolean isValidName(User user) {
		String name = user.getName();
		if (name == null || name.equals("")) {
			String message = "O campo \"Nome\" é obrigatório.";
			messages.add(message);
			return false;
		}
		
		return true;
	}
	
	private boolean isValidBirthday(User user) {
		Date birthday = user.getBirthday();
		if (birthday == null) {
			String message = "O campo \"Nascimento\" é obrigatório.";
			messages.add(message);
			return false;
		}
		
		return true;
	}
	
	private boolean isValidRG(User user) {
		String rg = user.getRg();
		if (rg == null || rg.equals("")) {
			String message = "O campo \"RG\" é obrigatório.";
			messages.add(message);
			return false;
		}
		
		return true;
	}
	
	private boolean isValidCPF(User user) {
		String cpf = user.getCpf();
		if (cpf == null || cpf.equals("")) {
			String message = "O campo \"CPF\" é obrigatório.";
			messages.add(message);
			return false;
		}
		
		return true;
	}
	
	private boolean isValidCEP(User user) {
		Address address = user.getAddress();
		String cep = address.getCep();
		if (cep == null || cep.equals("")) {
			String message = "O campo \"CEP\" é obrigatório.";
			messages.add(message);
			return false;
		}
		
		return true;
	}
	
	private boolean isValidNumber(User user) {
		Address address = user.getAddress();
		String number = address.getNumber();
		if (number == null || number.equals("")) {
			String message = "O campo \"Número\" é obrigatório.";
			messages.add(message);
			return false;
		}
		
		return true;
	}
	
	private boolean isValidComplement(User user) {
		Address address = user.getAddress();
		String complement = address.getComplement();
		if (complement == null || complement.equals("")) {
			String message = "O campo \"Complemento\" é obrigatório.";
			messages.add(message);
			return false;
		}
		
		return true;
	}
	
	public List<String> getMessages() {
		return messages;
	}
}
