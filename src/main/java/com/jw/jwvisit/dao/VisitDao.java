package com.jw.jwvisit.dao;


import com.jw.jwvisit.model.visitinfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
@Repository
public interface VisitDao {
	void createvisit(visitinfo visitinfo);
}
