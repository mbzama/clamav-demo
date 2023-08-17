package zama.learning.clamav.demo.dto;

import org.springframework.util.StringUtils;

import lombok.Getter;
import lombok.Setter;
import zama.learning.clamav.demo.enums.VirusScanStatus;

@Getter
@Setter
public class VirusScanResult {

  private VirusScanStatus status;
  private String result;
  private String signature;

  public VirusScanResult() {
    super();
  }

  public VirusScanResult(VirusScanStatus status, String result) {
    super();
    this.status = status;
    this.result = result;
  }

  public VirusScanResult(VirusScanStatus status, String result, String signature) {
    super();
    this.status = status;
    this.result = result;
    this.signature = signature;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Status: ");
    sb.append(status);
    sb.append(System.lineSeparator());

    if (StringUtils.hasText(result)) {
      sb.append("Result: ");
      sb.append(result);
      sb.append(System.lineSeparator());
    }

    if (StringUtils.hasText(signature)) {
      sb.append("Signature: ");
      sb.append(signature);
      sb.append(System.lineSeparator());
    }

    return sb.toString();
  }
}
