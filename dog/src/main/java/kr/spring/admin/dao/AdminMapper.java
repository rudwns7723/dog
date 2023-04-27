package kr.spring.admin.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Update;

import kr.spring.member.vo.MemberVO;

public interface AdminMapper {

	//회원 관리
	public List<MemberVO> selectList(Map<String, Object> map);
	public int selectRowCount(Map<String, Object> map);
	@Update("UPDATE member SET auth=#{auth} WHERE mem_num=#{mem_num}")
	public void updateByAdmin(MemberVO memberVO);
	
}