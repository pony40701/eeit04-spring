package com.example.demo;

import java.util.*;

import org.springframework.stereotype.Component;

@Component
public class PowerLottery implements Lottery{
	public List<Integer> createLottery() {
		TreeSet<Integer> lottery = new TreeSet<>();
		while(lottery.size() < 6) {
			lottery.add((int)(Math.random()*38+1));
		}
		List<Integer> retList = new ArrayList<Integer>();
				for(Integer i: lottery) {
					retList.add(i);
				}
		
				retList.add((int)(Math.random()*49+1));
				
		return retList;
	}
}
