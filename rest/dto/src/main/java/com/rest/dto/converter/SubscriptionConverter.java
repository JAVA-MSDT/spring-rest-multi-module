package com.rest.dto.converter;

import java.time.LocalDate;

import com.rest.dto.dto.SubscriptionRequestDto;
import com.rest.dto.model.Subscription;
import com.rest.dto.model.User;
import org.springframework.stereotype.Component;

@Component
public class SubscriptionConverter {


    public Subscription convert(SubscriptionRequestDto subscriptionRequestDto, User user) {
         Long id = subscriptionRequestDto.getId();
         LocalDate startDate = subscriptionRequestDto.getStartDate();
        return new Subscription(id, user, startDate);
    }

}
