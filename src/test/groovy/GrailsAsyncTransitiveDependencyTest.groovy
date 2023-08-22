import grails.plugin.springsecurity.web.UpdateRequestContextHolderExceptionTranslationFilter
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class GrailsAsyncTransitiveDependencyTest {

    @Test
    void testUpdateRequestContextHolderExceptionTranslationFilter() {
        String expectedExceptionMessage = "grails/async/web/AsyncGrailsWebRequest"

        NoClassDefFoundError exception = Assertions.assertThrows(NoClassDefFoundError.class, () ->
                new UpdateRequestContextHolderExceptionTranslationFilter(null));

        Assertions.assertEquals(expectedExceptionMessage, exception.getMessage())
    }
}
