import com.atguigu1.dao.DeptDao;
import com.atguigu1.service.DeptService;
import com.atguigu1.service.impl.DeptServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ControllerTest {
    @Autowired
    private DeptDao dao;
    @Test
    public void getList(){
        DeptService service = new DeptServiceImpl();
        System.out.println(  service.list());

    }
}
