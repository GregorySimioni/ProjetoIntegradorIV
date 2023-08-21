package entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;

@Entity
@Data
@Table(name = "TB_UserEntity")
public class userEntity {
  private String name;
  private String cpf;
  private String email;
  private LocalDate birthdate;
  private String password;
  private String phoneNumber;
  private float saldo;
  private roleEnum role;
  private genderEnum gender;
}
