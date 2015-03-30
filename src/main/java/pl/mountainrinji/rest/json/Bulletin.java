package pl.mountainrinji.rest.json;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Bulletin {
	
	public Long id;
	public String name;
	public boolean mandatory;

}
