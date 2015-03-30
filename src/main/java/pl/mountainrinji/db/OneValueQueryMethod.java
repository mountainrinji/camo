package pl.mountainrinji.db;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface OneValueQueryMethod {
	String queryName();
}
