package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;
@Service
public class PlayerService {
	
	private List<PlayerInfo> player = new ArrayList<PlayerInfo>(Arrays.asList(
            new PlayerInfo(1,"Rohit","batsman"),
            new PlayerInfo(2,"bumrah","bowler"),
            new PlayerInfo(3,"pandiya","allrounder")
            ));
	public List<PlayerInfo> getplayers()
	{
		return player;
	}
	public PlayerInfo getplayer(int pid)
	{
		PlayerInfo playerinfo;
		for(PlayerInfo pinfo : player)
		{
			if(pinfo.getpId()==pid)
			{
				playerinfo=pinfo;
				return playerinfo;
			}
		
		}
		return null;
	}
}
