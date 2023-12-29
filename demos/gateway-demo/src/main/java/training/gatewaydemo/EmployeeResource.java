package training.gatewaydemo;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeResource {

    private Long id;

    @NotBlank
    private String name;

    public EmployeeResource(String name) {
        this.name = name;
    }
}
