package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import entity.Book;

public interface BookDao {
	//查询单本图书信息
	Book queryById(long id);
	//查询所有图书
	List<Book> queryAll(@Param("offset") int offset, @Param("limit") int limit);
	//减少馆藏数量
	int reduceNumber(long bookId);

}
