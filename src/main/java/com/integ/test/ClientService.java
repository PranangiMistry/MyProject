package com.integ.test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Author: mpanchal
 * Date: 1/25/18 1:55 PM
 */
public class ClientService {

    GetDBConnection getDBConnection=new GetDBConnection();
    Connection con=getDBConnection. connectMyDB();

    public int insertDetail(Client client){

        System.out.println(client);
        int rs=0;
        try {
            Statement st = con.createStatement();
            rs=st.executeUpdate("INSERT INTO client(clientID,clientName,clientCode,streetName1,streetName2,city,state,country,zipCode,contactName,contactEmail,contactCell,contactPhone) VALUES(UPDATE_SEQUENCE.NEXTVAL,'"+client.clientName+"','"+client.clientCode+"','"+client.streetName1+"','"+client.streetName2+"','"+client.city+"','"+client.state+"','"+client.country+"','"+client.zipCode+"','"+client.contactName+"','"+client.contactEmail+"','"+client.contactCell+"','"+client.contactPhone+"')");
            System.out.println(rs);
            return  rs;
        }
        catch(Exception e){
            System.out.println("ex");
            System.out.println( e);
            return rs;
        }
//        Client newClient=new Client();
//        newClient.setClientId(client.clientId);
//        newClient.setClientName(client.clientName);


//        try{
//            Statement statement=con.createStatement();
//             rs=statement.executeUpdate("INSERT INTO client(clientId,clientName,clientCode,streetName1,streeName2,city,state,country,zipCode,contactName,contactEmail,contactCell,contactphone) VALUES(2,'jay','jay','maniyasa','maninagar','ahmedabad','gujrat','india','38008','jay','jay@','6667858','6696') ");
//             return  rs;
//        }
//        catch (Exception e){
//            System.out.println(e);
//            return rs;
//        }
    }


    public List<Client> retriveDeatils(){
        List<Client> list =new ArrayList<Client>();

        try{
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from client");

            while (rs.next()){
                int i=0;
                Client client=new Client();
                client.setClientId(rs.getInt(1));
                client.setClientName(rs.getString(2));
                client.setClientCode(rs.getString(3));
                client.setStreetName1(rs.getString(4));
                client.setStreetName2(rs.getString(5));
                client.setCity(rs.getString(6));
                client.setState(rs.getString(7));
                client.setCountry(rs.getString(8));
                client.setZipCode(rs.getString(9));
                client.setContactName(rs.getString(10));
                client.setContactEmail(rs.getString(11));
                client.setContactCell(rs.getString(12));
                client.setContactPhone(rs.getString(13));
                System.out.println(i);
                i=i+1;
                list.add(client);
                System.out.println(client);

            }
        }
        catch (Exception e){
            System.out.println("ex");
            System.out.println(e);
        }
        return list;
    }
}
