package to.msn.wings.intentobject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {

        ArrayList<Book1> bookList= new ArrayList<>();

        Intent i = new Intent(this, to.msn.wings.intentobject.SubActivity.class);
        EditText txtTitle = this.findViewById(R.id.txtTitle);
        EditText txtPublish = this.findViewById(R.id.txtPublish);
        EditText txtPrice = this.findViewById(R.id.txtPrice);
//        Book b = new Book(
//            txtTitle.getText().toString(),
//            txtPublish.getText().toString(),
//            txtPrice.getText().toString()
//        );

        bookList.add( new Book1("aa","aaaa","1"));
        bookList.add( new Book1("bb","bbbb","2"));
//        bookList.add( new Book1("cc","cccc","3"));
        bookList.add( new Book1("dd","dddd","4"));
        bookList.add( new Book1("ee","eeee","5"));


//        i.putExtra("app", b);
        i.putExtra("app", bookList);
        startActivity(i);
    }
}

