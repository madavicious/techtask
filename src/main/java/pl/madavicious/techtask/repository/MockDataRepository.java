package pl.madavicious.techtask.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestParam;
import pl.madavicious.techtask.entity.MockData;

import java.math.BigInteger;
import java.util.List;

public interface MockDataRepository extends JpaRepository<MockData, BigInteger>, MockDataRepositoryCustom {
    List<MockData> findAll();

//    @Query(value = "select * from tabela_testowa fst where (select count(*) from tabela_testowa snd where snd.kolumna1 = fst.kolumna1) :unique", nativeQuery = true)
//    @Query(value = "SELECT * FROM tabela_testowa WHERE :column IN (SELECT :column FROM tabela_testowa GROUP BY id HAVING COUNT(*) = 1)", nativeQuery = true)
//    List<MockData> findUnique(@Param("column") String column);

//    @Query(value = "SELECT * FROM tabela_testowa WHERE :column IN (SELECT :column tabela_testowa GROUP BY id HAVING COUNT(*) > 1)", nativeQuery = true)
//    List<MockData> findNonUnique(@Param("column") String column);
//
//    @Query(value = "select * from tabela_testowa fst where (select count(*) from tabela_testowa snd where snd.:#{#column} = fst.:#{#column}) = 1", nativeQuery = true)
//    List<MockData> findUnique(@Param("column") String column);


//    List<MockData> findUnique(@Param("column") String column);


//
//    @Query(value = "SELECT * FROM tabela_testowa WHERE :column in (SELECT :column FROM tabela_testowa GROUP BY :column HAVING COUNT(*) > 1)", nativeQuery = true)
//    List<MockData> findNonUnique(@Param("column") String column);

//    @Query("SELECT DISTINCT c.kolumna1 FROM MockData c")
//    List<MockData> uniqueKol1();
//
//    @Query("SELECT DISTINCT c.kolumna2 FROM MockData c")
//    List<MockData> uniqueKol2();
//
//    @Query("SELECT DISTINCT c.kolumna3 FROM MockData c")
//    List<MockData> uniqueKol3();
//
//    @Query("SELECT DISTINCT c.kolumna4 FROM MockData c")
//    List<MockData> uniqueKol4();
//
//    @Query("SELECT a.*\n" +
//            "FROM MockData a\n" +
//            "JOIN (SELECT kolumna1, kolumna2, kolumna3, kolumna4, COUNT(*)\n" +
//            "FROM MockData \n" +
//            "GROUP BY kolumna1\n" +
//            "HAVING count(*) > 1 ) b\n" +
//            "ON a.kolumna1 = b.kolumna1\n" +
//            "ORDER BY a.kolumna1")
//    List<MockData> notUnique1();
//
//    @Query("SELECT a.*\n" +
//            "FROM MockData a\n" +
//            "JOIN (SELECT kolumna1, kolumna2, kolumna3, kolumna4, COUNT(*)\n" +
//            "FROM MockData \n" +
//            "GROUP BY kolumna2\n" +
//            "HAVING count(*) > 1 ) b\n" +
//            "ON a.kolumna2 = b.kolumna2\n" +
//            "ORDER BY a.kolumna2")
//    List<MockData> notUnique2();
//
//    @Query("SELECT a.*\n" +
//            "FROM MockData a\n" +
//            "JOIN (SELECT kolumna1, kolumna2, kolumna3, kolumna4, COUNT(*)\n" +
//            "FROM MockData \n" +
//            "GROUP BY kolumna3\n" +
//            "HAVING count(*) > 1 ) b\n" +
//            "ON a.kolumna3 = b.kolumna3\n" +
//            "ORDER BY a.kolumna3")
//    List<MockData> notUnique3();
//
//    @Query("SELECT a.*\n" +
//            "FROM MockData a\n" +
//            "JOIN (SELECT kolumna1, kolumna2, kolumna3, kolumna4, COUNT(*)\n" +
//            "FROM MockData \n" +
//            "GROUP BY kolumna4\n" +
//            "HAVING count(*) > 1 ) b\n" +
//            "ON a.kolumna4 = b.kolumna4\n" +
//            "ORDER BY a.kolumna4")
//    List<MockData> notUnique4();
}