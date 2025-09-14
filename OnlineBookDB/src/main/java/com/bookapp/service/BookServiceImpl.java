package com.bookapp.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.DBConnection;
import com.bookapp.util.Queries;

public class BookServiceImpl implements IBookService {

	static Connection connection;

	static {
		connection = DBConnection.openConnection();
	}

	@Override
	public void addBook(Book book) {
		try (PreparedStatement preparedStatement = connection.prepareStatement(Queries.INSERTBOOK)) {
			preparedStatement.setString(1, book.getTitle());
			preparedStatement.setString(2, book.getAuthor());
			preparedStatement.setString(3, book.getCategory());
			preparedStatement.setDouble(4, book.getPrice());
			boolean isInserted = preparedStatement.execute();
			System.out.println("Record Inserted Successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void updateBook(int bookId, double price) {
		try (PreparedStatement preparedStatement = connection.prepareStatement(Queries.UPDATEBOOK);) {
			preparedStatement.setDouble(1, price);
			preparedStatement.setInt(2, bookId);
			preparedStatement.execute();
			System.out.println("Price detail has been updated successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void deleteBook(int bookId) {
		try (PreparedStatement preparedStatement = connection.prepareStatement(Queries.DELETEBOOK);) {
			preparedStatement.setInt(1, bookId);
			preparedStatement.execute();
			System.out.println("Book has been deleted successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Book getById(int bookId) throws BookNotFoundException {
		Book book = null;
		try (PreparedStatement preparedStatement = connection.prepareStatement(Queries.GETBOOKBYID);) {
			preparedStatement.setInt(1, bookId);

			try (ResultSet resultSet = preparedStatement.executeQuery();) {
				
				while (resultSet.next()) {
					String title = resultSet.getString("title");
					String author = resultSet.getString("author");
					String category = resultSet.getString("category");
					Double price = resultSet.getDouble("price");
					book = new Book(title, author, price, category);
				}
				
				if(book==null) {
					throw new BookNotFoundException("No Book found for this Id");
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return book;
	}

	@Override
	public List<Book> getAllBooks() throws BookNotFoundException  {
		List<Book> allBooks = new ArrayList<Book>();
		try (PreparedStatement preparedStatement = connection.prepareStatement(Queries.GETALLBOOK);) {

			try (ResultSet resultSet = preparedStatement.executeQuery();) {
				
				while (resultSet.next()) {
					String title = resultSet.getString("title");
					String author = resultSet.getString("author");
					String category = resultSet.getString("category");
					Double price = resultSet.getDouble("price");
					Book book = new Book(title, author, price, category);
					allBooks.add(book);
				}
				
				if(allBooks.isEmpty()) {
					throw new BookNotFoundException("No Book found");
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		
		return allBooks;
	}

	@Override
	public List<Book> getByAuthor(String author) throws BookNotFoundException {
		List<Book> allBooks = new ArrayList<Book>();
		try (PreparedStatement preparedStatement = connection.prepareStatement(Queries.GETBOOKBYAUTHOR);) {
			preparedStatement.setString(1, author);

			try (ResultSet resultSet = preparedStatement.executeQuery();) {
				
				while (resultSet.next()) {
					String title = resultSet.getString("title");
					String authorName = resultSet.getString("author");
					String category = resultSet.getString("category");
					Double price = resultSet.getDouble("price");
					Book book = new Book(title, authorName, price, category);
					allBooks.add(book);
				}
				
				if(allBooks.isEmpty()) {
					throw new BookNotFoundException("No Book found");
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		
		return allBooks;
	}

	@Override
	public List<Book> getByCategoryLessPrice(String categoryName, double priceValue) throws BookNotFoundException {
		List<Book> allBooks = new ArrayList<Book>();
		try (PreparedStatement preparedStatement = connection.prepareStatement(Queries.GETBOOKBYCATEGORY);) {
			preparedStatement.setString(1, categoryName);
			preparedStatement.setDouble(2, priceValue);

			try (ResultSet resultSet = preparedStatement.executeQuery();) {
				
				while (resultSet.next()) {
					String title = resultSet.getString("title");
					String authorName = resultSet.getString("author");
					String category = resultSet.getString("category");
					Double price = resultSet.getDouble("price");
					Book book = new Book(title, authorName, price, category);
					allBooks.add(book);
				}
				
				if(allBooks.isEmpty()) {
					throw new BookNotFoundException("No Book found");
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		
		return allBooks;
	}

	@Override
	public List<Book> getByTitleContains(String bookTitle) throws BookNotFoundException {
		List<Book> allBooks = new ArrayList<Book>();
		try (PreparedStatement preparedStatement = connection.prepareStatement(Queries.GETBOOKBYTITLE);) {
			preparedStatement.setString(1, "%"+bookTitle+"%");
		

			try (ResultSet resultSet = preparedStatement.executeQuery();) {
				
				while (resultSet.next()) {
					String title = resultSet.getString("title");
					String authorName = resultSet.getString("author");
					String category = resultSet.getString("category");
					Double price = resultSet.getDouble("price");
					Book book = new Book(title, authorName, price, category);
					allBooks.add(book);
				}
				
				if(allBooks.isEmpty()) {
					throw new BookNotFoundException("No Book found");
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		
		return allBooks;
	}

}
