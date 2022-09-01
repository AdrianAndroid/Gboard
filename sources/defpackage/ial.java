package defpackage;

import android.os.Parcel;
import android.view.ViewDebug;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: ial  reason: default package */
/* loaded from: classes.dex */
public final class ial {
    public static final lug a = hin.a;
    public static final ial[] b = new ial[0];
    @ViewDebug.ExportedProperty
    public final iah c;
    public final iay[] d;
    @ViewDebug.ExportedProperty
    public final boolean e;
    @ViewDebug.ExportedProperty
    public final boolean f;
    @ViewDebug.ExportedProperty(resolveId = true)
    public final int g;
    @ViewDebug.ExportedProperty
    public final boolean h;
    @ViewDebug.ExportedProperty
    public final boolean i;
    @ViewDebug.ExportedProperty
    public final int j;
    @ViewDebug.ExportedProperty
    public final int k;
    @ViewDebug.ExportedProperty
    public final String l;
    public final String[] m;
    public final int[] n;
    private int o;
    private volatile int p;

    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object, android.os.Parcelable$Creator] */
    public ial(Parcel parcel, kns knsVar, byte[] bArr) {
        int readInt;
        this.o = Integer.MAX_VALUE;
        this.p = Integer.MAX_VALUE;
        iah iahVar = (iah) kki.B(parcel, iah.values());
        this.c = iahVar == null ? iah.PRESS : iahVar;
        Object[] objArr = iay.b;
        iay iayVar = iay.a;
        if (knsVar.b != null && (readInt = parcel.readInt()) > 0) {
            objArr = knsVar.a.newArray(readInt);
            for (int i = 0; i < readInt; i++) {
                Object e = knsVar.e(parcel);
                if (e == null) {
                    e = iayVar;
                }
                objArr[i] = e;
            }
        }
        this.d = (iay[]) objArr;
        this.e = kki.E(parcel);
        this.f = kki.E(parcel);
        this.h = kki.E(parcel);
        this.i = kki.E(parcel);
        this.g = parcel.readInt();
        String[] createStringArray = parcel.createStringArray();
        this.m = createStringArray == null ? gvw.g : createStringArray;
        int[] createIntArray = parcel.createIntArray();
        this.n = createIntArray == null ? gvw.b : createIntArray;
        this.j = parcel.readInt();
        this.k = parcel.readInt();
        this.l = parcel.readString();
        this.o = parcel.readInt();
        this.p = parcel.readInt();
        h();
    }

    public static iaj c() {
        return new iaj();
    }

    private final void h() {
        iay[] iayVarArr = this.d;
        String[] strArr = this.m;
        for (int i = 0; i < iayVarArr.length; i++) {
            Object obj = iayVarArr[i].e;
            String str = strArr[i];
            if (obj != null && obj.equals(str)) {
                strArr[i] = (String) obj;
            }
        }
    }

    public final int a() {
        String[] strArr;
        if (this.p == Integer.MAX_VALUE) {
            int i = 28;
            for (iay iayVar : this.d) {
                i += iayVar.a();
            }
            for (String str : this.m) {
                if (str != null) {
                    i += str.getBytes().length;
                }
            }
            int length = i + (this.n.length * 4);
            String str2 = this.l;
            if (str2 != null) {
                length += str2.getBytes().length;
            }
            this.p = length;
        }
        return this.p;
    }

    public final int b(int i) {
        if (i >= 0) {
            int[] iArr = this.n;
            if (i >= iArr.length) {
                return 0;
            }
            return iArr[i];
        }
        return 0;
    }

    public final iay d() {
        return this.d[0];
    }

    public final String e(int i) {
        if (i >= 0) {
            String[] strArr = this.m;
            if (i >= strArr.length) {
                return null;
            }
            return strArr[i];
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ial)) {
            return false;
        }
        ial ialVar = (ial) obj;
        return hashCode() == ialVar.hashCode() && this.e == ialVar.e && this.h == ialVar.h && this.j == ialVar.j && this.k == ialVar.k && this.i == ialVar.i && this.g == ialVar.g && this.f == ialVar.f && jdg.W(this.c, ialVar.c) && jdg.W(this.l, ialVar.l) && Arrays.equals(this.d, ialVar.d) && Arrays.equals(this.n, ialVar.n) && Arrays.equals(this.m, ialVar.m);
    }

    public final boolean f() {
        return (e(0) == null && b(0) == 0) ? false : true;
    }

    public final void g(iaj iajVar) {
        iajVar.k();
        iajVar.b = this.c;
        iajVar.c = this.d;
        iajVar.f = this.e;
        iajVar.g = this.f;
        iajVar.i = this.h;
        iajVar.j = this.i;
        iajVar.h = this.g;
        iajVar.d = this.m;
        iajVar.e = this.n;
        iajVar.k = this.j;
        iajVar.l = this.k;
        iajVar.m = this.l;
    }

    public final int hashCode() {
        int i = this.o;
        if (i == Integer.MAX_VALUE) {
            i = Arrays.hashCode(new Object[]{Integer.valueOf(this.c.ordinal()), Boolean.valueOf(this.e), Boolean.valueOf(this.h), Integer.valueOf(this.j), Integer.valueOf(Arrays.deepHashCode(this.d)), Integer.valueOf(this.k), Boolean.valueOf(this.i), Integer.valueOf(Arrays.hashCode(this.n)), Integer.valueOf(Arrays.deepHashCode(this.m)), Integer.valueOf(this.g), Boolean.valueOf(this.f), this.l});
            if (i == Integer.MAX_VALUE) {
                i = 2147483646;
            }
            this.o = i;
        }
        return i;
    }

    public final String toString() {
        lfa S = jdg.S(this);
        S.b("action", this.c);
        S.b("keyDatas", this.d);
        S.b("popupLabels", this.m);
        S.h("actionOnDown", this.e);
        S.h("alwaysShowPopup", this.h);
        S.h("playMediaEffect", this.i);
        S.f("iconBackgroundLevel", this.j);
        S.f("mergeInsertionIndex", this.k);
        S.b("popupLayoutId", jbi.h(this.g));
        S.h("repeatable", this.f);
        S.b("popupIcons", this.n);
        S.b("contentDescription", this.l);
        return S.toString();
    }

    public ial(iaj iajVar) {
        this.o = Integer.MAX_VALUE;
        this.p = Integer.MAX_VALUE;
        this.c = iajVar.b;
        iay[] iayVarArr = iajVar.c;
        this.d = iayVarArr;
        int a2 = iajVar.a();
        String[] strArr = iajVar.d;
        if (strArr.length != a2) {
            strArr = (String[]) Arrays.copyOf(strArr, a2);
            String[] strArr2 = iajVar.d;
            if (strArr2.length == 1) {
                Arrays.fill(strArr, strArr2[0]);
            }
        }
        this.m = strArr;
        int a3 = iajVar.a();
        int[] iArr = iajVar.e;
        if (iArr.length != a3) {
            iArr = Arrays.copyOf(iArr, a3);
            int[] iArr2 = iajVar.e;
            if (iArr2.length == 1) {
                Arrays.fill(iArr, iArr2[0]);
            }
        }
        this.n = iArr;
        this.e = iajVar.f;
        this.f = iajVar.g;
        this.g = iajVar.h;
        this.h = iajVar.i;
        this.i = iajVar.j;
        this.j = iajVar.k;
        this.k = iajVar.l;
        this.l = iajVar.m;
        int length = iayVarArr.length;
        if (length != strArr.length || length != iArr.length) {
            ((luc) a.a(hip.a).k("com/google/android/libraries/inputmethod/metadata/ActionDef", "<init>", 227, "ActionDef.java")).J("Must have the same number of key datas %d as popup labels %d and icons %d", Integer.valueOf(iayVarArr.length), Integer.valueOf(strArr.length), Integer.valueOf(iArr.length));
        } else {
            h();
        }
    }
}
