package ujkhatri.model.logs;
import lombok.*;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Getter
@Setter
@ToString
@NonNull
@AllArgsConstructor
public class KibanaLog {
    private UUID id;
    private String service;
    private int statusCode;
    private String statusMessage;
}
