package com.aws.model;

import org.springframework.stereotype.Component;

@Component
public class SystemInfo {

 private String hostname;
 private String osname;
 private String osversion;
 private String username;
 private String processor;
 private String ip;
 private int cpu;

 
public int getCpu() {
	return cpu;
}
public void setCpu(int cpu) {
	this.cpu = cpu;
}
public String getOsversion() {
	return osversion;
}
public void setOsversion(String osversion) {
	this.osversion = osversion;
}
private String javaversion;
public String getHostname() {
	return hostname;
}
public void setHostname(String hostname) {
	this.hostname = hostname;
}
public String getOsname() {
	return osname;
}
public void setOsname(String osname) {
	this.osname = osname;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getProcessor() {
	return processor;
}
public void setProcessor(String processor) {
	this.processor = processor;
}
public String getIp() {
	return ip;
}
public void setIp(String ip) {
	this.ip = ip;
}
public String getJavaversion() {
	return javaversion;
}
public void setJavaversion(String javaversion) {
	this.javaversion = javaversion;
}
 
 
}
