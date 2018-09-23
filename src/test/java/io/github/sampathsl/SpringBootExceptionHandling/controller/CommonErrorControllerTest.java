package io.github.sampathsl.SpringBootExceptionHandling.controller;

import io.github.sampathsl.springboot.exceptionhandling.controller.CommonErrorController;
import io.github.sampathsl.springboot.exceptionhandling.model.ExceptionResponse;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

public class CommonErrorControllerTest extends Mockito {

  private Logger logger = LoggerFactory.getLogger(CommonErrorControllerTest.class);

  @Mock private WebRequest webRequest;

  @Mock private HttpServletResponse httpServletResponse;

  @Mock private ErrorAttributes errorAttributes;

  private Map<String, Object> mockParameterMap = new HashMap<>();

  private static String ERROR_PATH = "error";

  @Before
  public void setup() {
    MockitoAnnotations.initMocks(this);
    mockParameterMap.put("path", "/shops1");
    mockParameterMap.put("error", "Not Found");
    mockParameterMap.put("message", "No message available");
    mockParameterMap.put("timestamp", "Sun Sep 23 14:34:31 IST 2018");
    mockParameterMap.put("status", 404);
    when(errorAttributes.getErrorAttributes(webRequest, false)).thenReturn(mockParameterMap);
    Mockito.when(httpServletResponse.getStatus()).thenReturn(404);
  }

  @Test
  public void errorTest() {
    logger.info("Error Test");
    CommonErrorController commonErrorController = new CommonErrorController();
    commonErrorController.setErrorAttributes(errorAttributes);
    //mockParameterMap = errorAttributes.getErrorAttributes(webRequest, false);
    ExceptionResponse exceptionResponse = commonErrorController.error(webRequest, httpServletResponse);
    Assert.assertNotNull(exceptionResponse);
    Assert.assertEquals(exceptionResponse.getStatus(), mockParameterMap.get("status"));
    Assert.assertEquals(exceptionResponse.getErrorMessage(), mockParameterMap.get("message"));
    Assert.assertEquals(exceptionResponse.getPath(), mockParameterMap.get("path"));
    Assert.assertEquals(exceptionResponse.getTimeStamp(), mockParameterMap.get("timestamp"));
    Assert.assertEquals(exceptionResponse.getTrace(), mockParameterMap.get("trace"));
  }

  @Test
  public void errorPathTest() {
    logger.info("Error Path Test");
    CommonErrorController commonErrorController = new CommonErrorController();
    Assert.assertNotNull(commonErrorController.getErrorPath());
    Assert.assertEquals(ERROR_PATH, commonErrorController.getErrorPath());
  }

}
