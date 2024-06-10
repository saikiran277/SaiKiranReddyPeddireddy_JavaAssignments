package com.ey.day9_ques1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;





public class Author {
	public static void main(String[] args) {
		Author1[] a= {new Author1(1111l, "peddireddy", "saikiran", "Reddy", LocalDate.of(2002, 6, 26), "male", "Guntur", 1234l),
				new Author1(2222l, "sree", "leel", "pandit", LocalDate.of(2002, 8, 6), "female", "prakasam", 5678l), 
				new Author1(3333l, "bolla", "devender", "reddy", LocalDate.of(2002, 8, 6), "male", "bangalore", 1231l),
				new Author1(4444l, "chunchu", "ramesh", "chowdary", LocalDate.of(2002, 8, 6), "male", "ongole", 1223l)};
		List<Author1> a1=new ArrayList<>(Arrays.asList(a));
		AuthorServiceImp1 as=new AuthorServiceImp1();
		System.out.println(as.getUniqueSurnames(a1));
		System.out.println(as.getAuthorsByCity(a1, "ongole"));
		System.out.println(as.femaleAverageAge(a1));
		System.out.println(as.getMobileByAdhar(a1,1111l));
	}
}