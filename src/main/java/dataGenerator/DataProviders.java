package dataGenerator;

import org.testng.annotations.DataProvider;

public class DataProviders {
    @DataProvider(name = "failedLogin")
    public Object[][] getDataFromDataProvider(){
        return new Object[][]
                {
                        {DataCreation.generateEmail(), DataCreation.generatePassword(),"There is 1 error\nAuthentication failed."},
                        {"", DataCreation.generatePassword(),"There is 1 error\nAn email address required."},
                        {DataCreation.generateEmail(),"","There is 1 error\nPassword is required."},
                        {"","","There is 1 error\nAn email address required."}
                };
    }
}
