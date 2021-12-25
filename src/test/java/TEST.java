import com.dramacompaytaxi.Main;
import com.dramacompaytaxi.entity.UserEntity;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.dramacompaytaxi.repository.UserRepository;

import java.time.ZonedDateTime;

@SpringBootTest(classes= Main.class)
@RunWith(SpringRunner.class)
@Slf4j
public class TEST {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void givenUser_whenFind_thenReturnSameEmail(){
        //given
        UserEntity user= UserEntity.builder()
                .email("shfur2006@naver.com")
                .password("asdf")
                .usertype("passenger")
                .createdat(ZonedDateTime.now())
                .updatedat(ZonedDateTime.now()).build();
        userRepository.save(user);

        //when
        var retrievedUser =userRepository.findById(user.getId()).orElseThrow(RuntimeException::new);

        //then
        Assertions.assertEquals(user.getEmail(),retrievedUser.getEmail());
        log.info("userEmail = [{}], retrievedUserEmail = [{}]", user.getEmail(), retrievedUser.getEmail());
    }
}
