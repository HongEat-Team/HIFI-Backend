package Backend.HIFI.domain.store.dto.request;

import Backend.HIFI.domain.store.entity.CategoryCode;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostStoreDto {
    @ApiModelProperty(value = "가게 주소", example = "서울특별시 마포구")
    private String address;
    @ApiModelProperty(value = "가게 이름", example = "하이디라오")
    private String name;
    @ApiModelProperty(value = "가게 종류", example = "음식점")
    //TODO: 변환 필요
    private CategoryCode categoryCode;
    @ApiModelProperty(value = "가게 설명", example = "일식집")
    private String description;

}
