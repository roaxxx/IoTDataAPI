package co.edu.jdc.IoTDataAPI.services;

import co.edu.jdc.IoTDataAPI.models.Notification;
import co.edu.jdc.IoTDataAPI.repositories.NotificationsRepository;
import co.edu.jdc.IoTDataAPI.util.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationService {

    @Autowired
    private NotificationsRepository notificationsRepository;

    public boolean saveNotification(Notification notification){
        notification.setNotificationDate(DateTime.getCurrentFormattedDate());
        notification.setNotificationTime(DateTime.getCurrentFormattedTime());
        if(notificationsRepository.save(notification)!=null){
            return true;
        }else{
            return false;
        }
    }

    public List<Notification> listNotifications(){
        return notificationsRepository.findAll();
    }
}
