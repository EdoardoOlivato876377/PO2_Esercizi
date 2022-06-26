public interface Resource <T>{
    T get();
    void release();
}
