package victor.training.oo.structural.adapter.domain;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@AllArgsConstructor
// Holy Domain Logic. 
// Very precious things that I want to keep agnostic to technical details
public class UserService {
	private final IUserRepository adapter;

	public void importUserFromLdap(String username) {
		List<User> list = adapter.search(username);
		if (list.size() != 1) {
			throw new IllegalArgumentException("There is no single user matching username " + username);
		}
		User user = list.get(0);

		if (user.getWorkEmail() != null) {
			log.debug("Send welcome email to " + user.getWorkEmail());
		}
		log.debug("Insert user in my database");
	}

	public List<User> searchUserInLdap(String username) {
		return adapter.search(username);
	}
}
