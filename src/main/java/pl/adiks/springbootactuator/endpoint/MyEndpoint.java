package pl.adiks.springbootactuator.endpoint;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "my-custom-endpoint")
public class MyEndpoint {

    @ReadOperation
    public MyEndpointResponse features() {
        return new MyEndpointResponse(2131, "Response", "Active");
    }
}

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
class MyEndpointResponse {

    private int id;
    private String name;
    private String status;
}
