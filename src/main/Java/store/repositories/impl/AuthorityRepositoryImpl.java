package store.repositories.impl;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import store.entities.Authority;
import store.entities.enums.AuthorityType;
import store.repositories.AuthorityRepository;

public class AuthorityRepositoryImpl implements AuthorityRepository {
    private SessionFactory sessionFactory;

    @Override
    public Authority findByName(AuthorityType name) {
        Query<Authority> query = sessionFactory.getCurrentSession().createQuery("from Authority a where  a.name=:name");
        query.setParameter("name", name);
        return query.uniqueResult();
    }
}
