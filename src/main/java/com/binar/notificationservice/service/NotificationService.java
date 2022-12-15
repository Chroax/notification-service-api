package com.binar.notificationservice.service;

import com.binar.notificationservice.dto.NotificationGet;
import com.binar.notificationservice.dto.NotificationRequest;
import com.binar.notificationservice.dto.NotificationResponse;

import java.util.concurrent.ExecutionException;

public interface NotificationService {

    NotificationResponse createNotification(NotificationRequest notificationRequest) throws ExecutionException, InterruptedException;

    NotificationGet getNotificationDetails(String title) throws ExecutionException, InterruptedException;

    String deleteNotification(String title) throws ExecutionException, InterruptedException;
}
