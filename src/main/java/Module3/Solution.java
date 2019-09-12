package Module2;

import java.util.HashSet;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class Solution {

	class Book {

		Integer publishedDate;
		String title;
		String author;

		public Book(String title, String author,int publishedDate) {
			this.publishedDate = publishedDate;
			this.title = title;
		}


		public Integer getPublishedDate() {
			return publishedDate;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) {
				return true;
			}
			if (o == null || getClass() != o.getClass()) {
				return false;
			}
			Book book = (Book) o;
			return publishedDate.equals(book.publishedDate) &&
					title.equals(book.title) &&
					author.equals(book.author);
		}

		@Override
		public int hashCode() {
			return Objects.hash(publishedDate, title, author);
		}

		@Override
		public String toString() {
			return "Book{" +
					"publishedDate=" + publishedDate +
					", title='" + title + '\'' +
					", author='" + author + '\'' +
					'}';
		}
	}

	String generateRandomWord() {
		Random r = new Random(); // Intialize a Random Number Generator with SysTime as the seed
		StringBuilder sb = new StringBuilder(10);
		for (int i = 0; i < 10; i++) { // For each letter in the word
			char tmp = (char) ('a' + r.nextInt('z' - 'a')); // Generate a letter between a and z
			sb.append(tmp); // Add it to the String
		}
		return sb.toString();
	}

	Integer generateRandomYear() {
		Random r = new Random();
		return ThreadLocalRandom.current().nextInt(1976, 2019);
	}
	Book generateRandomBook()
	{
		return new Book(generateRandomWord(),generateRandomWord(), generateRandomYear());
	}

	void task1()
	{
		Set<Book>set=new HashSet<>();
		for (int i = 0; i <15 ; i++)
		{
			set.add(generateRandomBook());

		}
		for (Book book:set)
		{
			if(book.publishedDate<2010)
			{
				System.out.println(book.toString());
			}
		}

		}

	}


