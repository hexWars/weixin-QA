package bnuz.edu.cn.common.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: Cai
 * @CreateTime: 2021/10/21
 */
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccessTokenVO {
    private String access_token;
    private Integer expires_in;
}
