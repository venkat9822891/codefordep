package bank.dao;

import javax.ejb.Local;

import bank.User;
import bank.dao.common.Dao;

@Local
public interface UserDao extends Dao<User> {

	User findByUsername(String username);

}
