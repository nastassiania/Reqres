package objects.reqres;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Login {
    String email;
    String password;
    String username;
}
