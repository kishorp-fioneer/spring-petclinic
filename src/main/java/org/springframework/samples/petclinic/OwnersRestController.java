package org.springframework.samples.petclinic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.samples.petclinic.owner.Owner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OwnersRestController {

	@Autowired
	private OwnersJpaRepository ownersRepository;

	@ResponseBody
	@GetMapping("/api/owners")
	public List<Owner> getOwners() {

		List<Owner> list = ownersRepository.findAll();
		System.out.println(list);
		return ownersRepository.findAll();

	}

}
