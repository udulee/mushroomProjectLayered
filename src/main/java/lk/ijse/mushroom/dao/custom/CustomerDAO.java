package lk.ijse.mushroom.dao.custom;

import lk.ijse.mushroom.dto.CustomerDTO;
import lk.ijse.mushroom.util.CrudUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public interface CustomerDAO {

    public boolean add(CustomerDTO customerDTO) throws SQLException;
    public boolean update(CustomerDTO customerDTO) throws SQLException;
    public boolean delete(int id) throws SQLException;
    public ArrayList<CustomerDTO> getAll() throws SQLException;
    public int getNextId() throws SQLException;

}
