public class Process {
   private Status status;
   private String canceledReason;

   // process logic here...

   public void cancel(String reason) {
      this.status = Status.CANCELED;
      this.canceledReason = this.reason;
   }
}
