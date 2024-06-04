package bank;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Comment.class)
public abstract class Comment_ extends bank.common.AbstractEntity_ {

	public static volatile SingularAttribute<Comment, User> author;
	public static volatile SingularAttribute<Comment, Date> created;
	public static volatile SingularAttribute<Comment, BlogEntry> blogEntry;
	public static volatile SingularAttribute<Comment, String> content;

}

