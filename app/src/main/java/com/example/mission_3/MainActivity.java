package com.example.mission_3;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, AdapterView.OnItemClickListener {
    TextView secondname, name, age, phonenumber;
    ListView students;
    Spinner class2;
    int count = 0 ;


    String[] classes = {"firstclass", "secondclass", "thirdclass", "fourthclass"};


    String[] secondname1 = {"Levi", "Cohen", "Mizrahi", "Peretz", "Avraham", "Golan", "Sharon", "Yosef", "Halevi", "Ben-David",
            "Adler", "Kaplan", "Shimon", "Eliyahu", "Weiss", "Goldstein", "Bar", "Mor", "Roth", "Harel"};
    String[] name1 = {"David", "Sara", "Eli", "Rivka", "Noa", "Daniel", "Yael", "Oren", "Tomer", "Shira",
            "Yonatan", "Dina", "Aviv", "Maya", "Gal", "Amir", "Lior", "Talia", "Yaron", "Neta"};
    String[] age1 = {"25", "30", "40", "22", "18", "35", "50", "28", "19", "24",
            "27", "32", "45", "29", "33", "31", "26", "23", "20", "21"};
    String[] phonenumber1 = {"0541234567", "0527654321", "0509876543", "0534567890", "0551122334", "0584455667", "0502233445",
            "0523344556", "0535566778", "0546677889", "0507788990", "0528899001", "0539001122", "0541122334",
            "0583344556", "0504455667", "0525566778", "0536677889", "0547788990", "0558899001"};



    // מערך 2
    String[] secondname2 = {"Ben-Ari", "Klein", "Shapira", "Gavrieli", "Peretz", "Abramsky", "Erez", "Shavit", "Kahana", "Stern",
            "Farkash", "Rosen", "Bashan", "Barkan", "Hoffman", "Mandel", "Reuven", "Segal", "Neeman", "Lavi", "Biton"};
    String[] name2 = {"Lior", "Michal", "Roni", "Shani", "Yehuda", "Niv", "Nina", "Oded", "Liat", "Moran",
            "Yosef", "Doron", "Sharon", "Moti", "Naama", "Ilan", "Yuval", "Tomer", "Dana", "Maya"};
    String[] age2 = {"27", "33", "36", "29", "41", "38", "24", "28", "32", "37",
            "22", "25", "39", "40", "31", "34", "21", "23", "30", "26"};
    String[] phonenumber2 = {"0501122334", "0523344556", "0545566778", "0506677889", "0537788990", "0588899001", "0529911223",
            "0502233445", "0533344556", "0544455667", "0525566778", "0586677889", "0507788990", "0538899001",
            "0549901122", "0522233445", "0504455667", "0535566778", "0526677889", "0507788990"};

    // מערך 3
    String[] secondname3 = {"Sandler", "Tzur", "Cohen", "Amar", "Saul", "Abrams", "Chaim", "Gil", "Zohar", "Sela",
            "Oren", "Bader", "Mizrahi", "Friedman", "Shapira", "Levin", "Gidi", "Benzion", "Sadeh", "Feinstein"};
    String[] name3 = {"Shai", "Tali", "Yonatan", "Miki", "Dani", "Noa", "Chaya", "Chaim", "Hadas", "Ofir",
            "Tzachi", "Nadav", "Amir", "Eli", "Ruth", "Maya", "Erez", "Shani", "Bar", "Moran"};
    String[] age3 = {"20", "23", "24", "26", "28", "29", "30", "32", "33", "35",
            "37", "38", "39", "41", "42", "43", "44", "45", "46", "47"};
    String[] phonenumber3 = {"0541234567", "0522233445", "0503344556", "0534455667", "0505566778", "0526677889", "0547788990",
            "0538899001", "0589901122", "0502233445", "0523344556", "0534455667", "0545566778", "0526677889",
            "0507788990", "0538899001", "0549901122", "0522233445", "0504455667", "0535566778"};

    // מערך 4
    String[] secondname4 = {"Shwartz", "Gavrielov", "Tzur", "Dahan", "Gal", "Harel", "Barak", "Friedman", "Rosenthal", "Zohar",
            "Stern", "Barkan", "Lavi", "Reuven", "Tzukrel", "Ziv", "Blum", "Kushnir", "Berman", "Gidi"};
    String[] name4 = {"Rami", "Liron", "Maya", "Oren", "Dan", "Ofir", "Hadar", "Yuval", "Gal", "Dov",
            "Moran", "Shira", "Tal", "Gil", "Tomer", "Avital", "Yifat", "Shimon", "Yaara", "Oded"};
    String[] age4 = {"28", "30", "32", "33", "34", "35", "36", "37", "38", "39",
            "40", "41", "42", "43", "44", "45", "46", "47", "48", "49"};
    String[] phonenumber4 = {"0506677889", "0523344556", "0545566778", "0507788990", "0528899001", "0539001122", "0502233445",
            "0523344556", "0535566778", "0546677889", "0507788990", "0528899001", "0539001122", "0541122334",
            "0583344556", "0504455667", "0525566778", "0536677889", "0547788990", "0558899001"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        students = findViewById(R.id.students);
        class2 = findViewById(R.id.class2);
        secondname = findViewById(R.id.secondname);
        name = findViewById(R.id.name);
        age = findViewById(R.id.age);
        phonenumber = findViewById(R.id.phonenumber);

        students.setOnItemClickListener(this);
        students.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        class2.setOnItemSelectedListener(this);





        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, classes);
        class2.setAdapter(adapter);

    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int pos, long rowid)
    {
        if(pos == 1 )
        {
            ArrayAdapter<String> adp = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, name1);
            students.setAdapter(adp);
            count = pos ;
        }
        else if (pos == 2)
        {
            ArrayAdapter<String> adp = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, name2);
            students.setAdapter(adp);
            count = pos ;

        } else if (pos==3)
        {
            ArrayAdapter<String> adp = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, name3);
            students.setAdapter(adp);
            count = pos ;

        }
        else {
            ArrayAdapter<String> adp = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, name4);
            students.setAdapter(adp);
            count = pos ;

        }


    }



    public void onItemClick(AdapterView<?> adapterView, View view, int pos, long rowid)
    {
        if(count == 1)
        {
            secondname.setText( secondname1[pos] );
            name.setText("name: "+ name1[pos]);
            age.setText("age:" + age1[pos]);
            phonenumber.setText("age:" + phonenumber1[pos]);
        }
        else if(count==2)
        {
            secondname.setText( secondname2[pos] );
            name.setText("name: "+ name2[pos]);
            age.setText("age:" + age2[pos]);
            phonenumber.setText("age:" + phonenumber1[pos]);
        }
        else if(count==3)
        {
            secondname.setText( secondname3[pos] );
            name.setText("name: "+ name3[pos]);
            age.setText("age:" + age3[pos]);
            phonenumber.setText("age:" + phonenumber1[pos]);
        }
        else if(count==4)
        {
            secondname.setText( secondname4[pos] );
            name.setText("name: "+ name4[pos]);
            age.setText("age:" + age4[pos]);
            phonenumber.setText("age:" + phonenumber1[pos]);
        }

    }



    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        Log.i("SpinDemo", "Nothing selected");
    }


}