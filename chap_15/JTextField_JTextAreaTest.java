package chap_15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JTFJTA1 extends JFrame implements ActionListener{
	
	// 텍스트 객체 선언
	private JTextField jtf;
	private JTextArea jta;
	
	// 라벨 객체 생성
	private JLabel jl = new JLabel("입력");
	
	public JTFJTA1() {
		//20자 텍스트 객체 생성
		jtf = new JTextField(20);
		//10줄 20자 텍스트 객체 생성
		jta = new JTextArea(10, 20);
		
		// TextArea 수정 불가 설정
		jta.setEditable(false);
		
		// 컨테이너 생성
		Container ct = getContentPane();
		
		// 배치 관리자 설정, FlowLayout
		ct.setLayout(new FlowLayout());
		
		// 패널 객체 생성
		JPanel p1 = new JPanel();
		
		// 패널에 추가
		p1.add(jtf);
		p1.add(jta);
		
		// 컨테이너에 추가
		ct.add(p1);
		ct.add(jl);
		
		// 컴포넌트에 리스너 등록
		jtf.addActionListener(this);
		
		setTitle("JTextField && JTextArea");
		setSize(400, 300);
					
		// 윈도우 창 종료시 프로세스 닫기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
													
		// 프레임을 화면에 출력
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(jta.getLineCount() <= jta.getRows()) { // TextArea의 크기(줄)보다 작을때
			jta.append(e.getActionCommand() + "\n"); // output에 글 내용 추가
			jtf.setText(""); // 글 내용을 지워 다음 입력시 공백으로 나오게 한다
		}
		else { // TextArea의 크기(줄)보다 클때
			jl.setText("입력 종료");
			//  크기를 넘어서면 라벨을 출력하고 텍스트 필드 수정불가로 설정
			jtf.setEditable(false);
		}
		
	}
	
}

public class JTextField_JTextAreaTest {

	public static void main(String[] args) {		
		new JTFJTA1();
	}

}
