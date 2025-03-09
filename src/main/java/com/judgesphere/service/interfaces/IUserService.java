package com.judgesphere.service.interfaces;

import java.util.concurrent.CompletableFuture;
import com.judgesphere.models.service.*;

public interface IUserService {
    CompletableFuture<Boolean> RegisterUserAsync(UserDto user);

}
