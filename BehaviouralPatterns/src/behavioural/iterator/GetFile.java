package behavioural.iterator;

import java.io.File;

public class GetFile {
	private String rootPath;
	private File[] list;
	private int curr = 0;
	
	public GetFile(String path) {
		this.rootPath = path;
	}
	
	public Iterator<File> iterator() {
		File file = new File(rootPath);
		File[] list = file.listFiles();
		Iterator<File> iterator = new Iterator<File>() {

			@Override
			public boolean hasNext() {
				return list.length > curr;
			}

			@Override
			public File next() {
				return list[curr++];
			}
			
		};
		return iterator;
	}
}
