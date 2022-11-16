package manage;

import model.User;
import org.testng.annotations.DataProvider;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProviderWiki {

    @DataProvider
    public static Iterator<Object[]>loginData(){
        List<Object[]>list= new ArrayList<>();
        list.add(new Object[]{User.builder().userName("Evaa1234").password("Eva1234$@").build()});
        list.add(new Object[]{User.builder().userName("julia357").password("Misha*$240613").build()});
        return  list.iterator();
    }


    @DataProvider
    public static Iterator<Object[]> loginDataCsv() throws IOException {
        List<Object[]> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(new File("src/test/resources/data.csv")));
        String line = reader.readLine();
        while (line != null) {
            String[] split = line.split(",");
            list.add(new Object[]{User.builder().userName(split[0]).password(split[1]).build()});
            line = reader.readLine();

        }
        return list.iterator();

    }


}
