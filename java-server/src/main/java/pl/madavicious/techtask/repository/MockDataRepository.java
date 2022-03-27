package pl.madavicious.techtask.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pl.madavicious.techtask.entity.MockData;

import java.math.BigInteger;
import java.util.List;

public interface MockDataRepository extends JpaRepository<MockData, BigInteger> {
    List<MockData> findAll();

    @Query(value = "select * from tabela_testowa fst where (select count(*) from tabela_testowa snd where snd.kolumna1 = fst.kolumna1) = 1", nativeQuery = true)
    List<MockData> findUnique1();

    @Query(value = "select * from tabela_testowa fst where (select count(*) from tabela_testowa snd where snd.kolumna1 = fst.kolumna1) > 1", nativeQuery = true)
    List<MockData> findNonUnique1();

    @Query(value = "select * from tabela_testowa fst where (select count(*) from tabela_testowa snd where snd.kolumna2 = fst.kolumna2) = 1", nativeQuery = true)
    List<MockData> findUnique2();

    @Query(value = "select * from tabela_testowa fst where (select count(*) from tabela_testowa snd where snd.kolumna2 = fst.kolumna2) > 1", nativeQuery = true)
    List<MockData> findNonUnique2();

    @Query(value = "select * from tabela_testowa fst where (select count(*) from tabela_testowa snd where snd.kolumna3 = fst.kolumna3) = 1", nativeQuery = true)
    List<MockData> findUnique3();

    @Query(value = "select * from tabela_testowa fst where (select count(*) from tabela_testowa snd where snd.kolumna3 = fst.kolumna3) > 1", nativeQuery = true)
    List<MockData> findNonUnique3();

    @Query(value = "select * from tabela_testowa fst where (select count(*) from tabela_testowa snd where snd.kolumna4 = fst.kolumna4) = 1", nativeQuery = true)
    List<MockData> findUnique4();

    @Query(value = "select * from tabela_testowa fst where (select count(*) from tabela_testowa snd where snd.kolumna4 = fst.kolumna4) > 1", nativeQuery = true)
    List<MockData> findNonUnique4();
}