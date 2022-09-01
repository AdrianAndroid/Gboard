package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* renamed from: akr  reason: default package */
/* loaded from: classes.dex */
public final class akr {
    final qv a;
    final qv b;
    final qv c;
    public final Parcel d;
    private final SparseIntArray e;
    private final int f;
    private final int g;
    private final String h;
    private int i;
    private int j;
    private int k;

    public akr(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new qv(), new qv(), new qv());
    }

    private final Class v(Class cls) {
        Class cls2 = (Class) this.c.get(cls.getName());
        if (cls2 == null) {
            Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
            this.c.put(cls.getName(), cls3);
            return cls3;
        }
        return cls2;
    }

    public final int a(int i, int i2) {
        return !s(i2) ? i : this.d.readInt();
    }

    public final Parcelable b(Parcelable parcelable, int i) {
        return !s(i) ? parcelable : this.d.readParcelable(getClass().getClassLoader());
    }

    public final aks c() {
        String n = n();
        if (n == null) {
            return null;
        }
        akr m = m();
        try {
            Method method = (Method) this.a.get(n);
            if (method == null) {
                method = Class.forName(n, true, akr.class.getClassLoader()).getDeclaredMethod("read", akr.class);
                this.a.put(n, method);
            }
            return (aks) method.invoke(null, m);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(e4);
        }
    }

    public final CharSequence d(CharSequence charSequence, int i) {
        return !s(i) ? charSequence : (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.d);
    }

    public final String e(String str, int i) {
        return !s(i) ? str : n();
    }

    public final void f(boolean z, int i) {
        p(i);
        this.d.writeInt(z ? 1 : 0);
    }

    public final void g(CharSequence charSequence, int i) {
        p(i);
        TextUtils.writeToParcel(charSequence, this.d, 0);
    }

    public final void h(int i, int i2) {
        p(i2);
        q(i);
    }

    public final void i(Parcelable parcelable, int i) {
        p(i);
        this.d.writeParcelable(parcelable, 0);
    }

    public final void j(String str, int i) {
        p(i);
        r(str);
    }

    public final void k(aks aksVar) {
        if (aksVar != null) {
            try {
                r(v(aksVar.getClass()).getName());
                akr m = m();
                try {
                    Class<?> cls = aksVar.getClass();
                    Method method = (Method) this.b.get(cls.getName());
                    if (method == null) {
                        method = v(cls).getDeclaredMethod("write", cls, akr.class);
                        this.b.put(cls.getName(), method);
                    }
                    method.invoke(null, aksVar, m);
                    m.o();
                    return;
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IllegalAccessException e2) {
                    throw new RuntimeException(e2);
                } catch (NoSuchMethodException e3) {
                    throw new RuntimeException(e3);
                } catch (InvocationTargetException e4) {
                    Throwable cause = e4.getCause();
                    if (cause instanceof RuntimeException) {
                        throw ((RuntimeException) cause);
                    }
                    if (cause instanceof Error) {
                        throw ((Error) cause);
                    }
                    throw new RuntimeException(e4);
                }
            } catch (ClassNotFoundException e5) {
                throw new RuntimeException(String.valueOf(aksVar.getClass().getSimpleName()).concat(" does not have a Parcelizer"), e5);
            }
        }
        r(null);
    }

    public final boolean l(boolean z, int i) {
        return s(i) ? this.d.readInt() != 0 : z;
    }

    protected final akr m() {
        Parcel parcel = this.d;
        int dataPosition = parcel.dataPosition();
        int i = this.j;
        if (i == this.f) {
            i = this.g;
        }
        return new akr(parcel, dataPosition, i, this.h.concat("  "), this.a, this.b, this.c);
    }

    public final String n() {
        return this.d.readString();
    }

    public final void o() {
        int i = this.i;
        if (i >= 0) {
            int i2 = this.e.get(i);
            int dataPosition = this.d.dataPosition();
            this.d.setDataPosition(i2);
            this.d.writeInt(dataPosition - i2);
            this.d.setDataPosition(dataPosition);
        }
    }

    public final void p(int i) {
        o();
        this.i = i;
        this.e.put(i, this.d.dataPosition());
        q(0);
        q(i);
    }

    public final void q(int i) {
        this.d.writeInt(i);
    }

    public final void r(String str) {
        this.d.writeString(str);
    }

    public final boolean s(int i) {
        while (this.j < this.g) {
            int i2 = this.k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.d.setDataPosition(this.j);
            int readInt = this.d.readInt();
            this.k = this.d.readInt();
            this.j += readInt;
        }
        return this.k == i;
    }

    public final aks t(aks aksVar) {
        return !s(1) ? aksVar : c();
    }

    public final void u(aks aksVar) {
        p(1);
        k(aksVar);
    }

    private akr(Parcel parcel, int i, int i2, String str, qv qvVar, qv qvVar2, qv qvVar3) {
        this.a = qvVar;
        this.b = qvVar2;
        this.c = qvVar3;
        this.e = new SparseIntArray();
        this.i = -1;
        this.k = -1;
        this.d = parcel;
        this.f = i;
        this.g = i2;
        this.j = i;
        this.h = str;
    }
}
