package dao;

import java.util.List;

import domain.ProjectTeamBean;

public class ProjectTeamDAOImpl implements ProjectTeamDAO{

	private static ProjectTeamDAO  instance = new ProjectTeamDAOImpl();
	public static ProjectTeamDAO getInstance() {return instance;}
	private ProjectTeamDAOImpl() {}
	@Override
	public void insertProjectTeam(ProjectTeamBean team) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ProjectTeamBean> selectAllTeam() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProjectTeamBean> selectTeamByTeamName(String teamName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProjectTeamBean selectTeamByTeamId(String teamId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int teamCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updateTeam(ProjectTeamBean team) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTeam(ProjectTeamBean team) {
		// TODO Auto-generated method stub
		
	}

}
