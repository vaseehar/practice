package arrays;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepeatedDNASequences_187 {

	public static void main(String[] args) throws IOException {
		// System.out.println(new
		// RepeatedDNASequences_187().findRepeatedDnaSequences1("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"));
		// System.out.println(new
		// RepeatedDNASequences_187().findRepeatedDnaSequences1("AAAAAAAAAAAAA"));
		String a = Files.readAllLines(Paths.get("C:\\Users\\vaseehar\\Desktop\\a.txt")).get(0);
		System.out.println(new RepeatedDNASequences_187().findRepeatedDnaSequences1(a));
	}

	public List<String> findRepeatedDnaSequences(String s) {
		if (s.length() < 10) {
			return new ArrayList<String>();
		}
		List<String> res = new ArrayList<>();
		String seg;
		for (int i = 0; i < s.length() - 9; i++) {
			seg = s.substring(i, i + 10);
			if (res.contains(seg))
				continue;
			innerloop: for (int j = i + 10; j < s.length() - 9; j++) {
				if (s.substring(j, j + 10).equals(seg)) {
					res.add(seg);
					break innerloop;
				}
			}
			if (i >= 10) {
				innerloop1: for (int j = 0; j < i - 10; j++) {
					if (s.substring(j, j + 10).equals(seg)) {
						res.add(seg);
						break innerloop1;
					}

				}
			}
		}
		return res;
	}
	// changed from list to hashset to improve speed
	public List<String> findRepeatedDnaSequences1(String s) {
		if (s.length() < 10) {
			return new ArrayList<String>();
		}
		Set list = new HashSet(), res = new HashSet();
		String seg;
		for (int i = 0; i < s.length() - 9; i++) {
			seg = s.substring(i, i + 10);
			if (list.contains(seg)) {
				if (!res.contains(seg)) {
					res.add(seg);
				}
				continue;
			} else {
				list.add(seg);
			}
		}
		return new ArrayList<>(res);
	}
}
