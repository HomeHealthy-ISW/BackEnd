package com.acme.Social.Test;

import com.acme.homehealthy.MemberShip.domain.model.Plan;
import com.acme.homehealthy.Social.domain.model.Score;
import com.acme.homehealthy.Social.domain.repository.ScoreRepository;
import com.acme.homehealthy.Social.domain.service.ScoreService;
import com.acme.homehealthy.Social.service.ScoreServiceImpl;
import com.acme.homehealthy.exception.ResourceNotFoundException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
public class ScoreServiceImplIntegration {

    @Autowired
    private ScoreService scoreService;

    @MockBean
    private ScoreRepository scoreRepository;

    @TestConfiguration
    static class ScoreServiceImplConfiguration {
        @Bean
        public ScoreService postService() {
            return new ScoreServiceImpl();
        }
    }

    @Test
    @DisplayName("When createScored With An Name Existis Return Message This Name Is Begin Used")
    public void  asd() {
        //Arrange
        String message= "This name is begin used";
        Score score = new Score();
        score.setId(1L);
        score.setName("Muy bueno");
        when(scoreRepository.findScoreByName(score.getName()))
                .thenReturn(Optional.of(score));
        //Act
        Score score2 = new Score();
        score2.setId(2L);
        score2.setName("Muy bueno");

        Throwable exception = catchThrowable(()-> {
            Score result = scoreService.createScore(score2);
        });
        //Assert
        assertThat(exception)
                .isInstanceOf(ResourceNotFoundException.class)
                .hasMessage(message);
    }

    @Test
    @DisplayName("When createReason With An Description Existis Return Message This Value Is Begin Used")
    public void aasd() {
        //Arrange
        String message= "This value is begin used";
        Score score = new Score();
        score.setId(1L);
        score.setName("Muy bueno");
        score.setValue(1L);
        when(scoreRepository.findScoreByValue(score.getValue()))
                .thenReturn(Optional.of(score));
        //Act
        Score score2 = new Score();
        score2.setId(2L);
        score2.setName("Muy Malo");
        score2.setValue(1L);
        Throwable exception = catchThrowable(()-> {
            Score result = scoreService.createScore(score2);
        });
        //Assert
        assertThat(exception)
                .isInstanceOf(ResourceNotFoundException.class)
                .hasMessage(message);
    }

    @Test
    @DisplayName("Get Score by Id with valid Id then return true")
    public void whenGetScoreByIdWithValidScoreIdThenReturnsScore(){
        Long id = 1L;
        Score newScore = new Score();
        newScore.setId(id)
                .setName("Malo")
                .setValue(3L);
        when(scoreRepository.findById(id))
                .thenReturn(Optional.of(newScore));

        //Act
        Optional<Score> foundScore = scoreRepository.findById(id);

        //Assert
        assertThat(foundScore.get().getId()).isEqualTo(id);
    }

    @Test
    @DisplayName("Get Score by Id with valid Id then return is not valid")
    public void whenGetScoreByIdWithInValidScoreIdThenReturnsResourceNotFoundException(){
        String template ="Resource %s not found for %s with value %s";
        Long id = 1L;
        when(scoreRepository.findById(id))
                .thenReturn(Optional.empty());
        String expectedMessage = String.format(template, "Score", "Id", id);
        //Act
        Throwable exception = catchThrowable(()->{
            Score foundScore = scoreService.getScoreById(id);
        });

        //Assert
        assertThat(exception)
                .isInstanceOf(ResourceNotFoundException.class)
                .hasMessage(expectedMessage);
    }
}
