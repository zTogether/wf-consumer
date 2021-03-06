package cn.xyzs.wfconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
@EnableDiscoveryClient
public class WfConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WfConsumerApplication.class, args);
	}
	@Bean
	@LoadBalanced
	RestTemplate restTemplate(){
		return new RestTemplate();
	}
}
