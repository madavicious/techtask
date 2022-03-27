package pl.madavicious.techtask.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.madavicious.techtask.entity.MockData;
import pl.madavicious.techtask.repository.MockDataRepository;

import java.util.List;



@RestController
@RequestMapping("/api")
public class MainController {

    @Autowired
    MockDataRepository mockDataRepository;

    @GetMapping("/mock_data")
    public ResponseEntity<List<MockData>> getAllMockData() {
        try {
            List<MockData> mockDataList = mockDataRepository.findAll();

            return new ResponseEntity<>(mockDataList, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/mock_data/{column}")
    public ResponseEntity<List<MockData>> getColumnValues(@PathVariable String column, @RequestParam String unique) {
        if (unique.equals("true")) {
            try {
                List<MockData> uniqueMockDataList = mockDataRepository.findUnique(column);
                System.out.println(uniqueMockDataList);
                return new ResponseEntity<>(uniqueMockDataList, HttpStatus.OK);
            } catch (Exception e) {
                return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
            }
//            return null; //zwrucic mockdata tablice i jeszcze tablice 2d array list z koordynatami
        }

        try {
            List<MockData> nonUniqueMockDataList = mockDataRepository.findNonUnique(column);
            System.out.println(nonUniqueMockDataList);
            return new ResponseEntity<>(nonUniqueMockDataList, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}


//            List<MockData> uniqueList;
//            switch (column) {
//                case kolumna1:
//                    uniqueList = mockDataRepository.uniqueKol1();
//                case kolumna2:
//                    uniqueList = mockDataRepository.uniqueKol2();
//                case kolumna3:
//                    uniqueList = mockDataRepository.uniqueKol3();
//                case kolumna4:
//                    uniqueList = mockDataRepository.uniqueKol4();
//                break;
//                return uniqueList;
//
//                default:
//                    throw new IllegalStateException("Unexpected value: " + column);