package de.rieckpil.blog;

import org.junit.jupiter.api.Test;
import org.springframework.boot.actuate.autoconfigure.web.server.LocalManagementPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class ApplicationIT {

  @LocalServerPort
  private Integer port;

  @LocalManagementPort
  private Integer managementPort;

  @Test
  void printPortsInUse() {
    System.out.println(port);
    System.out.println(managementPort);
  }
}
