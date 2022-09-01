package defpackage;

import android.content.Context;
import android.os.IInterface;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* renamed from: gaf  reason: default package */
/* loaded from: classes.dex */
public final class gaf {
    private static final Object a = new Object();
    private static volatile gac b;

    private gaf() {
    }

    public static IInterface a(Context context, String str, gae gaeVar) {
        return b(context).b(str, gaeVar);
    }

    public static gac b(Context context) {
        gac gacVar = b;
        if (gacVar == null) {
            synchronized (a) {
                gacVar = b;
                if (gacVar == null) {
                    gac c = c(context);
                    b = c;
                    gacVar = c;
                }
            }
        }
        return gacVar;
    }

    private static gac c(Context context) {
        Class<?> cls;
        try {
            cls = gaf.class.getClassLoader().loadClass("gag");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        try {
            return (gac) cls.getConstructor(Context.class).newInstance(context);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new gad("Failed to create dynamite loader instance: ".concat(String.valueOf(e.getMessage())), e);
        }
    }
}
