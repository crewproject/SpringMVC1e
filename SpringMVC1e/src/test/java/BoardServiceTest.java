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
import com.crew.app.data.BBSUpdateVO;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/*-context.xml" })
/*
 * BoardServiceTest에서 boardService는 {@link com.crew.app.BoardService}를 나타낸다.
 *
 * @see {@link com.crew.app.BoardService}
 */
public class BoardServiceTest {

	@Inject
	BoardService bs;

	// boardService의 createBBS()를 테스트한다.
	@Test @Ignore
	public void testCreateBBS() {
		BBSInsertVO vo = new BBSInsertVO(
				"test", 		//name
				"testEmail",	//email
				"testPass",		//pass
				"testTitle",	//title
				"testComment",	//comment
				"testIP"		//ip
				);
		bs.createBBS(vo);
	}

	// boardService의 getListBBS()를 테스트한다.
	@Test @Ignore
	public void testGetListBBS() {
		List<BBSListVO> bbsList = bs.getListBBS();
		System.out.println("=========boardServiceTest - getList Test============");
		for (BBSListVO vo : bbsList) {
			System.out.println("id : " + vo.getId());
			System.out.println("name : " + vo.getName());
			System.out.println("title : " + vo.getTitle());
			System.out.println("wdate : " + vo.getWdate());
			System.out.println("see : " + vo.getSee());
			System.out.println("=====================");
		}
	}

	// boardService의 getOneBBS()를 테스트한다.
	@Test @Ignore
	public void testGetOneBBS() {
		BBSOneVO vo = bs.getOneBBS("1");
		System.out.println("=========boardServiceTest - getOne Test============");
		System.out.println(vo);
		System.out.println("id : " + vo.getId());
		System.out.println("name : " + vo.getName());
		System.out.println("pass : " + vo.getPass());
		System.out.println("title : " + vo.getTitle());
		System.out.println("comment : " + vo.getComment());
		System.out.println("wdate : " + vo.getWdate());
		System.out.println("see : " + vo.getSee());
	}
	
	//boardService의 modifyBBS()를 테스트한다.
	@Test @Ignore
	public void testModifyBBS() {
		BBSUpdateVO vo = new BBSUpdateVO(
				2,					//id
				"update title",		//title
				"update comment"	//comment
				);
		bs.modifyBBS(vo);
	}

	// boardService의 removeBBS()를 테스트한다.
	@Test @Ignore
	public void testRemoveBBS() {
		String id = "12";
		bs.removeBBS(id);
	}
}
