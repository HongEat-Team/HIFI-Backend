package Backend.HIFI.auth.oauth.kakao;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class KakaoRequest {
    private String accessToken;
}
