package objects.reqres;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Registration {
    String email;
    String password;
}
