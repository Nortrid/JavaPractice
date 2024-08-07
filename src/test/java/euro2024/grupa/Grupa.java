package euro2024.grupa;

import euro2024.nationala.Nationala;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Grupa {

    private Integer nrGrupa;
    private List<Nationala> nationale;
}
