package co.edu.jdc.IoTDataAPI.controllers;

import co.edu.jdc.IoTDataAPI.models.Notification;
import co.edu.jdc.IoTDataAPI.services.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("notifications")
public class NotificationsController {

    @Autowired
    private NotificationService notificationService;

    @PostMapping("addNotification")
    public boolean saveNotification(@RequestBody Notification notification){
        return notificationService.saveNotification(notification);
    }

    @GetMapping("listNotifications")
    public List<Notification> listNotifications(){
        return notificationService.listNotifications();
    }
}
