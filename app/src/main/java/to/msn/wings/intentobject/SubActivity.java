package to.msn.wings.intentobject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;


class Book1 implements Serializable {
    private String title;
    private String publish;
    private String price;

    Book1(String title, String publish, String price) {
        this.title = title;
        this.publish = publish;
        this.price = price;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getPublish() {
        return this.publish;
    }

    public void setPublish(String publish){
        this.publish = publish;
    }

    public String getPrice() {
        return this.price;
    }

    public void setPrice(String price){
        this.price = price;
    }

    @Override
    public String toString(){
        return "書名："  + this.title + "\n" + "出版社："+ this.publish + "\n" + "価格：" + this.price;
    }
}


public class SubActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Intent i = this.getIntent();
//        Book b = (Book)i.getSerializableExtra("app");
        ArrayList<Book1> booklist = (ArrayList<Book1>)i.getSerializableExtra("app");

        for(Book1 b :booklist){
            Log.d("arai",b.getTitle()+ " " +b.getPublish()+" "+b.getPrice());
        }

        //        Toast.makeText(this,
//                b.toString(),
//                Toast.LENGTH_LONG).show();
    }

    public void onClick(View v) {
        finish();
    }
}
