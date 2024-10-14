package main;

import org.junit.Test;
import top.mryan2005.managesysteminjava.SQLLinker;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SQLLinkerTest {
    public SQLLinker mysql;
    @Test
    public void TestConnectSQL() throws SQLException, ClassNotFoundException {
        mysql = new SQLLinker("MySQL", "127.0.0.1", "3800", "root", "123456", "testDatabase");
        assertTrue(mysql.testConnection());
    }

    @Test
    public void TestCloseConnect() throws SQLException, ClassNotFoundException {
        assertTrue(mysql.closeConnection());
    }
}
