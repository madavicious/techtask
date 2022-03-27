package pl.madavicious.techtask.repository;

import pl.madavicious.techtask.entity.MockData;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.*;
import java.util.List;


public class MockDataRepositoryImpl implements MockDataRepositoryCustom {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<MockData> findUnique(String column) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<MockData> query = cb.createQuery(MockData.class);
        Root<MockData> mockData = query.from(MockData.class);

        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public List<MockData> findNonUnique(String column) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<MockData> query = cb.createQuery(MockData.class);
        Root<MockData> mockData = query.from(MockData.class);

        return entityManager.createQuery(query).getResultList();
    }
}
