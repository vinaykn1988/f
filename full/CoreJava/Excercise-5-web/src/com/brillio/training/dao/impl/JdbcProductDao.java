package com.brillio.training.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.brillio.training.dao.DaoException;
import com.brillio.training.dao.ProductDao;
import com.brillio.training.entity.Product;
import com.brillio.training.util.DbUtil;

public class JdbcProductDao implements ProductDao {

	
	@Override
	public void addProduct(Product product) throws DaoException {
		Connection conn = null;
		PreparedStatement stmt = null;

		try {
			conn = DbUtil.getConnection();
			String sql = "insert into products values(?,?,?,?,?,?,?,?,?,?)";
			stmt = conn.prepareStatement(sql);

			stmt.setInt(1, product.getProductId());
			stmt.setString(2, product.getProductName());
			stmt.setInt(3, product.getSupplierId());
			stmt.setInt(4, product.getCategoryId());
			stmt.setString(5, product.getQuantityPerUnit());
			stmt.setDouble(6, product.getUnitPrice());
			stmt.setInt(7, product.getUnitsInStock());
			stmt.setInt(8, product.getUnitsOnOrder());
			stmt.setInt(9, product.getReorderLevel());
			stmt.setInt(10, product.getDiscontinued());

			stmt.execute();

		} catch (SQLException e) {
			throw new DaoException(e);
		} finally {
			DbUtil.releaseResources(conn, stmt, null);
		}
	}

	@Override
	public Product getProduct(int productId) throws DaoException {
		Product product = null;
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = DbUtil.getConnection();
			String sql = "select * from products where product_id = ?";
			stmt = conn.prepareStatement(sql);

			stmt.setInt(1, productId);

			rs = stmt.executeQuery();

			if (rs.next()) {
				product = new Product();
				product.setProductId(productId);
				product.setProductName(rs.getString("product_name"));
				product.setQuantityPerUnit(rs.getString("quantity_Per_Unit"));
				product.setSupplierId(rs.getInt("supplier_Id"));
				product.setCategoryId(rs.getInt("category_Id"));
				product.setUnitPrice(rs.getDouble("unit_Price"));
				product.setUnitsInStock(rs.getInt("units_In_Stock"));
				product.setUnitsOnOrder(rs.getInt("units_On_Order"));
				product.setReorderLevel(rs.getInt("reorder_Level"));
				product.setDiscontinued(rs.getInt("discontinued"));
			}

		} catch (SQLException e) {
			throw new DaoException(e);
		} finally {
			DbUtil.releaseResources(conn, stmt, rs);
		}

		return product;
	}

	@Override
	public void updateProduct(Product product) throws DaoException {
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			conn = DbUtil.getConnection();
			String sql = "update products set product_name = ?, " + "supplier_id = ?, category_id=?, "
					+ "quantity_per_unit = ?, unit_price=?, " + "units_in_stock=?, units_on_order=?, "
					+ "reorder_level=?, discontinued=? " + "where product_id=?";

			stmt = conn.prepareStatement(sql);

			stmt.setString(1, product.getProductName());
			stmt.setInt(2, product.getSupplierId());
			stmt.setInt(3, product.getCategoryId());
			stmt.setString(4, product.getQuantityPerUnit());
			stmt.setDouble(5, product.getUnitPrice());
			stmt.setInt(6, product.getUnitsInStock());
			stmt.setInt(7, product.getUnitsOnOrder());
			stmt.setInt(8, product.getReorderLevel());
			stmt.setInt(9, product.getDiscontinued());
			stmt.setInt(10, product.getProductId());

			stmt.execute();

		} catch (SQLException e) {
			throw new DaoException(e);
		} finally {
			DbUtil.releaseResources(conn, stmt, null);
		}
	}

	@Override
	public void deleteProduct(int productId) throws DaoException {
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			conn = DbUtil.getConnection();
			String sql = "delete from products where product_id = ?";
			stmt = conn.prepareStatement(sql);

			stmt.setInt(1, productId);

			stmt.execute();

		} catch (SQLException e) {
			throw new DaoException(e);
		} finally {
			DbUtil.releaseResources(conn, stmt, null);
		}
	}

	@Override
	public List<Product> getAllProducts() throws DaoException {
	 Product product = null;
	List<Product> products = new ArrayList<Product>();
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = DbUtil.getConnection();
			String sql = "select * from products";
			stmt = conn.prepareStatement(sql);

			rs = stmt.executeQuery();

			common(products, rs);

		} catch (SQLException e) {
			throw new DaoException(e);
		} finally {
			DbUtil.releaseResources(conn, stmt, rs);
		}

		return products;
	}

	@Override
	public List<Product> getProductsByPriceRange(double min, double max) throws DaoException {
		Product product = null;
		List<Product> products = new ArrayList<Product>();
			Connection conn = null;
			PreparedStatement stmt = null;
			ResultSet rs = null;
			try {
				conn = DbUtil.getConnection();
				String sql = "select * from products where unit_price between ? and ?";
				stmt = conn.prepareStatement(sql);
				stmt.setDouble(1, min);
				stmt.setDouble(2, max);
				rs = stmt.executeQuery();

				common(products, rs);

			} catch (SQLException e) {
				throw new DaoException(e);
			} finally {
				DbUtil.releaseResources(conn, stmt, rs);
			}

			return products;
	}

	@Override
	public List<Product> getProductsByCategory(int categoryId) throws DaoException {
		Product product = null;
		List<Product> products = new ArrayList<Product>();
			Connection conn = null;
			PreparedStatement stmt = null;
			ResultSet rs = null;
			try {
				conn = DbUtil.getConnection();
				String sql = "select * from products where category_Id = ?";
				stmt = conn.prepareStatement(sql);
				stmt.setInt(1, categoryId);
				
				rs = stmt.executeQuery();
				common(products, rs);

			} catch (SQLException e) {
				throw new DaoException(e);
			} finally {
				DbUtil.releaseResources(conn, stmt, rs);
			}

			return products;
	}

	private List<Product> common(List<Product> products, ResultSet rs) throws SQLException {
		Product product;
		while (rs.next()) {
			product = new Product();
			product.setProductId(rs.getInt("product_Id"));
			product.setProductName(rs.getString("product_name"));
			product.setQuantityPerUnit(rs.getString("quantity_Per_Unit"));
			product.setSupplierId(rs.getInt("supplier_Id"));
			product.setCategoryId(rs.getInt("category_Id"));
			product.setUnitPrice(rs.getDouble("unit_Price"));
			product.setUnitsInStock(rs.getInt("units_In_Stock"));
			product.setUnitsOnOrder(rs.getInt("units_On_Order"));
			product.setReorderLevel(rs.getInt("reorder_Level"));
			product.setDiscontinued(rs.getInt("discontinued"));
			products.add(product);
		}
		return products;
	}

	@Override
	public List<Product> getProductsBySupplier(int supplierId) throws DaoException {
		Product product = null;
		List<Product> products = new ArrayList<Product>();
			Connection conn = null;
			PreparedStatement stmt = null;
			ResultSet rs = null;
			try {
				conn = DbUtil.getConnection();
				String sql = "select * from products where supplier_Id = ?";
				stmt = conn.prepareStatement(sql);
				stmt.setInt(1, supplierId);
				
				rs = stmt.executeQuery();

				common(products, rs);

			} catch (SQLException e) {
				throw new DaoException(e);
			} finally {
				DbUtil.releaseResources(conn, stmt, rs);
			}

			return products;
	}


	@Override
	public List<Product> getProductsInStock() throws DaoException {
		Product product = null;
		List<Product> products = new ArrayList<Product>();
			Connection conn = null;
			PreparedStatement stmt = null;
			ResultSet rs = null;
			try {
				conn = DbUtil.getConnection();
				String sql = "select * from products where units_in_stock > 0";
				stmt = conn.prepareStatement(sql);
				
				rs = stmt.executeQuery();

				common(products, rs);

			} catch (SQLException e) {
				throw new DaoException(e);
			} finally {
				DbUtil.releaseResources(conn, stmt, rs);
			}

			return products;
	}


	@Override
	public List<Product> getProductsNotInStock() throws DaoException {
		Product product = null;
		List<Product> products = new ArrayList<Product>();
			Connection conn = null;
			PreparedStatement stmt = null;
			ResultSet rs = null;
			try {
				conn = DbUtil.getConnection();
				String sql = "select * from products where units_in_stock = 0";
				stmt = conn.prepareStatement(sql);
				
				rs = stmt.executeQuery();

				common(products, rs);

			} catch (SQLException e) {
				throw new DaoException(e);
			} finally {
				DbUtil.releaseResources(conn, stmt, rs);
			}

			return products;
	}

}
