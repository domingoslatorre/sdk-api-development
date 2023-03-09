package sdk.api.development.examples.festivo_api.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HolidayResponse {
    private int status;
    private String requestId;
    private List<Holiday> holidays;

    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public String getRequestId() {
        return requestId;
    }
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
    public List<Holiday> getHolidays() {
        return holidays;
    }
    public void setHolidays(List<Holiday> holidays) {
        this.holidays = holidays;
    }
    
    @Override
    public String toString() {
        return "HolidayResponse [status=" + status + ", requestId=" + requestId + ", holidays=" + holidays + "]";
    }
}
