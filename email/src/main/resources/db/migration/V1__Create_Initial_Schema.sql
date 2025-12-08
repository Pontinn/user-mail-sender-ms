CREATE TABLE tb_emails (
    email_id UUID NOT NULL,
    user_id UUID NOT NULL,
    email_from VARCHAR(255) NOT NULL,
    email_to VARCHAR(255) NOT NULL,
    email_subject VARCHAR(255) NOT NULL,
    email_body TEXT NOT NULL,
    send_date TIMESTAMP WITH TIME ZONE NOT NULL,
    email_status VARCHAR(50) NOT NULL,

    CONSTRAINT pk_emails PRIMARY KEY (email_id)
);