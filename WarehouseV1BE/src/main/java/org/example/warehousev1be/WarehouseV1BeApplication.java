package org.example.warehousev1be;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.example.warehousev1be.mapper")
public class WarehouseV1BeApplication {

	public static void main(String[] args) {
		SpringApplication.run(WarehouseV1BeApplication.class, args);
	}

}
