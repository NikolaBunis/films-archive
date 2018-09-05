package filmsarchive.thingcinema.com.filmsarchiveapp.async.base;

import io.reactivex.Scheduler;

public interface SchedulerProvider{
    Scheduler background();
    Scheduler ui();
}
