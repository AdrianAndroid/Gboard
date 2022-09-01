package android.support.v7.app;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AppCompatViewInflater {
    public final Object[] f = new Object[2];
    private static final Class[] g = {Context.class, AttributeSet.class};
    public static final int[] a = {16843375};
    public static final int[] b = {16844160};
    public static final int[] c = {16844156};
    public static final int[] d = {16844148};
    public static final String[] e = {"android.widget.", "android.view.", "android.webkit."};
    private static final qv h = new qv();

    public hz a(Context context, AttributeSet attributeSet) {
        return new hz(context, attributeSet);
    }

    public ia b(Context context, AttributeSet attributeSet) {
        return new ia(context, attributeSet);
    }

    public ib c(Context context, AttributeSet attributeSet) {
        return new ib(context, attributeSet);
    }

    public ik d(Context context, AttributeSet attributeSet) {
        return new ik(context, attributeSet);
    }

    public AppCompatTextView e(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String str3;
        qv qvVar = h;
        Constructor constructor = (Constructor) qvVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(g);
            qvVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f);
    }
}
