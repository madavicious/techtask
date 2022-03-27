package pl.madavicious.techtask.repository;

import org.springframework.data.repository.query.Param;
import pl.madavicious.techtask.entity.MockData;

import java.util.List;

public interface MockDataRepositoryCustom {
    List<MockData> findUnique(@Param("column") String column);
    List<MockData> findNonUnique(@Param("column") String column);
}
