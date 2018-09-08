package filmsarchive.thingcinema.com.filmsarchiveapp.validators.base;

public interface Validator<T> {
    boolean isValid(T object);
}

