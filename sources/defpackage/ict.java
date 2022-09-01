package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.text.TextUtils;
import android.view.ViewDebug;
import com.google.android.inputmethod.latin.R;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* renamed from: ict  reason: default package */
/* loaded from: classes.dex */
public final class ict {
    public static final ict[] a = new ict[0];
    public static final ict b;
    @ViewDebug.ExportedProperty(resolveId = true)
    public final int c;
    @ViewDebug.ExportedProperty
    public final icr d;
    @ViewDebug.ExportedProperty(resolveId = true)
    public final int e;
    @ViewDebug.ExportedProperty
    public final icq f;
    @ViewDebug.ExportedProperty
    public final int g;
    @ViewDebug.ExportedProperty
    public final int h;
    @ViewDebug.ExportedProperty
    public final int i;
    public final hhl j;
    public final boolean k;
    public final boolean l;
    public final ial[] m;
    public final CharSequence[] n;
    public final int[] o;
    public final Object[] p;
    public final int[] q;
    @ViewDebug.ExportedProperty
    public final boolean r;
    @ViewDebug.ExportedProperty
    public final float s;
    @ViewDebug.ExportedProperty
    public final String t;
    @ViewDebug.ExportedProperty
    public final int u;
    private int v;
    private volatile int w;

    static {
        lug lugVar = hin.a;
        ico d = d();
        d.a = R.id.f85450_resource_name_obfuscated_res_0x7f0b0f9b;
        b = d.c();
    }

    public ict(Parcel parcel, kns knsVar, byte[] bArr) {
        this.v = Integer.MAX_VALUE;
        this.w = Integer.MAX_VALUE;
        this.c = parcel.readInt();
        this.d = (icr) kki.B(parcel, icr.values());
        this.e = parcel.readInt();
        this.f = (icq) kki.B(parcel, icq.values());
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        this.i = parcel.readInt();
        String readString = parcel.readString();
        CharSequence[] charSequenceArr = null;
        this.j = !TextUtils.isEmpty(readString) ? hhq.g(readString) : null;
        this.k = kki.E(parcel);
        this.l = kki.E(parcel);
        ial[] ialVarArr = ial.b;
        Object[] k = knsVar.k(parcel);
        this.m = k != null ? k : ialVarArr;
        int readInt = parcel.readInt();
        if (readInt != -1) {
            charSequenceArr = (CharSequence[]) TextUtils.CHAR_SEQUENCE_CREATOR.newArray(readInt);
            for (int i = 0; i < readInt; i++) {
                charSequenceArr[i] = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            }
        }
        this.n = charSequenceArr;
        int[] createIntArray = parcel.createIntArray();
        this.o = createIntArray == null ? gvw.b : createIntArray;
        int[] createIntArray2 = parcel.createIntArray();
        if (createIntArray2 != null) {
            this.p = new Object[createIntArray2.length];
            for (int i2 = 0; i2 < createIntArray2.length; i2++) {
                this.p[i2] = Integer.valueOf(createIntArray2[i2]);
            }
        } else {
            this.p = gvw.h;
        }
        int[] createIntArray3 = parcel.createIntArray();
        this.q = createIntArray3 == null ? gvw.b : createIntArray3;
        this.r = kki.E(parcel);
        this.s = parcel.readFloat();
        this.t = parcel.readString();
        this.u = parcel.readInt();
        this.v = parcel.readInt();
        this.w = parcel.readInt();
    }

    public static ico d() {
        return new ico();
    }

    public static boolean g(Object obj) {
        return ((obj instanceof Integer) && ((Integer) obj).intValue() != 0) || (obj instanceof Bitmap) || (obj instanceof Drawable) || (obj instanceof ats);
    }

    public final int a() {
        CharSequence[] charSequenceArr;
        if (this.w == Integer.MAX_VALUE) {
            String str = this.t;
            int i = 47;
            if (str != null) {
                i = 47 + str.getBytes().length;
            }
            int length = i + (this.q.length * 4) + (this.o.length * 4);
            for (CharSequence charSequence : this.n) {
                if (charSequence != null) {
                    int length2 = charSequence.length();
                    length += length2 + length2;
                }
            }
            Object[] objArr = this.p;
            if (objArr instanceof Integer[]) {
                length += objArr.length * 4;
            }
            for (ial ialVar : this.m) {
                length += ialVar.a();
            }
            this.w = length;
        }
        return this.w;
    }

    public final ial b(iah iahVar) {
        ial[] ialVarArr;
        if (iahVar == null) {
            return null;
        }
        for (ial ialVar : this.m) {
            if (ialVar.c == iahVar) {
                return ialVar;
            }
        }
        return null;
    }

    public final ial c(iah iahVar) {
        ial[] ialVarArr;
        ial ialVar = null;
        if (iahVar == null) {
            return null;
        }
        for (ial ialVar2 : this.m) {
            iah iahVar2 = ialVar2.c;
            if (iahVar2 == iahVar) {
                return ialVar2;
            }
            if (iahVar2 == iah.PRESS) {
                ialVar = ialVar2;
            }
        }
        return ialVar;
    }

    public final boolean e() {
        ial[] ialVarArr = this.m;
        return ialVarArr != null && ialVarArr.length > 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ict)) {
            return false;
        }
        ict ictVar = (ict) obj;
        if (hashCode() == ictVar.hashCode() && this.c == ictVar.c && this.e == ictVar.e && this.i == ictVar.i) {
            hhl hhlVar = this.j;
            String str = null;
            String l = hhlVar != null ? hhq.l(hhlVar) : null;
            hhl hhlVar2 = ictVar.j;
            if (hhlVar2 != null) {
                str = hhq.l(hhlVar2);
            }
            if (jdg.W(l, str) && this.u == ictVar.u && this.k == ictVar.k && this.l == ictVar.l && this.r == ictVar.r && this.s == ictVar.s && this.h == ictVar.h && this.g == ictVar.g && jdg.W(this.t, ictVar.t) && jdg.W(this.f, ictVar.f) && jdg.W(this.d, ictVar.d) && Arrays.equals(this.q, ictVar.q) && Arrays.equals(this.o, ictVar.o) && Arrays.equals(this.m, ictVar.m) && Arrays.equals(this.p, ictVar.p) && Arrays.equals(this.n, ictVar.n)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(iah iahVar) {
        return b(iahVar) != null;
    }

    public final void h(kns knsVar, kns knsVar2) {
        ial[] ialVarArr = this.m;
        if (ialVarArr != null) {
            for (ial ialVar : ialVarArr) {
                if (knsVar2.j(ialVar)) {
                    for (iay iayVar : ialVar.d) {
                        knsVar.j(iayVar);
                    }
                }
            }
        }
    }

    public final int hashCode() {
        int i = this.v;
        if (i == Integer.MAX_VALUE) {
            Object[] objArr = new Object[19];
            objArr[0] = Integer.valueOf(Arrays.deepHashCode(this.m));
            objArr[1] = Integer.valueOf(this.u);
            objArr[2] = this.t;
            objArr[3] = Integer.valueOf(Arrays.hashCode(this.q));
            objArr[4] = Integer.valueOf(Arrays.deepHashCode(this.p));
            objArr[5] = Integer.valueOf(this.c);
            objArr[6] = Integer.valueOf(Arrays.hashCode(this.o));
            objArr[7] = Integer.valueOf(Arrays.deepHashCode(this.n));
            objArr[8] = Integer.valueOf(this.e);
            objArr[9] = Integer.valueOf(this.i);
            hhl hhlVar = this.j;
            objArr[10] = hhlVar != null ? hhq.l(hhlVar) : null;
            objArr[11] = Boolean.valueOf(this.r);
            icq icqVar = this.f;
            int i2 = -1;
            objArr[12] = Integer.valueOf(icqVar != null ? icqVar.ordinal() : -1);
            icr icrVar = this.d;
            if (icrVar != null) {
                i2 = icrVar.ordinal();
            }
            objArr[13] = Integer.valueOf(i2);
            objArr[14] = Float.valueOf(this.s);
            objArr[15] = Integer.valueOf(this.h);
            objArr[16] = Integer.valueOf(this.g);
            objArr[17] = Boolean.valueOf(this.k);
            objArr[18] = Boolean.valueOf(this.l);
            i = Arrays.hashCode(objArr);
            if (i == Integer.MAX_VALUE) {
                i = 2147483646;
            }
            this.v = i;
        }
        return i;
    }

    public final String toString() {
        lfa S = jdg.S(this);
        S.b("actionDefs", Arrays.toString(this.m));
        S.f("alpha", this.u);
        S.b("contentDescription", this.t);
        S.h("disableLiftToTap", this.k);
        S.h("enableSlideActionsInA11yMode", this.l);
        S.b("iconLocations", Arrays.toString(this.q));
        S.b("icons", Arrays.toString(this.p));
        S.b("id", jbi.h(this.c));
        S.b("labelLocations", Arrays.toString(this.o));
        S.b("labels", Arrays.toString(this.n));
        S.b("layoutId", jbi.h(this.e));
        S.f("longPressDelay", this.i);
        S.b("longPressDelayFlag", this.j);
        S.h("multiTouchEnabled", this.r);
        S.b("popupTiming", this.f);
        S.b("slideSensitivity", this.d);
        S.e("span", this.s);
        S.f("touchActionRepeatInterval", this.h);
        S.f("touchActionRepeatStartDelay", this.g);
        return S.toString();
    }

    public ict(ico icoVar) {
        ial[] ialVarArr;
        this.v = Integer.MAX_VALUE;
        this.w = Integer.MAX_VALUE;
        this.c = icoVar.a;
        ial[] ialVarArr2 = icoVar.c;
        if (ialVarArr2 == null) {
            int i = 0;
            for (ial ialVar : icoVar.b) {
                if (ialVar != null) {
                    i++;
                }
            }
            ialVarArr2 = new ial[i];
            int i2 = 0;
            for (ial ialVar2 : icoVar.b) {
                if (ialVar2 != null) {
                    ialVarArr2[i2] = ialVar2;
                    i2++;
                }
            }
        }
        this.m = ialVarArr2;
        Object[] objArr = icoVar.f;
        this.p = objArr == null ? icoVar.j.toArray() : objArr;
        int[] iArr = icoVar.g;
        this.q = iArr == null ? icoVar.k.e() : iArr;
        CharSequence[] charSequenceArr = icoVar.d;
        if (charSequenceArr == null) {
            List list = icoVar.l;
            charSequenceArr = (CharSequence[]) list.toArray(new CharSequence[list.size()]);
        }
        this.n = charSequenceArr;
        int[] iArr2 = icoVar.e;
        this.o = iArr2 == null ? icoVar.m.e() : iArr2;
        this.r = icoVar.q;
        this.e = icoVar.n;
        this.f = icoVar.r;
        this.g = icoVar.v;
        this.h = icoVar.u;
        this.i = icoVar.o;
        this.j = icoVar.p;
        this.d = icoVar.s;
        this.s = icoVar.t;
        this.u = icoVar.w;
        this.k = icoVar.x;
        this.l = icoVar.y;
        String str = icoVar.h;
        if (str != null) {
            this.t = icoVar.i != null ? str.concat(", ").concat(icoVar.i) : str;
        } else {
            this.t = null;
        }
    }
}
