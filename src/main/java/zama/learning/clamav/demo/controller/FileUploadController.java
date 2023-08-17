package zama.learning.clamav.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import lombok.extern.slf4j.Slf4j;
import zama.learning.clamav.demo.dto.VirusScanResult;
import zama.learning.clamav.demo.service.VirusScanService;

@Slf4j
@Controller
public class FileUploadController {

  @Autowired
  private VirusScanService virusScanService;

  @GetMapping("/index")
  public String home() {
    return "index";
  }

  @PostMapping("/upload")
  public ResponseEntity<VirusScanResult> handleFileUpload(
      @RequestParam("file") MultipartFile file) {
	log.info("file -> Name: {}, Size: {}", file.getName(), file.getSize());
    return ResponseEntity.ok(virusScanService.virusScan(file));
  }

}
