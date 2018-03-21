package jeesl.model.security;

import java.io.Serializable;

import org.jeesl.interfaces.model.system.security.framework.JeeslSecurityMenu;

public class SecurityMenu implements Serializable,
				JeeslSecurityMenu<SecurityView,SecurityMenu>
{
	public static final long serialVersionUID=1;
	
	private long id;
	public long getId() {return id;}
	public void setId(long id) {this.id = id;}
	
	private SecurityMenu parent;
	public SecurityMenu getParent() {return parent;}
	public void setParent(SecurityMenu parent) {this.parent = parent;}

	private int position;
	@Override public int getPosition() {return position;}
	@Override public void setPosition(int position) {this.position = position;}
	
	private SecurityView view;
	@Override public SecurityView getView() {return view;}
	@Override public void setView(SecurityView view) {this.view = view;}
	
}