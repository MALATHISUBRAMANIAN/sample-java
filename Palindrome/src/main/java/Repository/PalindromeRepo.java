package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Model.Palindrome;


public interface PalindromeRepo extends JpaRepository<Palindrome,Long> {

}
