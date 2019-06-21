package jeesl.model.system.io.fr;

import java.util.List;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.jeesl.interfaces.model.system.io.fr.JeeslFileContainer;

public class IoFileContainer implements JeeslFileContainer<IoFileStorage,IoFileMeta>
{
	public static final long serialVersionUID=1;
	
	private long id;
	@Override public long getId() {return id;}
	@Override public void setId(long id) {this.id = id;}
	
	private IoFileStorage storage;
	@Override public IoFileStorage getStorage() {return storage;}
	@Override public void setStorage(IoFileStorage storage) {this.storage = storage;}

	private List<IoFileMeta> metas;
	@Override public List<IoFileMeta> getMetas() {return metas;}
	@Override public void setMetas(List<IoFileMeta> metas) {this.metas = metas;}
	
	@Override public boolean equals(Object object){return (object instanceof IoFileContainer) ? id == ((IoFileContainer) object).getId() : (object == this);}
	@Override public int hashCode() {return new HashCodeBuilder(17,53).append(id).toHashCode();}
}