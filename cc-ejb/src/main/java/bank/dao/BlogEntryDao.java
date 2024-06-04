package bank.dao;

import java.util.List;

import javax.ejb.Local;

import bank.BlogEntry;
import bank.dao.common.Dao;

@Local
public interface BlogEntryDao extends Dao<BlogEntry> {

	List<BlogEntry> find(int maxresults, int firstresult);

	Long count();

}
