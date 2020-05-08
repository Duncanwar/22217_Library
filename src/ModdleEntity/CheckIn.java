package Moodle;

import java.time.LocalDateTime;
        
public class CheckIn {
    private String clientName;
    private String bookName;
    private LocalDateTime dateTime;
    private String status;
    private String OperationCategory;
    
    public CheckIn(){}

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

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOperationCategory() {
        return OperationCategory;
    }

    public void setOperationCategory(String OperationCategory) {
        this.OperationCategory = OperationCategory;
    }

    @Override
    public String toString() {
        return "CheckIn{" + "clientName=" + clientName + ", bookName=" + bookName + ", dateTime=" + dateTime + ", status=" + status + ", OperationCategory=" + OperationCategory + '}';
    }

}
