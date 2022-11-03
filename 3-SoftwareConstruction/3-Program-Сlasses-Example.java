package com.nuop.tscp.user;

import com.nuop.tscp.group.group;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUser")
    private Long id;

    private String role;
    private String name;
    private String surname;

    private Double balance = 0D;

    private String gender;
    private Double weights = 0D;
    private Double heights = 0D;

    private String profession;
    private String about_me;
    private String interests;

    @Column(unique = true)
    private String email;

    @Column(unique = true)
    private String mobile;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private group group;
}

package com.nuop.tscp.healthCondition;

import com.nuop.tscp.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "healthCondition")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class healthCondition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_hc")
    private Long id;

    private Double calories = 0D;
    private Double pulse = 0D;
    private Double pace = 0D;
    private Double pressure = 0D;

    private Date date;

    @ManyToOne
    @JoinColumn(name = "idCard")
    private User users;
}

package com.nuop.tscp.group;

import com.nuop.tscp.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "groups")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_group")
    private Long id;

    private String name;
    private String type;

    @ManyToOne
    @JoinColumn(name = "trainer_id")
    private User trainer;
}
