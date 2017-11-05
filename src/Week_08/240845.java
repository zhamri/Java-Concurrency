public class SearchEngineContextListener implements ServletContextListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(SearchEngineContextListener.class);

    private Thread thread = null;
    private IndexProcessor runnable = null;

    @Override
    public void contextInitialized(ServletContextEvent event) {
        runnable = new IndexProcessor();
        thread = new Thread(runnable);
        LOGGER.debug("Starting thread: " + thread);
        thread.start();
        LOGGER.debug("Background process successfully started.");
    }

    @Override
    public void contextDestroyed(ServletContextEvent event) {
        LOGGER.debug("Stopping thread: " + thread);
        if (thread != null) {
            runnable.terminate();
            thread.join();
            LOGGER.debug("Thread successfully stopped.");
        }
    }
}
