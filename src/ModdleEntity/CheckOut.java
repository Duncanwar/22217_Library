package ModdleEntity;

import javax.persistence.*;

import java.time.LocalDateTime;
        
public class CheckOut {
    private String clientName;
    private String bookName;
    private LocalDateTime dateTime;
    private String status;
    private String OperationCategory;
    
    public CheckOut(){}

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getOperationCategory() {
        return OperationCategory;
    }

    public void setOperationCategory(String OperationCategory) {
        this.OperationCategory = OperationCategory;
    }

    @Override
    public String toString() {
        return "CheckOut{" + "clientName=" + clientName + ", bookName=" + bookName + ", dateTime=" + dateTime + ", status=" + status + ", OperationCategory=" + OperationCategory + '}';
    }

  
    
}
