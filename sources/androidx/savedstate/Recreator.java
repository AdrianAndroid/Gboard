package androidx.savedstate;

import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class Recreator implements aft {
    private final ajc a;

    public Recreator(ajc ajcVar) {
        oll.e(ajcVar, "owner");
        this.a = ajcVar;
    }

    @Override // defpackage.aft
    public final void hS(afv afvVar, afo afoVar) {
        if (afoVar != afo.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        afvVar.I().d(this);
        Bundle a = this.a.J().a("androidx.savedstate.Restarter");
        if (a == null) {
            return;
        }
        ArrayList<String> stringArrayList = a.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        for (String str : stringArrayList) {
            try {
                Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(aiz.class);
                oll.d(asSubclass, "{\n                Class.…class.java)\n            }");
                try {
                    Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object newInstance = declaredConstructor.newInstance(new Object[0]);
                        oll.d(newInstance, "{\n                constr…wInstance()\n            }");
                        ((aiz) newInstance).a();
                    } catch (Exception e) {
                        throw new RuntimeException("Failed to instantiate ".concat(String.valueOf(str)), e);
                    }
                } catch (NoSuchMethodException e2) {
                    throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                }
            } catch (ClassNotFoundException e3) {
                throw new RuntimeException("Class " + str + " wasn't found", e3);
            }
        }
    }
}
