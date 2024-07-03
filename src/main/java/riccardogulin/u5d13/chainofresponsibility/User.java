package riccardogulin.u5d13.chainofresponsibility;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class User {
	private String email;
	private String password;
	private String role;
}
