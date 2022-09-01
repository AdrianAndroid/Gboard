package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: iay  reason: default package */
/* loaded from: classes.dex */
public final class iay implements Parcelable {
    public final int c;
    public final iax d;
    public final Object e;
    private int f;
    private volatile int g;
    static final iay a = new iay(0, null, null);
    public static final iay[] b = new iay[0];
    public static final Parcelable.Creator CREATOR = new gcz(20);

    public iay(int i, iax iaxVar, Object obj) {
        this(i, iaxVar, obj, Integer.MAX_VALUE, Integer.MAX_VALUE);
    }

    public final int a() {
        int i;
        if (this.g == Integer.MAX_VALUE) {
            int i2 = this.d != null ? 16 : 12;
            Object obj = this.e;
            if (obj != null) {
                if (obj instanceof String) {
                    i = ((String) obj).getBytes().length;
                } else if (obj instanceof CharSequence) {
                    int length = ((CharSequence) obj).length();
                    i = length + length;
                }
                i2 += i;
            }
            this.g = i2;
        }
        return this.g;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iay)) {
            return false;
        }
        iay iayVar = (iay) obj;
        return this.c == iayVar.c && jdg.W(this.d, iayVar.d) && jdg.W(this.e, iayVar.e);
    }

    public final int hashCode() {
        int i;
        int i2 = this.f;
        if (i2 == Integer.MAX_VALUE) {
            Object obj = this.e;
            if (obj != null) {
                i = obj.hashCode();
                Object obj2 = this.e;
                if ((obj2 instanceof CharSequence) && ((CharSequence) obj2).length() > 0) {
                    i = (i * 31) + ((CharSequence) this.e).charAt(0);
                }
            } else {
                i = 0;
            }
            Object[] objArr = new Object[3];
            objArr[0] = Integer.valueOf(i);
            iax iaxVar = this.d;
            objArr[1] = Integer.valueOf(iaxVar != null ? iaxVar.ordinal() : -1);
            objArr[2] = Integer.valueOf(this.c);
            i2 = Arrays.hashCode(objArr);
            if (i2 == Integer.MAX_VALUE) {
                i2 = 2147483646;
            }
            this.f = i2;
        }
        return i2;
    }

    public final String toString() {
        lfa S = jdg.S(this);
        S.b("intention", this.d);
        S.f("keyCode", this.c);
        S.a(iaz.f(this.c));
        S.b("data", this.e);
        return S.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c);
        kki.C(parcel, this.d);
        Object obj = this.e;
        TextUtils.writeToParcel(obj instanceof CharSequence ? (CharSequence) obj : null, parcel, i);
        parcel.writeInt(hashCode());
        parcel.writeInt(a());
    }

    public iay(int i, iax iaxVar, Object obj, int i2, int i3) {
        this.c = i;
        if (iaxVar == null) {
            iaxVar = null;
        } else {
            int ordinal = iaxVar.ordinal();
            if (ordinal == 2) {
                iaxVar = iax.DECODE;
            } else if (ordinal == 3) {
                iaxVar = iax.COMMIT;
            }
        }
        this.d = iaxVar;
        this.e = obj;
        this.f = i2;
        this.g = i3;
    }
}
