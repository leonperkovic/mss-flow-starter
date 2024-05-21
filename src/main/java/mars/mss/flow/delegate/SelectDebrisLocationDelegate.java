package mars.mss.flow.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class SelectDebrisLocationDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) throws Exception {
        // TODO ...
    }
}
