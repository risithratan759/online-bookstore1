package in.risithratan.onlinebookstore1.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tbl_category")
public class BookCategory {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;

@Column(name="category_name")
private String categoryName;

@OneToMany(cascade=CascadeType.ALL,mappedBy="category")
private Set<Book>book;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getCategoryName() {
	return categoryName;
}
public void setCategoryName(String categoryName) {
	this.categoryName = categoryName;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((categoryName == null) ? 0 : categoryName.hashCode());
	result = prime * result + ((id == null) ? 0 : id.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	BookCategory other = (BookCategory) obj;
	if (categoryName == null) {
		if (other.categoryName != null)
			return false;
	} else if (!categoryName.equals(other.categoryName))
		return false;
	if (id == null) {
		if (other.id != null)
			return false;
	} else if (!id.equals(other.id))
		return false;
	return true;
}
@Override
public String toString() {
	return "BookCategory [id=" + id + ", categoryName=" + categoryName + "]";
}
public Set<Book> getBook() {
	return book;
}
public void setBook(Set<Book> book) {
	this.book = book;
}


}
