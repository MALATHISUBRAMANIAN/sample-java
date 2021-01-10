package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Model.Palindrome;
import Repository.PalindromeRepo;

@Service
public class PalindromeServiceImpl implements PalindromeService{

	@Autowired
	PalindromeRepo repo;
	
	
	@Override
	public List<Palindrome> getData() {
		return repo.findAll();
	}

	
}
