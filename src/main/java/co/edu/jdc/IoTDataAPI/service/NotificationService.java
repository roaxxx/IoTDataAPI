package co.edu.jdc.IoTDataAPI.service;

import co.edu.jdc.IoTDataAPI.model.Notification;
import co.edu.jdc.IoTDataAPI.repository.NotificationsRepository;
import co.edu.jdc.IoTDataAPI.util.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationService {


    private final NotificationsRepository notificationsRepository;

    @Autowired
    public NotificationService(NotificationsRepository notificationsRepository) {
        this.notificationsRepository = notificationsRepository;
    }

    /**
     * Save a notifiaction record on database
     * @param notification object to save
     * @return true if saved or null if not
     */
    public boolean saveNotification(Notification notification){
        notification.setNotificationDate(DateTime.getCurrentFormattedDate());
        notification.setNotificationTime(DateTime.getCurrentFormattedTime());
        if(notificationsRepository.save(notification)!=null){
            return true;
        }else return false;
    }

    /**
     * Find all notification records on database
     * @return Notification object list or null if not data found
     */
    public List<Notification> listNotifications(){
        return notificationsRepository.findAll();
    }

    /**
     * Drop all notification records on database
     * @return true if droped
     */
    public boolean deleteNotifications(){
        notificationsRepository.deleteAll();
        return true;
    }
}
