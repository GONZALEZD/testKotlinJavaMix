package fr.test.solera.repository.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LombokData {
    private int number;

    @Override
    public String toString() {
        return ""+number;
    }

//    public LombokData(int number) {
//        this.number = number;
//    }
//
//    public int getNumber() {
//        return number;
//    }
}
