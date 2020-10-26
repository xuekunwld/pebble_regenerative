package regenerative.clinic.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import regenerative.clinic.dao.DemoDao;

@Repository
public class DemoDaoImpl implements DemoDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	/**
	 * Insert処理
	 *
	 * @param target 入力データ
	 * @return Insert行数
	 */
	@Override
	public int add(String target) {

		int row =0 ;

		//Insert処理
		StringBuffer sb = new StringBuffer();
		sb.append("INSERT INTO `test` ");
		sb.append(" ( ");
		sb.append("  `test_col` ");
		sb.append(" ) ");
		sb.append(" VALUES ");
		sb.append(" ( ");
		sb.append("'" + target + "'");
		sb.append(" ) ");
		//sb.append(" ; ");

		row = jdbcTemplate.update(sb.toString());

		return row;
	}
}
