public class CancelProcessUseCase {
   private IProcessRepository processRepository;

   public CancelProcessUseCase(IProcessRepository processRepository) {
      this.processRepository = processRepository;
   }

   public void execute(int processId, String reason, User user) {
      Process process = this.processRepository.getProcessById(processId);
      process.cancel(reason, user);
      this.processRepository.save(process);
   }
}
