package hello;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TypeCustomer {
    @Id
    @GeneratedValue
    //@ViewColumn(displayName = "id_1")
    private BigDecimal id;


    @ViewColumn(displayName = "Код")
    private String code;

}
