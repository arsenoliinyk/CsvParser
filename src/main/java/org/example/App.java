package org.example;

import java.io.IOException;
import java.util.List;

public class App {
    public static void main(String[] args) throws IOException {

        List<Car> carList = CsvParser.loadCsvData(Car.getFilePath(), new Car());
        System.out.println(carList);

    }
}
