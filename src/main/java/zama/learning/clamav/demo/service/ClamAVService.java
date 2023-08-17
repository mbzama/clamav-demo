package zama.learning.clamav.demo.service;

import java.io.IOException;
import java.io.InputStream;

import zama.learning.clamav.demo.dto.VirusScanResult;

public interface ClamAVService {

	boolean ping();
	
	VirusScanResult scan(InputStream inputStream) throws IOException;

}
