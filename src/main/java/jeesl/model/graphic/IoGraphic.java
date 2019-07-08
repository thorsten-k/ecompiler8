package jeesl.model.graphic;

import java.util.List;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.jeesl.interfaces.model.system.graphic.core.JeeslGraphic;

import jeesl.model.locales.IoDescription;
import jeesl.model.locales.IoLang;
import net.sf.ahtutils.model.qualifier.EjbErNode;

@EjbErNode(name="Graphic",category="symbol",subset="sld",level=3)
public class IoGraphic implements JeeslGraphic<IoLang,IoDescription,IoGraphicType,IoGraphicFigure,IoGraphicStyle>
{
	public static final long serialVersionUID=1;
	

	private long id;
	@Override public long getId() {return id;}
	@Override public void setId(long id) {this.id = id;}
	

	private Long versionLock;
	@Override public Long getVersionLock() {return versionLock;}


	private IoGraphicType type;
	public IoGraphicType getType(){return type;}
	public void setType(IoGraphicType type){this.type = type;}
	

	private IoGraphicStyle style;
	public IoGraphicStyle getStyle() {return style;}
	public void setStyle(IoGraphicStyle style) {this.style = style;}
	
//	@Lob
	private byte[] data;
    @Override public byte[] getData() {return data;}
    @Override public void setData(byte[] data) {this.data = data;}
	
    private Integer size;
	public Integer getSize() {return size;}
	public void setSize(Integer size) {this.size = size;}
	
    private Integer sizeBorder;
	public Integer getSizeBorder() {return sizeBorder;}
	public void setSizeBorder(Integer sizeBorder) {this.sizeBorder = sizeBorder;}
	
	private String color;
	public String getColor() {return color;}
	public void setColor(String color) {this.color = color;}
	
	private String colorBorder;
	public String getColorBorder() {return colorBorder;}
	public void setColorBorder(String colorBorder) {this.colorBorder = colorBorder;}
    

	private List<IoGraphicFigure> figures;
	@Override public List<IoGraphicFigure> getFigures() {return figures;}
	@Override public void setFigures(List<IoGraphicFigure> figures) {this.figures = figures;}
	
	@Override public String toString()
	{
		StringBuffer sb = new StringBuffer();
		sb.append("[").append(id).append("]");
		sb.append(" t:").append(type.getCode());
		if(style!=null){sb.append(" s:").append(style.getCode());}
		sb.append(" size:").append(size);
		if(versionLock!=null){sb.append(" v:"+versionLock);}
		return sb.toString();
	}
	
	@Override public boolean equals(Object object) {return (object instanceof IoGraphic) ? id == ((IoGraphic) object).getId() : (object == this);}
	@Override public int hashCode() {return new HashCodeBuilder(13,37).append(id).toHashCode();}
}