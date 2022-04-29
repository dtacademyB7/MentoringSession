package april29;

public class TestSkipException extends RuntimeException{


    public TestSkipException(String test_is_skipped) {
        super(test_is_skipped);
    }
}
