package com.binar.notificationservice.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.Instant;

@Data
@AllArgsConstructor
public class NotificationRequest {

    @NotBlank
    private String title;
    @NotBlank
    private String content;
    private Boolean statusRead = false;
    private Instant createdAt;
    private Instant modifiedAt;
}
