package com.smallchill.test.beetlsql;

import java.util.List;
import java.util.Map;

import org.beetl.sql.core.ClasspathLoader;
import org.beetl.sql.core.DefaultNameConversion;
import org.beetl.sql.core.Interceptor;
import org.beetl.sql.core.SQLLoader;
import org.beetl.sql.core.SQLManager;
import org.beetl.sql.core.db.MySqlStyle;
import org.junit.Test;

import com.smallchill.core.beetl.ReportInterceptor;

@SuppressWarnings("rawtypes")
public class BeetlTest {

	@Test
	public void test() {

		List<Map> list = getSqlManager().execute("select 'test' t from dual", Map.class, null);
		System.out.println(list);

	}

	public SQLManager getSqlManager() {
		MySqlStyle style = new MySqlStyle();
		MySqlConnection cs = new MySqlConnection();
		SQLLoader loader = new ClasspathLoader("/beetlsql");
		SQLManager sql = new SQLManager(style, loader, cs, new DefaultNameConversion(), new Interceptor[] { new ReportInterceptor() });
		sql.getSqlLoader().setCharset("UTF-8");
		sql.getSqlLoader().setAutoCheck(true);
		return sql;
	}

}
