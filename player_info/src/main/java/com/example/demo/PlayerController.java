package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {
	@Autowired
	private PlayerService playerservice;
	@RequestMapping("/all")
	public List<PlayerInfo> getplayers()
    {
        return  playerservice.getplayers();
    }
    @RequestMapping("/{pId}")
    public PlayerInfo getplayer(@PathVariable("pId") int pId)
    {
        return playerservice.getplayer(pId);
    }
}
