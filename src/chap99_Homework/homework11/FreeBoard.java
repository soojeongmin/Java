package chap99_Homework.homework11;

public class FreeBoard implements Board {

	@Override
	public void save() {
		System.out.println("자유게시판의 [FACT)자바는 재밌는게 사실임]게시글을 저장합니다.");
	}

	@Override
	public void edit() {
		System.out.println("자유게시판의 [자바는 배우기 어려움]게시글을 수정합니다.");
	}

	@Override
	public void delete() {
		System.out.println("자유게시판의 [자바고 나발이고 그만해라]게시글을 삭제합니다.");
	}

	@Override
	public void view() {
		System.out.println("자유게시판의 [언어별 티어 정리해줌]게시글을 조회합니다.");
	}

}
