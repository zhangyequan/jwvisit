package com.jw.jwvisit.service.impl;

import com.jw.jwvisit.dao.VisitDao;
import com.jw.jwvisit.model.visitinfo;
import com.jw.jwvisit.service.VisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VisitServiceImpl implements VisitService {

    @Autowired
    private VisitDao visitDao;

    @Override
    public void createVisit(visitinfo visitinfo) {

        visitDao.create(visitinfo);
    }
}
