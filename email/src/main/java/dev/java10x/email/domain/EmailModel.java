package dev.java10x.email.domain;

import dev.java10x.email.enums.EmailStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.OffsetDateTime;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "tb_email")
public class EmailModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "email_id")
    private UUID emailId;
    @Column(name = "user_id")
    private UUID userId;
    @Column(name = "email_to")
    private String emailTo;
    @Column(name = "email_from")
    private String emailFrom;
    @Column(name = "email_subject")
    private String emailSubject;
    @Column(name = "email_body", columnDefinition = "BODY")
    private String emailBody;
    @Column(name = "send_date")
    private OffsetDateTime sendDate;
    @Column(name = "email_status")
    private EmailStatus emailStatus;
}
