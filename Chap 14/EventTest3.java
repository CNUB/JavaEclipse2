/*
독립된 이벤트 처리 클래스를 이용한 이벤트 처리
*/
package chap_14_2;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

// 이벤트 처리 클래스
class EventClass implements ActionListener {
	JLabel jl;
	
	// 생성자를 통해 JLabel 객체 공유
	public EventClass(JLabel jl) {
		this.jl = jl;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		jl.setText(e.getActionCommand());
	}
	
}

// GUI 클래스
class Event3 extends JFrame{
	// JLabel 객체를 속성으로 등록
	JLabel jl; 
		
	// JButton 객체1, 2를 속성으로 등록
	JButton jb1, jb2;
	
	public Event3() {
		// 컨테이너 생성
		Container ct = getContentPane();
					
		// 배치 관리자 설정, FlowLayout
		ct.setLayout(new FlowLayout(30, 10, 30));
			
		jb1 = new JButton("집");
		jb2 = new JButton("가고싶다");
			
		// 레이블 생성
		jl = new JLabel("눌러");
					
		// 컨테이너에 버튼과 레이블 등록
		ct.add(jb1);
		ct.add(jb2);
		ct.add(jl);
			
		// 이벤트를 받아들일 컴포넌트에 리스너 등록
		// 이벤트를 처리할 클래스가 다른 클래스이기 때문에 this가 아닌 new EventProcess()
		jb1.addActionListener(new EventClass(jl));	// 버튼 객체에 리스너 등록.
		jb2.addActionListener(new EventClass(jl));	// 버튼 객체에 리스너 등록.
			
		setTitle("이벤트 테스트3");
		setSize(300, 200);
			
		// 윈도우 창 종료시 프로세스 닫기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
											
		// 프레임을 화면에 출력
		setVisible(true);
	}
}

public class EventTest3 {

	public static void main(String[] args) {
		new Event3();

	}

}
