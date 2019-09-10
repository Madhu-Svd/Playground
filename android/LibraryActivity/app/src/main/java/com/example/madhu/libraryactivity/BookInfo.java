package com.example.madhu.libraryactivity;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class BookInfo  {
    String title,author,publisher;
    public double cost;
    public int year;

  public  BookInfo(String BookTitle,String BookAuthor,String BookPublisher,int year,double cost){
        this.title=BookTitle;
        this.author=BookAuthor;
        this.publisher=BookPublisher;
        this.year=year;
        this.cost=cost;

    }
  public  void show(){
        System.out.println("Book Details");
      System.out.println("Book Title:" +title);
      System.out.println("Book Author:" +author);
      System.out.println("Book Publisher:" +publisher);
      System.out.println("Book year:" +year);
      System.out.println("Book cost:" +cost);
    }
}
