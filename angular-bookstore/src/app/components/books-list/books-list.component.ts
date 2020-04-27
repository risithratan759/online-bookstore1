import { Component, OnInit } from '@angular/core';
import { Book } from '../../common/book';
import { BookService } from 'src/app/services/book.service';
@Component({
  selector: 'app-books-list',
  templateUrl: './books-list.component.html',
  styleUrls: ['./books-list.component.css']
})
export class BooksListComponent implements OnInit {
  books:Book[];
  constructor(private _bookService:BookService) { }

  ngOnInit(): void {
    this.listBooks();
  }
  listBooks(){
    this._bookService.getBooks().subscribe(
    data =>this.books =data
    )
  }
}
