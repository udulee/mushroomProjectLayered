package lk.ijse.mushroom.dao.custom;

import lk.ijse.mushroom.dto.EmployeeDTO;
import lk.ijse.mushroom.util.CrudUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public interface EmployeeDAO {
    public boolean add(EmployeeDTO employeeDTO) throws SQLException;
    public boolean update(EmployeeDTO employeeDTO) throws SQLException;
    public boolean delete(EmployeeDTO employeeDTO) throws SQLException;
    public ArrayList<EmployeeDTO> getAll() throws SQLException;
    public int getNextId() throws SQLException;
}
