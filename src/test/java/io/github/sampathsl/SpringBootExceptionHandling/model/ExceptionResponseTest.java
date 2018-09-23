package io.github.sampathsl.SpringBootExceptionHandling.model;

import io.github.sampathsl.springboot.exceptionhandling.model.ExceptionResponse;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class ExceptionResponseTest {

  private Logger logger = LoggerFactory.getLogger(ExceptionResponseTest.class);
  private Map<String, Object> mockParameterMap = new HashMap<>();

  @Before
  public void setup() {
    MockitoAnnotations.initMocks(this);
    mockParameterMap.put("path", "/shops1");
    mockParameterMap.put("error", "Not Found");
    mockParameterMap.put("message", "No message available");
    mockParameterMap.put("timestamp", "Sun Sep 23 14:34:31 IST 2018");
    mockParameterMap.put("status", 404);
  }

  @Test
  public void exceptionResponseTest() {
    logger.info("Exception Response Test");
    ExceptionResponse exceptionResponse = new ExceptionResponse(404, mockParameterMap);
    Assert.assertNotNull(exceptionResponse);
    Assert.assertEquals(exceptionResponse.getStatus(), mockParameterMap.get("status"));
    Assert.assertEquals(exceptionResponse.getErrorMessage(), mockParameterMap.get("message"));
    Assert.assertEquals(exceptionResponse.getPath(), mockParameterMap.get("path"));
    Assert.assertEquals(exceptionResponse.getTimeStamp(), mockParameterMap.get("timestamp"));
    Assert.assertEquals(exceptionResponse.getTrace(), mockParameterMap.get("trace"));
  }
}
