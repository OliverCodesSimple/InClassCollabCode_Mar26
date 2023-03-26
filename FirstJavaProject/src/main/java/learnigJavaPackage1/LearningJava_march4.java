package learnigJavaPackage1;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class LearningJava_march4 {

	public static void main(String[] args) {
		System.out.println("I am learning too");

		int i = 1;
		int l = ++i + 1 + ++i;
		int j = ++l + 1 + ++i;

		System.out.println(j);
		System.out.println(l);
		System.out.println(i);

	}
}
