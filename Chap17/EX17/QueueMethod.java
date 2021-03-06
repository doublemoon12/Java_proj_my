package Chap17.EX17;

import java.util.LinkedList;
import java.util.Queue;

//Queue	: FIFO(First In First Out)	: 처음 들어간 값이 처음 나옴

public class QueueMethod {

	public static void main(String[] args) {

		Queue<Integer> queue1 = new LinkedList<Integer>();
		
		//1. 예외 처리를 포함한 메소드 (add(), element(), remove())
			//1) add() : 큐에 값을 추가할때.
		//System.out.println(queue1.element());
		queue1.add(3);
		queue1.add(4);
		queue1.add(5);
		
		//2) element();
		System.out.println(queue1.element());	//제일처음 나올 값을 확인
		System.out.println();
		
		
		//3) E remove() : 큐의 값을 끄집어 낼때 사용.
		System.out.println(queue1.remove());
		System.out.println(queue1.remove());
		System.out.println(queue1.remove());
		//System.out.println(queue1.remove());	//모두 끄집어 내고나서 끄집어낼때 예외 발생
		System.out.println();
		
		
		//2. 예외처리 포함 메소드(offer(), peek(), poll())
		Queue<Integer> queue2 = new LinkedList<Integer>();
		
		System.out.println(queue2.peek());	//예외처리가 되어 오류가 발생되지 않음.
		
		//1) offer(E item)	: 값을 추가
		queue2.offer(3);
		queue2.offer(4);
		queue2.offer(5);
		
		//2) E Peek()	: 출력할 값을 미리 보는 것
		System.out.println(queue2.peek());	
		
		//3) poll()값을 끄집어 내기
		System.out.println(queue2.poll());
		System.out.println(queue2.poll());
		System.out.println(queue2.poll());
		
		
	}

}
