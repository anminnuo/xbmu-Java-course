package reciting_words;

import java.awt.*; 
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.*; 

import java.util.List;
import java.util.ArrayList;

public class reciting_words extends JFrame { 
	int m;
	public reciting_words(){   
		setSize(600, 150);// ���ô����С 
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);// �����رհ�ťʱ�رմ��� 
		
	    getContentPane().setLayout(new FlowLayout());
	    // ���ò��� 
	    final String file="E:\\xbmu-courses\\JAVA���Գ������\\doctor-�����������������\\edict.txt";
		List<String> word=new ArrayList<String>();
		List<String> chinese=new ArrayList<String>();             
               try
              {
                       BufferedReader reader=new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
                       String content=null;
                       
                        while((content=reader.readLine())!= null) 
                        {
                        	String ary[] = content.trim().split("\\s+");
                        	word.add(ary[0]);
                        	chinese.add(ary[1]);
                        }
                       reader.close();
                } catch (IOException e) {//Exception eҲ����
                        e.printStackTrace();
                }
               String[] firstColAry = word.toArray(new String[0]);
               String[] secondColAry = chinese.toArray(new String[0]);
		/*
		 * for(int i = 0; i < firstColAry.length; i++){
		 * System.out.println(firstColAry[i] + "\t" + secondColAry[i]);
		 */
	   //String word[]=new String[] {"person","pen","car"};
	    //String chinese[]=new String[] {"��","�ֱ�","��"};
                 JFrame.setDefaultLookAndFeelDecorated(true);
	    int l=(int)(Math.random()*10)%firstColAry.length; m=l;
	    JFrame Recite_word=new JFrame("AM start reciting words.");
	    		JLabel l1=new JLabel("���ģ�"+secondColAry[m]);
	    		JLabel l2=new JLabel("Ӣ�ģ�");
	    		JLabel l3=new JLabel();
	    		JLabel l4=new JLabel();
	    		JButton b1=new JButton("��һ��");
	    		JButton b2=new JButton("��ʾ");
	    		final JTextField t1=new JTextField();
	    		Recite_word.setBounds(300, 300, 400, 250);
	    		Recite_word.setVisible(true);
	    		Recite_word.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    		Recite_word.setLayout(null); 
	    		Recite_word.add(l1);
	    		Recite_word.add(l2);
	    		Recite_word.add(l3);
	    		Recite_word.add(l4);
	    		Recite_word.add(b1);
	    		Recite_word.add(b2);
	    		Recite_word.add(t1);
	    		l1.setBounds(40,40,400,20);
	    		l2.setBounds(40,80,100,20);
	    		l3.setBounds(40,120,200,20);
	    		l4.setBounds(40,160,200,20);
	    		t1.setBounds(80,80,100,20);
	    		b1.setBounds(250,40,80,20);
	    		b2.setBounds(250,80,80,20);
	    		b1.addMouseListener(new MouseListener() {
	    			public void mouseClicked(MouseEvent e) {
	    				 int l=(int)(Math.random()*10)%firstColAry.length;
	    				  m=l;
	    				 l1.setText("���ģ�"+secondColAry[m]);
	    			}
	    			public void mousePressed(MouseEvent e) {}
	    			public void mouseReleased(MouseEvent e) {}
	    			public void mouseEntered(MouseEvent e) {}
	    			public void mouseExited(MouseEvent e) {}
	    		});
	    		b2.addMouseListener(new MouseListener() {
	    			public void mouseClicked(MouseEvent e) {
	    			l4.setText("��ʾ��"+firstColAry[m]);	
	    			}
	    			public void mousePressed(MouseEvent e) {}
	    			public void mouseReleased(MouseEvent e) {}
	    			public void mouseEntered(MouseEvent e) {}
	    			public void mouseExited(MouseEvent e) {}
	    		});
	    		t1.addKeyListener(new KeyListener(){
	    			public void keyPressed(KeyEvent e) {
	    			int keyCode=e.getKeyCode();
	    			if(keyCode==KeyEvent.VK_ENTER) {
	    				if(t1.getText().toLowerCase().equalsIgnoreCase(firstColAry[m])) {
	    					l3.setText("��ϲ�㣡����ˣ�");
	    				}
	    				else {
	    					l3.setText("�Բ��𣡴���ˣ�");
	    					t1.setText("");
	    				}
	    			}
	    			}
	    			public void keyTyped(KeyEvent e) {}
	    			public void keyReleased(KeyEvent e) {}
	    		});
	    		}
	
	public static void main(String[] args) {
		reciting_words rw=new reciting_words();
	}
}

    
    

