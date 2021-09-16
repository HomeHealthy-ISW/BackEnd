package com.acme.Membership.Test;

import com.acme.homehealthy.Initialization.domain.model.Customer;
import com.acme.homehealthy.Initialization.domain.repository.CustomerRepository;
import com.acme.homehealthy.MemberShip.domain.model.Plan;
import com.acme.homehealthy.MemberShip.domain.model.Subscription;
import com.acme.homehealthy.MemberShip.domain.repository.PlanRepository;
import com.acme.homehealthy.MemberShip.domain.repository.SubscriptionRepository;
import com.acme.homehealthy.MemberShip.domain.service.PlanService;
import com.acme.homehealthy.MemberShip.domain.service.SubscriptionService;
import com.acme.homehealthy.MemberShip.service.PlanServiceImpl;
import com.acme.homehealthy.MemberShip.service.SubscriptionServiceImpl;
import com.acme.homehealthy.Social.domain.model.Score;
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
public class PlanServiceImplIntegrationTest {

    @Autowired
    private PlanService planService;

    @MockBean
    private PlanRepository planRepository;

    @TestConfiguration
    static class PlanServiceImplTestConfiguration {
        @Bean
        public PlanService postService() {
            return new PlanServiceImpl();
        }
    }

    @Test
    @DisplayName("When createPlan But Using The Same Name Of A Plan")
    public void whe11n(){
        //Arrange
        String message= "This name is begin used in other plan";
        Plan plan = new Plan();
        plan.setId(1L);
        plan.setName("Nivel 1");
        when(planRepository.findPlanByName(plan.getName()))
                .thenReturn(Optional.of(plan));
        //Act
        Plan plan2 = new Plan();
        plan2.setId(2L);
        plan2.setName("Nivel 1");

        Throwable exception = catchThrowable(()-> {
            Plan result = planService.createPlan(plan2);
        });
        //Assert
        assertThat(exception)
                .isInstanceOf(ResourceNotFoundException.class)
                .hasMessage(message);
    }

    @Test
    @DisplayName("When findPlanById But The PlanId Not Existing")
    public void whe111n(){
        //Arrange
        String template= "Resource %s not found for %s with value %s";
        when(planRepository.findById(1L))
                .thenReturn(Optional.empty());
        String expectedMessage = String.format(template, "Plan","Id",1L);
        //Act
        Throwable exception = catchThrowable(()-> {
            Plan result = planService.getPlanById(1L);
        });
        //Assert
        assertThat(exception)
                .isInstanceOf(ResourceNotFoundException.class)
                .hasMessage(expectedMessage);
    }

    @Test
    @DisplayName("Get Plan by Id with a valid Id then returns True")
    public void getPlanByIdWithValidIdReturnsTrue(){
        Long id = 2L;
        Plan plan = new Plan()
                .setId(id);
        when(planRepository.findById(id))
                .thenReturn(Optional.of(plan));
        //Act
        Plan foundPlan = planService.getPlanById(id);

        //Assert
        assertThat(foundPlan.getId()).isEqualTo(plan.getId());
    }

    @Test
    @DisplayName("Get Plan by Name with a valid Name then returns True")
    public void getPlanByNameWithValidNameReturnsTrue(){
        Long id = 2L;
        String name = "planName";
        Plan plan = new Plan()
                .setId(id)
                .setName(name);
        when(planRepository.findPlanByName(name))
                .thenReturn(Optional.of(plan));
        //Act
        Plan foundPlan = planService.getPlanByName(name);

        //Assert
        assertThat(foundPlan.getId()).isEqualTo(plan.getId());
        assertThat(foundPlan.getName()).isEqualTo(plan.getName());
    }

    @Test
    @DisplayName("get Plan by Name with invalid Name return Resource Not Found Exception")
    public void getPlanByNameWithInvalidNameReturnsResourceNotFoundException(){
        String template ="Resource %s not found for %s with value %s";
        Long id = 1L;
        String name = "planName";
        when(planRepository.findPlanByName(name))
                .thenReturn(Optional.empty());
        String expectedMessage = String.format(template, "Plan", "Name", name);

        //Act
        Throwable exception = catchThrowable(()->{
            Plan foundPlan = planService.getPlanByName(name);
        });

        //Assert
        assertThat(exception)
                .isInstanceOf(ResourceNotFoundException.class)
                .hasMessage(expectedMessage);
    }
}
