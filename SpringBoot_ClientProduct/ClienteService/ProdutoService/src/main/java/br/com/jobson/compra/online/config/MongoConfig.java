/**
 * 
 */
package br.com.jobson.compra.online.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * @author jobson.oliveira
 *
 */
@Configuration
@EnableMongoRepositories(basePackages = "br.com.jobson.compra.online.repository")
public class MongoConfig {

}
