package co.com.pragma.model.user.gateways;

import co.com.pragma.model.user.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.math.BigInteger;

public interface UserRepository {
    Mono<User> save(User user); // hu1

    Flux<User> findAll();

    Mono<User> findById(BigInteger id);

    Mono<Void> deleteById(BigInteger id);
}
