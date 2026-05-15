import static org.assertj.core.api.Assertions.*;
import com.sample.feign.common.ApiItemData;
import com.sample.feign.general.GeneralHostResponseMapper;
import com.sample.feign.general.response.NaverEpProductDTO;
import feign.Request;
import feign.Request.HttpMethod;
import feign.Response;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;

public class GeneralHostResponseMapperTest {

    @Test
    void 글자치환() {
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }

    @Test
    void fileWriteTest() {
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }
}
