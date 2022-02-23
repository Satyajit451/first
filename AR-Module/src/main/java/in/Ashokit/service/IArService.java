package in.Ashokit.service;

import in.Ashokit.binding.KES_Request;
import in.Ashokit.entity.KES;

public interface IArService {
	public String checkForState(String ssn);
	public KES saveRegistation(KES_Request request);

}
