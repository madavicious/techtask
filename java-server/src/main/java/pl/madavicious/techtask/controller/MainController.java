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
            if (column.equals("kolumna1")) {
                try {
                    List<MockData> uniqueMockDataList1 = mockDataRepository.findUnique1();
                    System.out.println(uniqueMockDataList1);
                    return new ResponseEntity<>(uniqueMockDataList1, HttpStatus.OK);
                } catch (Exception e) {
                    return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
                }
            } else if (column.equals("kolumna2")) {
                try {
                    List<MockData> uniqueMockDataList2 = mockDataRepository.findUnique2();
                    System.out.println(uniqueMockDataList2);
                    return new ResponseEntity<>(uniqueMockDataList2, HttpStatus.OK);
                } catch (Exception e) {
                    return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
                }
            } else if (column.equals("kolumna3")) {
                try {
                    List<MockData> uniqueMockDataList3 = mockDataRepository.findUnique3();
                    System.out.println(uniqueMockDataList3);
                    return new ResponseEntity<>(uniqueMockDataList3, HttpStatus.OK);
                } catch (Exception e) {
                    return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
                }
            } else if (column.equals("kolumna4")) {
                try {
                    List<MockData> uniqueMockDataList4 = mockDataRepository.findUnique4();
                    System.out.println(uniqueMockDataList4);
                    return new ResponseEntity<>(uniqueMockDataList4, HttpStatus.OK);
                } catch (Exception e) {
                    return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else if (unique.equals("false")) {
            if(column.equals("kolumna1")) {
                try {
                    List<MockData> nonUniqueMockDataList1 = mockDataRepository.findNonUnique1();
                    System.out.println(nonUniqueMockDataList1);
                    return new ResponseEntity<>(nonUniqueMockDataList1, HttpStatus.OK);
                } catch (Exception e) {
                    return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
                }
            } else if(column.equals("kolumna2")) {
                try {
                    List<MockData> nonUniqueMockDataList2 = mockDataRepository.findNonUnique2();
                    System.out.println(nonUniqueMockDataList2);
                    return new ResponseEntity<>(nonUniqueMockDataList2, HttpStatus.OK);
                } catch (Exception e) {
                    return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
                }
            } else if(column.equals("kolumna3")) {
                try {
                    List<MockData> nonUniqueMockDataList3 = mockDataRepository.findNonUnique3();
                    System.out.println(nonUniqueMockDataList3);
                    return new ResponseEntity<>(nonUniqueMockDataList3, HttpStatus.OK);
                } catch (Exception e) {
                    return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
                }
            } else if(column.equals("kolumna4")) {
                try {
                    List<MockData> nonUniqueMockDataList4 = mockDataRepository.findNonUnique4();
                    System.out.println(nonUniqueMockDataList4);
                    return new ResponseEntity<>(nonUniqueMockDataList4, HttpStatus.OK);
                } catch (Exception e) {
                    return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } return null;
    }
}