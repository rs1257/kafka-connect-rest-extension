package com.pascal.kafka.connect.rest.extension;

import java.util.Map;
import org.apache.kafka.connect.rest.ConnectRestExtension;
import org.apache.kafka.connect.rest.ConnectRestExtensionContext;
import com.pascal.kafka.connect.rest.extension.rest.RestResource;

public class RestExtension implements ConnectRestExtension {

  private String version = "1.0.0";

  @Override
  public void register(ConnectRestExtensionContext restPluginContext) {
    restPluginContext
        .configurable()
        .register(
          new RestResource()
        );
  }

  @Override
  public void close() {
    // Nothing to do here
  }

  @Override
  public void configure(Map<String, ?> configs) {
    // Nothing to do here
  }

  @Override
  public String version() {
    return version;
  }
}