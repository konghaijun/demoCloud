package org.springblade.demo;

import org.springblade.core.cloud.client.BladeCloudApplication;
import org.springblade.core.launch.BladeApplication;

@BladeCloudApplication
public class MeetingApplication {
	public static void main(String[] args) {
		BladeApplication.run("test-demo", MeetingApplication.class, args);
	}
}
