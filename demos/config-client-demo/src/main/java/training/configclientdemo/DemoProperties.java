package training.configclientdemo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "demo")
@Data
public class DemoProperties {

    private String prefix;
}
