package bank;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(BlogEntry.class)
public abstract class BlogEntry_ extends bank.common.AbstractEntity_ {

	public static volatile ListAttribute<BlogEntry, Comment> comments;
	public static volatile SingularAttribute<BlogEntry, User> author;
	public static volatile SingularAttribute<BlogEntry, Date> created;
	public static volatile SingularAttribute<BlogEntry, String> title;
	public static volatile SingularAttribute<BlogEntry, String> content;

}

