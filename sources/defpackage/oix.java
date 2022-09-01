package defpackage;

/* compiled from: PG */
/* renamed from: oix  reason: default package */
/* loaded from: classes2.dex */
public final class oix {
    public static final oja a(okf okfVar) {
        return new oje(okfVar);
    }

    public static final ojc b(Object obj, Object obj2) {
        return new ojc(obj, obj2);
    }

    public static final void c(Object obj) {
        if (!(obj instanceof ojd)) {
            return;
        }
        throw ((ojd) obj).a;
    }

    public static final ous d(ovn ovnVar) {
        oll.e(ovnVar, "<this>");
        return new ovh(ovnVar);
    }

    public static final out e(ovp ovpVar) {
        oll.e(ovpVar, "<this>");
        return new ovj(ovpVar);
    }

    public static final ovn f() {
        return new ouq();
    }

    public static final ouu g(String str) {
        oll.e(str, "<this>");
        ouu ouuVar = new ouu(oli.i(str));
        ouuVar.d = str;
        return ouuVar;
    }

    public static int i(int i) {
        int[] iArr = {1, 2, 3, 4, 8, 9, 10, 11, 12, 13, 14};
        for (int i2 = 0; i2 < 11; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 0;
    }

    public static final boolean h(oup oupVar) {
        synchronized (oup.class) {
            if (oupVar.e) {
                oupVar.e = false;
                oup oupVar2 = oup.d;
                while (oupVar2 != null) {
                    oup oupVar3 = oupVar2.f;
                    if (oupVar3 == oupVar) {
                        oupVar2.f = oupVar.f;
                        oupVar.f = null;
                        return false;
                    }
                    oupVar2 = oupVar3;
                }
                return true;
            }
            return false;
        }
    }
}
