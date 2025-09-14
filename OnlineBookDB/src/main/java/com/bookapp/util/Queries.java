package com.bookapp.util;

public class Queries {
	
	public static final String CREATETABLE="""
			create table Book(bookId int auto_increment primary key,
			title varchar(20), author varchar(20),category varchar(20), price float)
			""";
	public static final String INSERTBOOK = """
			insert into Book(title, author, category, price) values (?,?,?,?)
			""";
	public static final String UPDATEBOOK = """
			update Book set price=? where bookId=?;
			""";
	public static final String DELETEBOOK = """
			delete from Book where bookId=?;
			""";
	public static final String GETBOOKBYID = """
			Select * from Book where bookId=?;
			""";
	public static final String GETALLBOOK = """
			Select * from Book;
			""";
	public static final String GETBOOKBYAUTHOR = """
			Select * from Book where author=?;
			""";
	public static final String GETBOOKBYCATEGORY = """
			Select * from Book where category=? AND price<? ;
			""";
	public static final String GETBOOKBYTITLE = """
			Select * from Book where title LIKE ?;
			""";
}
