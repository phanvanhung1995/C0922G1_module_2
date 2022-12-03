package casestudy.model.booking;

import javax.xml.crypto.Data;
import java.util.Date;

public class Booking {

    private String idBooking ;
    private Date dateStart, dateEnd ;
    private String idCustomer ;
    private String serviceName ;


    public Booking(String idBooking, Date dateStart, Date dateEnd, String idCustomer, String serviceName) {
        this.idBooking = idBooking;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.idCustomer = idCustomer;
        this.serviceName = serviceName;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "idBooking='" + idBooking + '\'' +
                ", dateStart=" + dateStart +
                ", dateEnd=" + dateEnd +
                ", idCustomer='" + idCustomer + '\'' +
                ", serviceName='" + serviceName + '\'' +
                '}';
    }
}
