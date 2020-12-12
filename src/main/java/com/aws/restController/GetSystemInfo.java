package com.aws.restController;

import java.io.File;
import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aws.model.SystemInfo;

@RestController
public class GetSystemInfo {

	@Autowired
	private com.aws.model.SystemInfo sys;

	@Value("${file.upload.path}")
	private String path;

	@GetMapping("/check")
	public String checkApp() {
		return "App is up";
	}

	@GetMapping("/details")
	public SystemInfo getSysDetails() {

		try {
			sys.setHostname(InetAddress.getLocalHost().getHostName());
			sys.setIp(InetAddress.getLocalHost().getHostAddress());
			sys.setJavaversion(System.getProperty("java.version"));
			sys.setOsname(System.getProperty("os.name"));
			sys.setProcessor(System.getProperty("os.arch"));
			sys.setUsername(System.getProperty("user.name"));
			sys.setOsversion(System.getProperty("os.version"));
			sys.setCpu(Runtime.getRuntime().availableProcessors());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sys;

	}

	@GetMapping("/files")
	public String[] getFiles() {

		File file = new File(path);

		String[] files = file.list();

		return files;
	}
}
