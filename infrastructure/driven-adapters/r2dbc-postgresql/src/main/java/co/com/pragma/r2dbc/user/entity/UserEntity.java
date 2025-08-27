package co.com.pragma.r2dbc.user.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.relational.core.mapping.Column;

import java.math.BigInteger;
import java.time.LocalDate;

@Table("users")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;

    private String name;

    @Column("last_name")
    private String lastName;

    private LocalDate birthdate;

    private String address;

    private String phone;

    private String email;

    private BigInteger dni;

    @Column("base_salary")
    private BigInteger baseSalary;
}
