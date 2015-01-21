package designpatterns.structural.filter;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Francesco Bertolino
 */
public class CriteriaMale implements Criteria
{

    @Override
    public List<Person> meetCriteria(List<Person> persons)
    {
        return persons.stream().filter((person) -> (person.getGender().equalsIgnoreCase("MALE")))
                .collect(Collectors.toList());
    }
}
