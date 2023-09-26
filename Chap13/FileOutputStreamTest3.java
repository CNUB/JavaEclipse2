package chap_13;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputStreamTest3 {

	public static void main(String[] args) throws IOException {
Scanner sc = new Scanner(System.in);
		
		System.out.print("출력 파일명 입력 : ");
		
		// 파일명 저장
		String testFile = sc.next();
		
		// 읽어들인 파일명으로 객체 생성
		FileOutputStream fos = new FileOutputStream(testFile);
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeBoolean(false);
		dos.writeByte(Byte.MAX_VALUE);
		dos.writeChar('김');
		dos.writeDouble(Double.MAX_VALUE);
		dos.writeFloat(Float.MAX_VALUE);
		dos.writeInt(Integer.MAX_VALUE);
		dos.writeLong(Long.MAX_VALUE);
		dos.writeShort(Short.MAX_VALUE);
		
		fos.close();
		System.out.println(testFile + "파일이 생성되었습니다.");
		
		System.out.print("입력 파일명 입력 : ");
		testFile = sc.next();
		
		FileInputStream fis = new FileInputStream(testFile); // 파일명으로 객체 생성
		DataInputStream dis = new DataInputStream(fis); // 생성된 객체를 이용해 DataInputStream 객체 생성
		
		System.out.println(dis.readBoolean());
		System.out.println(dis.readByte());
		System.out.println(dis.readChar());
		System.out.println(dis.readDouble());
		System.out.println(dis.readFloat());
		System.out.println(dis.readInt());
		System.out.println(dis.readLong());
		System.out.println(dis.readShort());
		
		fis.close();
	}

}
