public class Process {
    private Status status;
    private String canceledReason;
    private User canceledBy;

    // process logic here...

    public void cancel(String reason, User user) {
        this.status = Status.CANCELED;
        this.canceledReason = reason;
        this.canceledBy = user;
    }
}
