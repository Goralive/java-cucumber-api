package name.lattuada.trading.repository;

import name.lattuada.trading.model.entities.UserEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class IUserRepositoryTest {
    @Autowired
    private IUserRepository underTest;

    @Test
    void shouldCreateUser() {
        // given
        UserEntity userEntity = new UserEntity();
        String username = "username";
        String password = "password";

        userEntity.setUsername(username);
        userEntity.setPassword(password);
        // when
        UserEntity user = underTest.save(userEntity);
        // then
        Optional<UserEntity> optionalUser = underTest.findById(user.getId());
        assertThat(optionalUser)
                .isPresent()
                .hasValueSatisfying(u -> {
                    assertThat(u.getUsername()).isEqualTo(username);
                    assertThat(u.getPassword()).isEqualTo(password);
                });
    }
}
