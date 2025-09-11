CREATE TABLE events (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description TEXT,
    dateStart TIMESTAMP NOT NULL,
    dateFinish TIMESTAMP NOT NULL,
    identificator VARCHAR(255) NOT NULL,
    localEvent VARCHAR(255) NOT NULL,
    organization VARCHAR(255),
    capacity VARCHAR(255),
    type VARCHAR(255)
);