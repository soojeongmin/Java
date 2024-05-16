package chap99_Homework.homework11;

public class NoticeBoard implements Board {

	@Override
	public void save() {
		System.out.println("공지게시판의 [학습과 관련된 게시물만 올려주세요.]게시글을 저장합니다.");
	}

	@Override
	public void edit() {
		System.out.println("공지게시판의 [소프트웨어 공모전 수상자 발표]게시글을 수정합니다.");
	}

	@Override
	public void delete() {
		System.out.println("공지게시판의 [테스트용]게시글을 삭제합니다.");
	}

	@Override
	public void view() {
		System.out.println("공지게시판의 [5월 학원 연휴 공지]게시글을 조회합니다.");
	}

}
