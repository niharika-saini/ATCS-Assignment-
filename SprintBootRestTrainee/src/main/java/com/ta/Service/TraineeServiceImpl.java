package com.ta.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ta.Dao.TraineeDao;
import com.ta.Entity.Trainee;


@Service
@Transactional
public class TraineeServiceImpl implements TraineeService {
	
	@Autowired
	TraineeDao dao;

	@Override
	public Trainee addTrainee(Trainee trainee) {
		
		return dao.addTrainee(trainee);
	}

	@Override
	public Trainee updateTrainee(Trainee trainee) {

		return dao.updateTrainee(trainee);
	}

	@Override
	public String deleteTrainee(int tid) {
		
		return dao.deleteTrainee(tid);
	}

	@Override
	public Trainee getTrainee(int tid) {
		
		return dao.getTrainee(tid);
	}

	@Override
	public List<Trainee> getAllTrainee() {
		
		return dao.getAllTrainee();
	}

}
