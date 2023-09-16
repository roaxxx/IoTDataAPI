package co.edu.jdc.IoTDataAPI.controller;

import co.edu.jdc.IoTDataAPI.model.entity.Notification;
import co.edu.jdc.IoTDataAPI.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("notifications")
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @PostMapping()
    public ResponseEntity<Notification> saveNotification(@RequestBody Notification notification){
        return new ResponseEntity<>(notificationService.saveNotification(notification), HttpStatus.CREATED) ;
    }

    @GetMapping("listNotifications")
    public ResponseEntity<List<Notification>> listNotifications(){

        return new ResponseEntity<>(notificationService.listNotifications(), HttpStatus.OK);
    }

    @DeleteMapping()
    public ResponseEntity<Boolean> deleteAllNotifications(){
        return new ResponseEntity<>(notificationService.deleteNotifications(), HttpStatus.OK) ;
    }
}
