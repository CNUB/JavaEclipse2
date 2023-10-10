package chap_15;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

// GUI 클래스 - 이벤트 포함 
class JLabel1 extends JFrame implements ActionListener{
	private JLabel result = new JLabel();
	public ImageIcon img1, img2;
	
	public JLabel1() {
		// 이미지 생성
		img1 = new ImageIcon("image\\apple.jpg");
		img2 = new ImageIcon("image/pear.jpg");
		
		// 버튼 생성
		JButton apple = new JButton("사과");
		JButton pear = new JButton("배");
		
		// 컨테이너 생성
		Container ct = getContentPane();
							
		// 배치 관리자 설정, FlowLayout
		ct.setLayout(new FlowLayout(30, 10, 30));
		
		// 컨테이너에 버튼과 레이블 등록
		ct.add(apple);
		ct.add(pear);
		ct.add(result);
		
		// 버튼에 리스너 등록
		apple.addActionListener(this);
		pear.addActionListener(this);
				
		setTitle("라벨 테스트1");
		setSize(300, 200);
					
		// 윈도우 창 종료시 프로세스 닫기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
													
		// 프레임을 화면에 출력
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "사과") {
			result.setIcon(img1);
			result.setText("싸과");
		}
		else {
			result.setIcon(img2); 
			result.setText("배배");
		}
	}
	
}


public class JLabelTest1 {
	public static void main(String[] args) {
		new JLabel1();
	}

}
