package com.happytrees.daggerexample5;

import dagger.Component;//enable selected modules and used for performing dependency injection

@Component(modules = {PlaneModule.class})//@Component(modules = { YourModuleClass.class })
public interface AppComponent {
    Car car();//method for creating car object(name doesn't matter)
    Plane plane();////method for creating Plane object(name doesn't matter)


}
