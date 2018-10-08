package leetcode;

public class LeetCode2 {
	int val;
	LeetCode2 next;

	LeetCode2(int x) {
		val = x;
	}

	public static void main(String[] args) {
		LeetCode2 l1 = new LeetCode2(101);
		LeetCode2 l2 = new LeetCode2(201);
		
		System.out.println(addTwoNumbers(l1, l2).val);

	}

	public static LeetCode2 addTwoNumbers(LeetCode2 l1, LeetCode2 l2) {
		LeetCode2 dummyHead = new LeetCode2(0);
		LeetCode2 p = l1, q = l2, curr = dummyHead;
		int carry = 0;
		while (p != null || q != null) {
			int x = (p != null) ? p.val : 0;
			int y = (q != null) ? q.val : 0;
			int sum = carry + x + y;
			carry = sum / 10;
			curr.next = new LeetCode2(sum % 10);
			System.out.println(curr.next.val);
			curr = curr.next;
			if (p != null)
				p = p.next;
			if (q != null)
				q = q.next;
		}
		if (carry > 0) {
			curr.next = new LeetCode2(carry);
		}
		return dummyHead.next;
	}
}
