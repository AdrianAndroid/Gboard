package defpackage;

import android.os.IBinder;
import java.lang.reflect.Field;

/* compiled from: PG */
/* renamed from: ftl  reason: default package */
/* loaded from: classes.dex */
public final class ftl extends bkg implements ftm {
    private final Object a;

    public ftl() {
        super("com.google.android.gms.dynamic.IObjectWrapper");
    }

    public static ftm b(Object obj) {
        return new ftl(obj);
    }

    public static Object c(ftm ftmVar) {
        if (ftmVar instanceof ftl) {
            return ((ftl) ftmVar).a;
        }
        IBinder asBinder = ftmVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i == 1) {
            fyb.ax(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (IllegalAccessException e) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
                } catch (NullPointerException e2) {
                    throw new IllegalArgumentException("Binder object is null.", e2);
                }
            }
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
    }

    private ftl(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper");
        this.a = obj;
    }
}
