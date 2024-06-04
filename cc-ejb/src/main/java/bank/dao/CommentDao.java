package bank.dao;

import java.util.List;

import javax.ejb.Local;

import bank.BlogEntry;
import bank.Comment;
import bank.dao.common.Dao;

@Local
public interface CommentDao extends Dao<Comment> {

	List<Comment> findComments(BlogEntry blogEntry);

}
