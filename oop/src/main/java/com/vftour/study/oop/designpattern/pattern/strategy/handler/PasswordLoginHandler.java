package com.vftour.study.oop.designpattern.pattern.strategy.handler;

import com.vftour.study.oop.api.Result;
import com.vftour.study.oop.designpattern.pattern.strategy.ILoginHandler;
import com.vftour.study.oop.designpattern.pattern.strategy.LoginRequest;
import com.vftour.study.oop.designpattern.pattern.strategy.LoginType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * PasswordLoginHandler
 *
 * @version 1.0
 * @author: 东东 | d@tke.store
 * @date :  2022/10/26 12:55 上午
 */
@Slf4j
@Component
public class PasswordLoginHandler implements ILoginHandler<Serializable> {
    @Override
    public LoginType getLoginType() {
        return LoginType.Password;
    }

    @Override
    public Result<Serializable> handle(LoginRequest request) {
        log.info("密码模式登录：formInput={}", request.getFormInput());

        return Result.success("");
    }
}
