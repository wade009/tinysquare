package com.tinysquare.commons.mybatis.dialect;

public class MySQLDialect extends Dialect {

	/**
	 * @param sql
	 *            原始SQL查询语句
	 * @param offset
	 *            记录偏移量(开区间,如为5,则从第6条数据开始)
	 * @param limit
	 *            记录数
	 * @return 增加范围查询后的SQL语句
	 */
	@Override
	public String getLimitString(String sql, int offset, int limit) {
		// TODO Auto-generated method stub
		sql = sql.trim();
		StringBuffer pagingSelect = new StringBuffer(sql.length() + 100);
		pagingSelect.append(sql).append(" limit ").append(offset).append(",").append(limit);
		return pagingSelect.toString();
	}

}
