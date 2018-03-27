import javax.swing.*;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import javax.swing.text.html.HTMLEditorKit;

import com.sun.org.apache.xerces.internal.util.URI.MalformedURIException;

class ReadingFromWeb{
	public static void main(String[] args) throws Exception {
		URL url = new URL("http://www.montclair.edu");

		String str="";
		Scanner input = new Scanner(url.openStream());
		
		while(input.hasNext()){
			str+=input.nextLine();
		}
		System.out.println(str);
		JFrame frame = new JFrame("test");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setLayout(null);
	
		JEditorPane  txt=new JEditorPane();
		JScrollPane scrPn=new JScrollPane(txt);
		txt.setEditorKit(new HTMLEditorKit());
		txt.setPage(url);
		scrPn.setPreferredSize(new Dimension(600, 800));
		frame.getContentPane().add(scrPn);
		frame.pack();
		frame.setVisible(true);
		
	}
}

