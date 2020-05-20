package dao;

import org.apache.ibatis.annotations.Param;

import entity.Appointment;

public interface AppointmentDao {
	//新增图书预约记录
	int insertAppointment(@Param("bookId") long bookId, @Param("studentId") long studentId);
	//查询图书预约记录
	Appointment queryByKeyWithBook(@Param("bookId") long bookId, @Param("studentId") long studentId);

	

}
