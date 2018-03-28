package com.edu.yccc.richardyorke.recursion;

import java.io.File;

public class Recursive {

	public void walkDirectories (String filePath)
	{

		// 1. List files
		File f = new File(filePath);
		File[] files = f.listFiles();
		if(files != null) {for (int x= 0; x < files.length; x++)
		{
			System.out.println(files[x].getAbsolutePath());
			if(files[x].isDirectory())
			{
				walkDirectories(files[x].getAbsolutePath());
			}

		}

		}

		// 2. If a directory exists, call self, pass the directory path.
	}

	public static void main(String[] args) {

		Recursive r = new Recursive();
		r.walkDirectories("C:\\");
	}

}
