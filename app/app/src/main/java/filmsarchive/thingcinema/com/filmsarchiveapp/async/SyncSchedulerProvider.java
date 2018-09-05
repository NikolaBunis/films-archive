package filmsarchive.thingcinema.com.filmsarchiveapp.async;

import filmsarchive.thingcinema.com.filmsarchiveapp.async.base.SchedulerProvider;
import io.reactivex.Scheduler;
import io.reactivex.schedulers.Schedulers;

public class SyncSchedulerProvider implements SchedulerProvider {
    @Override
    public Scheduler background() {
        return Schedulers.trampoline();
    }

    @Override
    public Scheduler ui() {
        return Schedulers.trampoline();
    }
}
