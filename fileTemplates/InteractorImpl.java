#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")
public class ${NAME}InteractorImpl extends AbstractInteractor implements ${NAME}Interactor {

    private static final String LOG_TAG = ${NAME}InteractorImpl.class.getSimpleName();
    
    @Inject Logger mLogger;
    
    private Callback mCallback;
    
    public ${NAME}InteractorImpl(SpicioApplication application, Callback callback) {
        super(application.getInteractorComponent());
        application.getInteractorComponent().inject(this);
        mCallback = callback;
    }

    @Override
    public void run() {
        mLogger.debug(LOG_TAG, "started");
        mLogger.debug(LOG_TAG, "stopped");
    }
    
    private void postFinish() {
        if (mCallback != null) {
            mMainThread.post(new Runnable() {
                @Override
                public void run() {
                    mCallback.on${NAME}Finish();
                }
            });
        }
    }

    private void postFail() {
        if (mCallback != null) {
            mMainThread.post(new Runnable() {
                @Override
                public void run() {
                    mCallback.on${NAME}Fail();
                }
            });
        }
    }
}