package mangaConventer.manga;

import java.util.*;



public class Manga implements Collection<Page>{
	public String mangaName;
	public String mangaPath;
	public int  mangaSize;
	public String mangaPathFinal;
	public String mangaColorType;
	public String userName;
	private List<Page> manga=new ArrayList<Page>();
	
	public boolean add(Page e) {
		
		return false;
	}
	public boolean addAll(Collection<? extends Page> c) {
		// TODO Auto-generated method stub
		return false;
	}
	public void clear() {
		// TODO Auto-generated method stub
		
	}
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	public Iterator<Page> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}
	public String getMangaName() {
		return mangaName;
	}
	public void setMangaName(String mangaName) {
		this.mangaName = mangaName;
	}
	public String getMangaPath() {
		return mangaPath;
	}
	public void setMangaPath(String mangaPath) {
		this.mangaPath = mangaPath;
	}
	public int getMangaSize() {
		return mangaSize;
	}
	public void setMangaSize(int mangaSize) {
		this.mangaSize = mangaSize;
	}
	public String getMangaPathFinal() {
		return mangaPathFinal;
	}
	public void setMangaPathFinal(String mangaPathFinal) {
		this.mangaPathFinal = mangaPathFinal;
	}
	public String getMangaColorType() {
		return mangaColorType;
	}
	public void setMangaColorType(String mangaColorType) {
		this.mangaColorType = mangaColorType;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}
