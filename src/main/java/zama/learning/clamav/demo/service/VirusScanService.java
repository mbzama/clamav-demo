package zama.learning.clamav.demo.service;

import org.springframework.web.multipart.MultipartFile;

import zama.learning.clamav.demo.dto.VirusScanResult;

public interface VirusScanService {

  VirusScanResult virusScan(MultipartFile file);

}
