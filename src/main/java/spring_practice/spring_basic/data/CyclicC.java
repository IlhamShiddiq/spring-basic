package spring_practice.spring_basic.data;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CyclicC {

    private CyclicA cyclicA;

}
