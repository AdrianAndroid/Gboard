package defpackage;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* compiled from: PG */
/* renamed from: aar  reason: default package */
/* loaded from: classes.dex */
public final class aar extends aau {
    private static Field a = null;
    private static boolean c = false;
    private static Constructor d = null;
    private static boolean e = false;
    private WindowInsets f;
    private vq g;

    public aar() {
        this.f = i();
    }

    private static WindowInsets i() {
        if (!c) {
            try {
                a = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
            }
            c = true;
        }
        Field field = a;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
            }
        }
        if (!e) {
            try {
                d = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
            }
            e = true;
        }
        Constructor constructor = d;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
            }
        }
        return null;
    }

    @Override // defpackage.aau
    public abc a() {
        h();
        abc m = abc.m(this.f);
        m.p(this.b);
        m.b.m(this.g);
        return m;
    }

    @Override // defpackage.aau
    public void b(vq vqVar) {
        this.g = vqVar;
    }

    @Override // defpackage.aau
    public void c(vq vqVar) {
        WindowInsets windowInsets = this.f;
        if (windowInsets != null) {
            this.f = windowInsets.replaceSystemWindowInsets(vqVar.b, vqVar.c, vqVar.d, vqVar.e);
        }
    }

    public aar(abc abcVar) {
        super(abcVar);
        this.f = abcVar.e();
    }
}
