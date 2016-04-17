#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")
public interface ${NAME}Interactor extends Interactor {
    interface Callback {
        void on${NAME}Finish();

        void on${NAME}Fail();
    }
}