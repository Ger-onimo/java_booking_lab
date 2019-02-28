package com.example.bookingservice.repositories.customerRepositories;

import com.example.bookingservice.models.Customer;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Customer> getAllTheCustomersByCourseTown(String courseTown){
        List<Customer> result = null;
        Session session = entityManager.unwrap(Session.class);
        Criteria cr = session.createCriteria(Customer.class);
        cr.createAlias("courses", "coursesAlias");
        cr.add(Restrictions.eq("coursesAlias.courseTown", courseTown));
        result = cr.list();

        return result;
    }

}
