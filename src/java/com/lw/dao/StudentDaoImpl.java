package com.lw.dao;

import com.lw.enetity.Student;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Repository("studentDao")
public class StudentDaoImpl implements StudentDao {
   @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Student> findByParams() {
        StringBuilder sb = new StringBuilder();
        sb.append("from Student");
        Query query = this.sessionFactory.getCurrentSession().createQuery(sb.toString());
        List<Student> list = query.list();
        return list;
    }
}
