import lombok.*;

import java.time.Instant;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class Product {
    private int ind;
    private String name;
    private Instant creationDatetime;
    private Category category;

    public String getCategoryName() {
        return category.getName();
    }
}
