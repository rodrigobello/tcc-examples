public class CancelProcessUseCase {
    private IProcessRepository processRepository;
    private IPublisher publisher;

    public CancelProcessUseCase(IProcessRepository processRepository, IPublisher publisher) {
        this.processRepository = processRepository;
        this.publisher = publisher;
    }

    public void execute(int processId, String reason, User user) {
        Process process = this.processRepository.getProcessById(processId);
        process.cancel(reason, user);
        this.processRepository.save(process);
        this.publisher.publish(process.getEvents());
    }
}
