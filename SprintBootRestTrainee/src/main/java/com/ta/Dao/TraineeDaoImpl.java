package com.ta.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ta.Entity.Trainee;

@Repository
public class TraineeDaoImpl  implements TraineeDao{
	
	@PersistenceContext
	EntityManager manager;

	@Override
	public Trainee addTrainee(Trainee trainee) {
		manager.persist(trainee);
		return manager.find(Trainee.class, trainee.getTid());
	}

	@Override
	public Trainee updateTrainee(Trainee trainee) {
		
		return manager.merge(trainee);
	}

	@Override
	public String deleteTrainee(int tid) {
		Trainee t= manager.find(Trainee.class,tid);
		if(t!=null) {
			manager.remove(t);
			return("Trainee Deleted");
			
		}
		else {
			return("Trainee not found");
		}
		
	}

	@Override
	public Trainee getTrainee(int tid) {
		
		return manager.find(Trainee.class,tid);
	}

	@Override
	public List<Trainee> getAllTrainee() {
		TypedQuery<Trainee> result = manager.createQuery("Select t from Trainee t",Trainee.class);
		return result.getResultList();
	}
	

}
