package kiosk;

public class Ticket {
    public String clientId;
    public Integer nPersons;
    public Integer ticketNo;
    public String tableNo;

    public Ticket(String message) {
        String[] ObjectMapper = message.split(" ");
        this.clientId = ObjectMapper[1];
        this.nPersons = Integer.parseInt(ObjectMapper[2]);
    }

    public String getClientId() {
        return clientId;
    }

    public Integer getnPersons() {
        return nPersons;
    }

    public Integer getTicketNo() {
        return ticketNo;
    }

    public String getTableNo() {
        return tableNo;
    }

    public void setTicketNo(Integer ticketNo) { this.ticketNo = ticketNo; }

    public void setTableNo(String tableNo) {
        this.tableNo = tableNo;
    }
}
