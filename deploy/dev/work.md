
## DBeaver
https://dbeaver.io/

## Mysql
```

sudo docker pull mysql:5.7
sudo docker rm -f mysql

sudo docker run --name=mysql --restart=always -e MYSQL_ROOT_PASSWORD=123456abc -p 3306:3306 -d mysql:5.7

sudo docker exec -it mysql sh
mysql -p123456abc


CREATE DATABASE IF NOT EXISTS test;
USE test;
CREATE TABLE IF NOT EXISTS `datar`(
   `timestr` VARCHAR(50),
   `type` BIGINT,
   `pv` BIGINT,
   `uv` BIGINT
);
exit;
```

