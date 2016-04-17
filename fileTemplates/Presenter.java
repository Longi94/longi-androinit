#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")
public class ${NAME}Presenter implements Presenter<${NAME}View> {
    
    private ${NAME}View mView;
    
    @Override
    public void attachView(${NAME}View view) {
        mView = view;
    }

    @Override
    public void detachView() {
        mView = null;
    }
}