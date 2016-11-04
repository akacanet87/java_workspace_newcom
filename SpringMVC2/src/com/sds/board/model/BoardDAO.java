package com.sds.board.model;

import java.util.List;

import com.sds.domain.Board;

//	�������̽��� ������ �ϴ� ����
//	mybatis�� �̿��ϴٰ� ���̹�����Ʈ, jdbc ������ ������ �� ������������ ����.
public interface BoardDAO {

	public List selectAll();
	public Board select(int board_id);
	public int insert(Board board);
	public int update(Board board);
	public int delete(int board_id);
	
}
