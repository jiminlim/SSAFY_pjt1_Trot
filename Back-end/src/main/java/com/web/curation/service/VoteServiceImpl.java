package com.web.curation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.curation.dao.VoteDao;
import com.web.curation.dto.VoteDto;

@Service
public class VoteServiceImpl implements VoteService {

	@Autowired
	VoteDao voteDao;

	@Override
	public boolean voteClick(VoteDto voteDto) {
		return voteDao.voteClick(voteDto) == 1;
	}

}