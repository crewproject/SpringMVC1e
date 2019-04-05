import java.util.List;

import javax.inject.Inject;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.crew.app.board.service.BoardService;
import com.crew.app.data.BBSInsertVO;
import com.crew.app.data.BBSListVO;
import com.crew.app.data.BBSOneVO;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/**/*-context.xml"})
public class BoardServiceTest {
	
	@Inject
	BoardService bs;
	@Test@Ignore
	public void newBBSTest() {
		BBSInsertVO vo = new BBSInsertVO();
		vo.setName("test");
		vo.setEmail("testEmail");
		vo.setPass("test");
		vo.setTitle("testTitle");
		vo.setComment("testComment");
		vo.setIp("testIP");
		bs.newBBS(vo);
	}
	
	@Test@Ignore
	public void deleteBBSTest() {
		String id= "12";
		bs.deleteBBS(id);
	}

	@Test@Ignore
	public void getListBBSTest() {
		List<BBSListVO> bbsList = bs.getListBBS();
		System.out.println("=========boardServiceTest - getList Test============");
		for(BBSListVO vo : bbsList) {
			System.out.println("id : "+vo.getId());
			System.out.println("name : "+vo.getName());
			System.out.println("title : "+vo.getTitle());
			System.out.println("wdate : "+vo.getWdate());
			System.out.println("see : "+vo.getSee());
			System.out.println("=====================");
		}
	}
	
	@Test@Ignore
	public void getOneBBSTest() {
		BBSOneVO vo = bs.getOneBBS("1");
		System.out.println("=========boardServiceTest - getOne Test============");
		System.out.println(vo);
		System.out.println("id : "+vo.getId());
		System.out.println("name : "+vo.getName());
		System.out.println("pass : "+vo.getPass());
		System.out.println("title : "+vo.getTitle());
		System.out.println("comment : "+vo.getComment());
		System.out.println("wdate : "+vo.getWdate());
		System.out.println("see : "+vo.getSee());
	}
}
