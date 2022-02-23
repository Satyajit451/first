package in.Ashokit.service;

import java.util.Random;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.Ashokit.binding.KES_Request;
import in.Ashokit.binding.KES_Res;
import in.Ashokit.entity.KES;
import in.Ashokit.repository.AsRegistationRepo;
@Service
public class ArServiceImpl implements IArService {
	@Autowired
	private RestTemplate rt;
	@Autowired
	private AsRegistationRepo repo;
	public String checkForState(String ssn) {
		String uri = "https://ssa-web-api.herokuapp.com/state/";
		String url = uri+ssn;
		String state = rt.getForObject(url, String.class);
		return state;
	}
	public KES saveRegistation(KES_Request req) {
		Random ram = new Random();
		int Number = ram.nextInt(9999);
		String format = String.format("%04d", Number);
		
		KES res = new KES();
		res.setState("Kentucky");
		res.setRegd_no("AR"+format+req.getSsn());
	 	BeanUtils.copyProperties(req, res);
		
		repo.save(res);
		return res;
		
	}

}
