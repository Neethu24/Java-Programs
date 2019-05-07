package org.java.prog;

import java.io.File;
import java.io.IOException;
import java.util.*;

import org.apache.commons.io.FileUtils;
public class FileOpr {
public static void main(String[] args) throws IOException {
	File f = new File("/Users/Nivethaa/worknature.pages");
	List<String> rl = FileUtils.readLines(f);
	for (String s : rl) {
		System.out.println(s);
	}
}
}
