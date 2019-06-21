package jeesl.model.locales;

import java.io.Serializable;
import java.util.Hashtable;
import java.util.Map;

import org.jeesl.interfaces.model.system.with.code.EjbWithCode;

import jeesl.model.graphic.IoGraphic;
import net.sf.ahtutils.interfaces.model.behaviour.EjbSaveable;
import net.sf.ahtutils.interfaces.model.crud.EjbPersistable;
import net.sf.ahtutils.interfaces.model.crud.EjbRemoveable;
import net.sf.ahtutils.interfaces.model.with.EjbWithLangDescription;
import net.sf.ahtutils.interfaces.model.with.image.EjbWithImage;
import net.sf.ahtutils.interfaces.model.with.image.EjbWithImageAlt;
import net.sf.ahtutils.interfaces.model.with.parent.EjbWithParent;
import net.sf.ahtutils.interfaces.model.with.position.EjbWithPositionVisible;

public class IoStatus implements Serializable,EjbPersistable,EjbRemoveable,EjbSaveable,
									EjbWithParent,EjbWithCode,EjbWithImage,EjbWithImageAlt,EjbWithPositionVisible,
									EjbWithLangDescription<IoLang,IoDescription>
{
	private static final long serialVersionUID = 1;
	
	public static enum Group {xx};
	
	
	protected long id;
	public void setId(long id) {this.id = id;}
	public long getId() {return id;}
		

	protected Map<String, IoLang> name;
	public Map<String, IoLang> getName() {if(name==null){name=new Hashtable<String,IoLang>();}return name;}
	public void setName(Map<String, IoLang> name) {this.name = name;}
	

	protected Map<String, IoDescription> description;
	public Map<String, IoDescription> getDescription() {return description;}
	public void setDescription(Map<String, IoDescription> description) {this.description = description;}
		
	protected String code;
	public String getCode() {return code;}
	public void setCode(String code) {this.code = code;}
	
	protected boolean visible;
	public boolean isVisible() {return visible;}
	public void setVisible(boolean visible) {this.visible = visible;}
	
	protected String image;
	public String getImage() {return image;}
	public void setImage(String image) {this.image = image;}
	
	protected String imageAlt;
	public String getImageAlt() {return imageAlt;}
	public void setImageAlt(String imageAlt) {this.imageAlt=imageAlt;}
	
	protected String style;
	public String getStyle() {return style;}
	public void setStyle(String style) {this.style = style;}
	
	protected int position;
	public int getPosition() {return position;}
	public void setPosition(int position) {this.position = position;}
	

	protected IoStatus parent;
	@SuppressWarnings("unchecked")
	public <P extends EjbWithCode> P getParent() {return (P)parent;}
	public <P extends EjbWithCode> void setParent(P parent) {this.parent=(IoStatus)parent;}

	protected String symbol;
	public String getSymbol(){return symbol;}
	public void setSymbol(String symbol){this.symbol = symbol;}
	
	private IoGraphic graphic;
	public IoGraphic getGraphic() {return graphic;}
	public void setGraphic(IoGraphic graphic) {this.graphic = graphic;}
	
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
			sb.append(id);
			sb.append(" code="+code);
		return sb.toString();
	}
}