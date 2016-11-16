package gifprogram;

import java.io.File;
import java.util.*;
import ecs100.*; 

public class ezgif {
	private ArrayList<Frame> frameList;

	public ezgif(){
		UI.addButton("Select Video", this::getVideo);		
		frameList = new ArrayList<Frame>();
		mainloop();
	}

	private void mainloop(){
	}

	public File getVideo(){
		String filename = UIFileChooser.open();
		File f = new File(filename);
		return f;
	}

	public static void main(String[] args){
		new ezgif();		
	}
}
