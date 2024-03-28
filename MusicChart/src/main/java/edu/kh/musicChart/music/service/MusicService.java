package edu.kh.musicChart.music.service;

import java.sql.Connection;
import java.util.List;

import edu.kh.musicChart.music.model.dao.MusicDAO;
import edu.kh.musicChart.music.model.dto.MusicChart;
import static edu.kh.musicChart.common.JDBCTemplate.*;

public class MusicService {
	
	private MusicDAO dao = new MusicDAO();

	/** 모든 노래 담기
	 * @return musicList
	 */
	public List<MusicChart> selectAll() throws Exception{
		
		Connection conn = getConnection();
		
		List<MusicChart> musicList = dao.selectAll(conn);
		
		close(conn);
		
		
		return musicList;
	}
 
	/** 노래 정보 담기
	 * @param songNo
	 * @return musicChart
	 */
	public MusicChart selectOne(int songNo) throws Exception{
		
		Connection conn = getConnection();
		
		MusicChart musicChart = dao.selectOne(conn, songNo);
		
		close(conn);
		
		return musicChart;
	}
	
}
