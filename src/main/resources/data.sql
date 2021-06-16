CREATE TABLE status(
   id BIGINT PRIMARY KEY AUTO_INCREMENT,
   uf VARCHAR(100),
   dateRequest TIMESTAMP,
   dateResponse TIMESTAMP,
   status VARCHAR(100),
   ambient VARCHAR(100),
   appVersion VARCHAR(100),
   layoutVersion VARCHAR(100),
   responseTime BIGINT,
   cause VARCHAR(100),
   observation VARCHAR(100)
);

INSERT INTO status (
    id,
    uf,
    dateRequest,
    dateResponse,
    status,
    ambient,
    appVersion,
    layoutVersion,
    responseTime,
    cause,
    observation
) VALUES (
    1,
   10,
   '2021-06-15T12:00:00',
   '2021-06-15T12:00:05',
   'ATIVO',
   1,
   '4.0',
   '1',
   3,
   'Teste',
   'Teste'
);