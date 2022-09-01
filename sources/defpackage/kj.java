package defpackage;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* compiled from: PG */
/* renamed from: kj  reason: default package */
/* loaded from: classes.dex */
final class kj {
    public static final Field a;

    static {
        NoSuchFieldException e;
        Field field;
        try {
            field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            try {
                field.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                e = e2;
                e.printStackTrace();
                a = field;
            }
        } catch (NoSuchFieldException e3) {
            e = e3;
            field = null;
        }
        a = field;
    }
}
