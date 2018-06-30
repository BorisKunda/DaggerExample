package com.happytrees.daggerexample5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        AppComponent appComponent = DaggerAppComponent.builder().build();//Instantiating a Component
        //WAY 1 -> CREATING OBJECT USING @Inject Constructor
          appComponent.car().drive();

        //WAY2  -> CREATING OBJECT USING @Module annotated class + @Provides annotated constructor inside module class . don't forget to mention module's name in @Component annotated  interface
          appComponent.plane().fly();







    }
}

/*
@Inject – базовая аннотация, с помощью которой “запрашивается зависимость”
@Module – классы, чьи методы “предоставляют зависимости”
@Provide – методы внутри @Module, “говорящие Dagger, как мы хотим сконструировать и предоставить зависимость“
@Component – мост между @Inject и @Module
@Scope – предоставляют возможность создания глобальных и “локальных синглтонов”
@Qualifier – если необходимы разные объекты одного типа
 */
