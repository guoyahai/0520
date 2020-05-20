package service;

import java.util.List;

import dto.AppointExecution;
import entity.Book;

public interface BookService {
	//查询某本图书详情
	Book getById(long bookId);
	//查询所有图书信息
	List<Book> getList();
	//预约图书
	AppointExecution appoint(long bookId, long studentId);
}
