package com.happytrees.daggerexample5;

import dagger.Module;
import dagger.Provides;

@Module//classes annotated with @Module are responsible for providing objects which can be injected.
public class PlaneModule {





    @Provides//Can be used on methods in classes annotated with @Module and is used for methods which provides objects for dependencies injection.
    Plane providePlane() {
        return new Plane("Stealth");
    }

}
