CREATE TABLE IF NOT EXISTS tb_member (
   id INT NOT NULL AUTO_INCREMENT,
   name varchar(250) not null,
   PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS tb_post (
   id INT NOT NULL AUTO_INCREMENT,
   member_id INT NOT NULL,
   title varchar(250) NOT NULL,
   body text NOT NULL,
   PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS tb_post_comment (
   id INT NOT NULL AUTO_INCREMENT,
   post_id INT NOT NULL,
   content text NOT NULL,
   member_id INT NOT NULL,
   PRIMARY KEY (id)
);
