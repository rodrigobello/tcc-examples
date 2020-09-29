public class CancelProcessUseCase {
   private IProcessRepository processRepository;

   public CancelProcessUseCase(IProcessRepository processRepository) {
      this.processRepository = processRepository;
   }

   public void execute(int processId, String reason) {
      Process process = this.processRepository.getProcessById(processId);
      process.cancel(reason);
      this.processRepository.save(process)
   }
}
